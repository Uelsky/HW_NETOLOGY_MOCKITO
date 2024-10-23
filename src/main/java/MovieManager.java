public class MovieManager {
    private Movie[] collection = new Movie[0];
    private int countFindLast;


    public MovieManager(int countFindLast) {
        this.countFindLast = countFindLast;
    }

    public MovieManager() {
        this.countFindLast = 5;
    }

    public int getCountFindLast() {
        return countFindLast;
    }

    public void setCountFindLast(int countFindLast) {
        this.countFindLast = countFindLast;
    }

    public Movie[] findAll() {
        return collection;
    }

    public void setCollection(Movie[] collection) {
        this.collection = collection;
    }

    public void add(Movie item) {
        Movie[] tmp = new Movie[this.findAll().length + 1];
        for (int i = 0; i < this.findAll().length; i++) {
            tmp[i] = this.findAll()[i];
        }
        tmp[tmp.length - 1] = item;
        this.setCollection(tmp);
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
