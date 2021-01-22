
public class Book implements Comparable<Book> {
    private String name;
    private int ageRec;

    public Book(String name, int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }

    public String getName() {
        return name;
    }

    public int getAgeRec() {
        return ageRec;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRec + " year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        return this.ageRec - o.getAgeRec();
    }
}
