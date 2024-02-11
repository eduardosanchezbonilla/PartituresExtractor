import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Optional;
import java.util.stream.Stream;
import java.io.IOException;

public class Main {
    //private static final String ORIGIN_FOLDER = "G:\\Mi unidad\\Banda\\Partituras\\1. REPERTORIO ACTUAL";
    //private static final String DESTINATION_FOLDER = "G:\\Mi unidad\\Banda\\Partituras\\6. PARTITURAS POR VOCES";

    private static final String ORIGIN_FOLDER = "C:\\Users\\eduar\\OneDrive\\Escritorio\\Temporal\\1. REPERTORIO ACTUAL";
    private static final String DESTINATION_FOLDER = "C:\\Users\\eduar\\OneDrive\\Escritorio\\Temporal\\6. PARTITURAS POR VOCES";

    //private static final String ORIGIN_FOLDER = "C:\\Users\\eduar\\OneDrive\\Escritorio\\Temporal\\2. REPERTORIO NAVIDAD";
    //private static final String DESTINATION_FOLDER = "C:\\Users\\eduar\\OneDrive\\Escritorio\\Temporal\\7. PARTITURAS POR VOCES NAVIDAD";

    public static void main(String[] args) throws IOException {
        // Cambia esta ruta al directorio que contiene las partituras en tu computadora
        Path partiturasDirectorio = Paths.get(ORIGIN_FOLDER);

        // eliminamos y creamos el directorio de destino
        deleteDirectory(DESTINATION_FOLDER);
        createDirectory(DESTINATION_FOLDER);

        // Usa un try-with-resources para cerrar automáticamente el stream de directorios
        try (Stream<Path> directoriosStream = Files.list(partiturasDirectorio)) {
            directoriosStream.filter(Files::isDirectory).forEach(subdirectorio -> {
                String marchName = subdirectorio.getFileName().toString();

                // Usa un try-with-resources para cerrar automáticamente el stream de archivos
                try (Stream<Path> archivosStream = Files.list(subdirectorio)) {
                    archivosStream.filter(file->Files.isRegularFile(file)
                            && file.getFileName().toString().toLowerCase().contains(".pdf")
                    ).forEach(archivo -> {
                        // Comprueba si el nombre del archivo coincide con el patrón deseado (1CORNETA, 2CORNETA, etc.)
                        String partituraName = archivo.getFileName().toString();

                        for(FiltersVoice voice:Voices.VOICES){
                            Optional<PartitureData> partitureData = getPartitureDataVoice(
                                    voice,
                                    marchName,
                                    partituraName);

                            if(partitureData.isPresent()){
                                copiarYRenombrarArchivo(archivo, partitureData.get());
                            }
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    private static Optional<PartitureData> getPartitureDataVoice(FiltersVoice voice,
                                                                 String marchName,
                                                                 String partitureName){
        if(passFilers(partitureName,voice)){
            return Optional.of(
                    new PartitureData(
                            DESTINATION_FOLDER + voice.getDestinationDirectory() + "/" + voice.getVoice(),
                            getDestinationMarchName(marchName,partitureName)
                    )
            );
        }
        return Optional.empty();
    }

    private static String getDestinationMarchName(String marchName,
                                                  String partitureName){
        if(partitureName.contains("(")){
            return marchName + partitureName.substring(partitureName.indexOf("("));
        }
        else{
            return marchName + ".pdf";
        }
    }

    private static Boolean passFilers(String partituraName,
                                      FiltersVoice filters
    ){
        // para pasar los filtros tiene que cumplir todos los includes,
        // si algun exclude se cumple ya no pasara el filtro

        // includes
        Boolean passIncludes = filters.getIncludeFilters().stream().allMatch(partituraName::contains);

        // excludes
        Boolean passExcludes = filters.getExcludeFilters().stream().anyMatch(partituraName::contains);

        return Boolean.TRUE.equals(passIncludes) && Boolean.FALSE.equals(passExcludes);
    }

    private static void copiarYRenombrarArchivo(Path archivo, PartitureData partitureData) {
        //String original = archivo.getFileName().toString();
        Path destino = Paths.get(partitureData.getFolder()+"/"+partitureData.getName());

        try {
            createDirectory(partitureData.getFolder());
            Files.copy(archivo, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void createDirectory(String directory){
        Path rutaDirectorio = Paths.get(directory);
        // Crea el directorio si no existe
        try {
            if (!Files.exists(rutaDirectorio)) {
                Files.createDirectories(rutaDirectorio);
            }
        } catch (IOException e) {
            System.err.println("Error al crear el directorio: " + e.getMessage());
        }
    }

    public static void deleteDirectory(String directoryStr) throws IOException {
        Path directory = Paths.get(directoryStr);

        if (Files.exists(directory)) {

            Files.walkFileTree(directory, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);
                    return FileVisitResult.CONTINUE;
                }
            });
        }
    }
}