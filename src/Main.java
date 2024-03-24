public class Main {
    public static void main(String[] args) {

        System.out.println("Библиотека.");

        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book("\"Руслан и Людмила\"", author1, 1818);
//        System.out.println("author1.getName() + author1.getSurname() = " + author1.getName() + " " + author1.getSurname());
//        System.out.println("book1.getTitle() = " + book1.getTitle());
//        System.out.println("book1.getYearOfPublishing() = " + book1.getYearOfPublishing());
        System.out.println("author1 = " + author1);
        System.out.println("book1 = " + book1);
        book1.setYearOfPublishing(2000);
        System.out.println("book1.getYearOfPublishing() после изменения = " + book1.getYearOfPublishing());

        Author author2 = new Author("Антон", "Чехов");
        Book book2 = new Book("\"Толстый и тонкий\"", author2, 1883);
//        System.out.println("author2.getName() + author2.getSurname() = " + author2.getName() + " " + author2.getSurname());
//        System.out.println("book2.getTitle() = " + book2.getTitle());
//        System.out.println("book2.getYearOfPublishing() = " + book2.getYearOfPublishing());
        System.out.println("author2 = " + author2);
        System.out.println("book2 = " + book2);
        book2.setYearOfPublishing(1995);
        System.out.println("book2.getYearOfPublishing() после изменения = " + book2.getYearOfPublishing());

        Author author3 = new Author("Александр", "Пушкин");
        Book book3 = new Book("\"Евгений Онегин\"", author3, 1833);
        Book book3Copy = new Book("\"Евгений Онегин\"", author3, 1833);
        System.out.println("author3 = " + author3);
        System.out.println("book3 = " + book3);
        System.out.println(author1.equals(author2));
        System.out.println(author3.equals(author1));
        System.out.println(book3Copy.equals(book3));
        System.out.println(book2.equals(book1));

        Author author4 = new Author("Алексей", "Пушкин");
        Book book4 = new Book("\"Евгений Онегин\"", author4, 1833);
        System.out.println(author4.equals(author3));
        System.out.println(book4.equals(book3));

    }
}