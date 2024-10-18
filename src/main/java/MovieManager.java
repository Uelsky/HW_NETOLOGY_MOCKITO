public class MovieManager {
    private Movie[] collection = new Movie[0];
    public int countFindLast;

    public MovieManager(int countFindLast) {
        this.countFindLast = countFindLast;
    }

    public MovieManager() {
        this.countFindLast = 5;
    }

    public void add(Movie item) {
        Movie[] tmp = new Movie[collection.length + 1];
        for (int i = 0; i < collection.length; i++) {
            tmp[i] = collection[i];
        }
        tmp[tmp.length - 1] = item;
        collection = tmp;
    }

    public Movie[] findAll() {
        return collection;
    }

    public Movie[] findLast() {
        if (countFindLast <= collection.length) {
            Movie[] stdout = new Movie[countFindLast];
            for (int i = 0; i < countFindLast; i++) {
                stdout[i] = collection[collection.length - 1 - i];
            }
            return stdout;
        } else {
            int selfCount = collection.length;
            Movie[] stdout = new Movie[selfCount];
            for (int i = 0; i < selfCount; i++) {
                stdout[i] = collection[collection.length - 1 - i];
            }
            return stdout;
        }
    }
}
