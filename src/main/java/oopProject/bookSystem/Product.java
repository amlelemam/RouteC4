package oopProject.bookSystem;

public interface Product {
    public double bookPrice();
    public String bookName();
    public int bookID();
    public String bookAuthor();

    public int bookCreationYear();
    public boolean isAvailable();
}