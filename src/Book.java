import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private int totalPages;
    private int currentPages;

    public Book(String title, String author, int totalPages, int currentPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPages = currentPages;
    }

    public void readPages(int pagesRead){
        if (currentPages + pagesRead <= totalPages){
            currentPages += pagesRead;
            System.out.println("You read " + pagesRead + "pages.");
        } else {
            currentPages = totalPages;
            System.out.println("You've finished the book!");
        }
    }

    public void displayBookInfo(){
        System.out.println("Title of book: " + title + "author of book :" + author);
        System.out.println("Pages left to read: " + (totalPages - currentPages));
    }

}
