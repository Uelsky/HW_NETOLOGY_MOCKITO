import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    Movie item1 = new Movie("The Avengers", 2012, "Joseph Hill Whedon");
    Movie item2 = new Movie("Iron Man", 2008, "Jonathan Favreau");
    Movie item3 = new Movie("Iron Man 2", 2010, "Jonathan Favreau");
    Movie item4 = new Movie("Iron Man 3", 2013, "Shane Black");
    Movie item5 = new Movie("Thor", 2011, "Kenneth Branagh");
    Movie item6 = new Movie("Thor: The Dark World", 2013, "Alan Taylor");
    Movie item7 = new Movie("Thor: Ragnarok", 2017, "Taika Waititi");
    Movie item8 = new Movie("Eternals", 2021, "Chloé Zhao");

    Movie[] movielist = {
            item1, item2, item3, item4,
            item5, item6, item7, item8
    };

    @Test
    public void testFunctionalWithEmptyConstructor() {
        MovieManager manager = new MovieManager();

        for (Movie item : movielist) {
            manager.add(item);
        }

        Assertions.assertEquals(8, manager.findAll().length);
        Assertions.assertArrayEquals(new Movie[]{
                item1, item2, item3, item4,
                item5, item6, item7, item8
        }, manager.findAll());

        Assertions.assertEquals(5, manager.findLast().length);
        Assertions.assertArrayEquals(new Movie[]{
                item8, item7, item6, item5, item4
        }, manager.findLast());
    }

    @Test
    public void testFunctionalWithParamConstructor() {
        MovieManager manager1 = new MovieManager(10);
        MovieManager manager2 = new MovieManager(3);

        for (Movie item : movielist) {
            manager1.add(item);
        }

        for (Movie item : movielist) {
            manager2.add(item);
        }

        Assertions.assertEquals(8, manager1.findAll().length);
        Assertions.assertArrayEquals(new Movie[]{
                item1, item2, item3, item4,
                item5, item6, item7, item8
        }, manager1.findAll());

        Assertions.assertEquals(8, manager1.findLast().length);
        Assertions.assertArrayEquals(new Movie[]{
                item8, item7, item6, item5,
                item4, item3, item2, item1
        }, manager1.findLast());

        Assertions.assertEquals(8, manager2.findAll().length);
        Assertions.assertArrayEquals(new Movie[]{
                item1, item2, item3, item4,
                item5, item6, item7, item8
        }, manager2.findAll());

        Assertions.assertEquals(3, manager2.findLast().length);
        Assertions.assertArrayEquals(new Movie[]{
                item8, item7, item6
        }, manager2.findLast());
    }
}
