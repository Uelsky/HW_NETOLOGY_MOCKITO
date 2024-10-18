import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    Movie movie = new Movie("The Avengers", 2012, "Joseph Hill Whedon");

    @Test
    public void testGetItems() {

        Assertions.assertEquals("The Avengers", movie.getTitle());
        Assertions.assertEquals(2012, movie.getRelease());
        Assertions.assertEquals("Joseph Hill Whedon", movie.getDirector());
    }

    @Test
    public void testSetItems() {
        movie.setTitle("Iron Man");
        movie.setRelease(2008);
        movie.setDirector("Jonathan Favreau");

        Assertions.assertEquals("Iron Man", movie.getTitle());
        Assertions.assertEquals(2008, movie.getRelease());
        Assertions.assertEquals("Jonathan Favreau", movie.getDirector());
    }
}
