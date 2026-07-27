package oopProject.bookSystem;

public class Customer {
    public static void main(String[] args) {
        Book book = new Book();

        book.BookSearch(8.6,"Rich Dad","Jhon",5000,2000);
        book.BookSearch(10.99 , "Java Programming" , "John Doe" , 12345 , 1998);
        book.bookFiltration(500);
    }
}
