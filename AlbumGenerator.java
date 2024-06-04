package assignmentone;

// import java.lang.reflect.Array;

/**
 * task 4.
 */

public class AlbumGenerator {

  /**
   * return albums.
   */
  public Album[] generateAlbums() {
    Album[] albums = new Album[4];
    albums[0] = new Album("Dark side of the Moon ", 1973, " Pink Floyd");
    albums[1] = new Album("Wish you were here ", 1975, " Pink Floyd");
    albums[2] = new Album("Animals ", 1977, " Pink Floyd");
    albums[3] = new Album("The wall ", 1979, " Pink Floyd");

    return albums;
  }
}
