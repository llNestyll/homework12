public class Book {
    private String title;
    private int year;
    private Author nameOfAuthor;
    public Book(String title, int year, Author nameOfAuthor) {
        this.title = title;
        this.year = year;
        this.nameOfAuthor = nameOfAuthor;
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }
    public String getNameOfAuthor() {
        return this.nameOfAuthor.getName() + " " + this.nameOfAuthor.getLastname();
    }
    public void setYear(int year) {
        this.year = year;
    }
}


