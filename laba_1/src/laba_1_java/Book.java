package laba_1_java;

public class Book {
    private String name;
    private String author;
    private int pages;
    private int price;

    protected String genre;
    protected double rating;

    private static int countBook;

    public Book(String name, String author, int pages, int price, String genre, double rating) {
        resetValues(name, author, pages, price, genre, rating);
        countBook++;
    }

    public Book(String name, String author, int pages, int price){
        this(name, author, pages, price, null, 0);
    }

    public Book() {
        this(null, null, 0, 0, null, 0.0);
    }

    public void resetValues(String name, String author, int pages, int price, String genre, double rating) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.genre = genre;
        this.rating = rating;
    }

    public static void printStaticCountBook() {
        System.out.print(countBook);
    }
    public void printCountBook() {
        System.out.print(countBook);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Book: name = " + getName() + ", author = " + getAuthor() + ", pages= " + getPages() + ", price " +
                getPrice() + ", genre = " + getGenre() + ", rating = " + getRating() + "]";

    }
}