import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    Movie movie = new Movie("The Avengers", 2012, "Joseph Hill Whedon");

    @Test
    public void testGetTitle() {

        Assertions.assertEquals("The Avengers", movie.getTitle());
    }

    @Test
    public void testGetRelease() {

        Assertions.assertEquals(2012, movie.getRelease());
    }

    @Test
    public void testGetDirector() {

        Assertions.assertEquals("Joseph Hill Whedon", movie.getDirector());
    }

    @Test
    public void testSetTitle() {
        movie.setTitle("Iron Man");

        Assertions.assertEquals("Iron Man", movie.getTitle());
    }

    @Test
    public  void testSetRelease() {
        movie.setRelease(2008);

        Assertions.assertEquals(2008, movie.getRelease());
    }

    @Test
    public void testSetDirector() {
        movie.setDirector("Jonathan Favreau");

        Assertions.assertEquals("Jonathan Favreau", movie.getDirector());
    }
}
