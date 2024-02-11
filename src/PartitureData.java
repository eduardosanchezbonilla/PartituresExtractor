import java.util.List;

public class PartitureData {

    private String folder;

    private String name;

    public PartitureData(String folder, String name) {
        this.folder = folder;
        this.name = name;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
