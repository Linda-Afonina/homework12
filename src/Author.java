public class Author {

    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return "Автор " + name + " " + surname;
    }

    @Override
    public boolean equals(Object otherAuthor) {
        if (otherAuthor == null || this.getClass() != otherAuthor.getClass()) {
        return false;
        }
        Author author = (Author) otherAuthor;
        return surname.equals(author.surname) && name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname, name);
    }



}
