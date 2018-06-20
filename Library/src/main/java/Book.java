public class Book {

    private String title;
    private String author;
    private String gender;

    public Book(String title, String author, String gender) {
        this.title = title;
        this.author = author;
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }
}
