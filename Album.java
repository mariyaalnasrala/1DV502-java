package assignmentone;

/**
 * Class album.
 */
public class Album {

  private String name;
  private int releaseYear;
  private String artist;
  private String title;

  /**
   * comment.
   */

  public Album(String name, int releaseYear, String artist) {
    setName(name);
    setYear(releaseYear);
    setArtist(artist);
    setTitle(title);

  }

  /**
   * set name.
   */

  public void setName(String name) {
    if (name == null || name.length() < 4) {
      this.name = "No name";
    } else {
      this.name = name;
    }
  }

  public String getName() {
    return name;
  }

  /**
   * set release year.
   */

  public void setYear(int releaseYear) {
    if (releaseYear > 1800 && releaseYear < 2029) {
      this.releaseYear = releaseYear;
    } else {
      this.releaseYear = -1;
    }
  }

  public int getYear() {
    return releaseYear;
  }

  /**
   * set artist.
   */

  public void setArtist(String artist) {
    if (artist == null || artist.length() < 4) {
      this.artist = "No artist";
    } else {
      this.artist = artist;
    }
  }

  public String getArtist() {
    return artist;
  }

  /**
   * set title.
   */

  public void setTitle(String title) {
    if (title == null || title.length() < 4) {
      this.title = "The Piper at the Gates of Dawn";

    } else {
      this.title = title;
    }
  }

  public String getTitle() {
    return title;
  }
}
