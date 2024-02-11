import java.util.List;

public class FiltersVoice {
    private String voice;
    private String destinationDirectory;
    private List<String> includeFilters;
    private List<String> excludeFilters;

    public FiltersVoice(String voice, String destinationDirectory, List<String> includeFilters, List<String> excludeFilters) {
        this.voice = voice;
        this.destinationDirectory = destinationDirectory;
        this.includeFilters = includeFilters;
        this.excludeFilters = excludeFilters;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getDestinationDirectory() {
        return destinationDirectory;
    }

    public void setDestinationDirectory(String destinationDirectory) {
        this.destinationDirectory = destinationDirectory;
    }

    public List<String> getIncludeFilters() {
        return includeFilters;
    }

    public void setIncludeFilters(List<String> includeFilters) {
        this.includeFilters = includeFilters;
    }

    public List<String> getExcludeFilters() {
        return excludeFilters;
    }

    public void setExcludeFilters(List<String> excludeFilters) {
        this.excludeFilters = excludeFilters;
    }
}
