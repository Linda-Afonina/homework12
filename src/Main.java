public class Main {
    public static void main(String[] args) {

        System.out.println("Библиотека.");

        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book("\"Руслан и Людмила\"", author1, 1818);
        System.out.println("author1.getName() + author1.getSurname() = " + author1.getName() + " " + author1.getSurname());
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getYearOfPublishing() = " + book1.getYearOfPublishing());
        book1.setYearOfPublishing(2000);
        System.out.println("book1.getYearOfPublishing() после изменения = " + book1.getYearOfPublishing());

        Author author2 = new Author("Антон", "Чехов");
        Book book2 = new Book("\"Толстый и тонкий\"", author2, 1883);
        System.out.println("author2.getName() + author2.getSurname() = " + author2.getName() + " " + author2.getSurname());
        System.out.println("book2.getTitle() = " + book2.getTitle());
        System.out.println("book2.getYearOfPublishing() = " + book2.getYearOfPublishing());
        book2.setYearOfPublishing(1995);
        System.out.println("book2.getYearOfPublishing() после изменения = " + book2.getYearOfPublishing());

    }
}