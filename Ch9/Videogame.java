public class Videogame 
{
    // Data Fields
    private String title;
    private String releaseDate;
    private String platform;
    private int copiesSold;

    // Constructor
    public Videogame(String title, String release, int copies, String plat) 
    {
        this.title = title;
        this.releaseDate = release;
        this.copiesSold = copies;
        this.platform = plat;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String release) {
        this.releaseDate = release;
    }

    @Override
    public String toString()
    {
      return "Title: " + this.title + "\nRelease Date: " + this.releaseDate + 
         "Copies Sold: " + this.copiesSold;
    }
}
