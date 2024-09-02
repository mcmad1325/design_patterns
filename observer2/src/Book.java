public class Book {
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
