package assignmentone;

// import org.checkerframework.checker.units.qual.A;

/**
 * new class.
 */

public class Band {

  private String name;
  private int yearFormad;
  private int numAlbums;
  private Album[] albums;

  /**
   * Band.
   */

  public Band(String name, int yearFormad) {
    this.name = name;
    this.yearFormad = yearFormad;
    this.albums = new Album[4];
    this.numAlbums = 0;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return yearFormad;
  }

  /**
   * adding albums.
   */

  public void addAlbum(String titel, int year) {
    if (numAlbums == albums.length) {
      System.out.print("Cannot add more albums. Max capacity reached.");
    }
    Album album = new Album(titel, year, this.name);
    albums[numAlbums] = album;
    numAlbums++;
  }

  /**
   * copy of array.
   */
  public Album[] getAlbums() {
    Album[] copyAlbum = new Album[4];
    
    for (int i = 0; i < albums.length; i++) {
      copyAlbum[i] = albums[i];
    }
    return copyAlbum;
  }

  // public int getAlbums() {
  // return numAlbums;
  // }

  /**
   * oldest album.
   */

  public Album getOldestAlbum() {
    if (numAlbums == 0) {
      System.out.print("No albums to search.");
    }
    Album oldestAlbum = albums[0];
    for (int i = 1; i < numAlbums; i++) {
      if (albums[i].getYear() < oldestAlbum.getYear()) {
        oldestAlbum = albums[i];
      }
    }
    return oldestAlbum;
  }
}
