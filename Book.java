import java.util.ArrayList;
public class Book {
    private final String title;
    private final String author;
    private boolean isAvailable;
    private int timesCheckedOut;
    private static ArrayList<Book> library = new ArrayList<>();
    public Book(){
        title = "None";
        author = "None";
        isAvailable = true;
        timesCheckedOut = 0;
        library.add(this);
    }
    public Book(String t, String a){
        title = t;
        author = a;
        isAvailable = true;
        timesCheckedOut = 0;
        library.add(this);
    }
    public static void display(){
        if(library.size() > 0) {
            System.out.println("Available book(s): ");
            for (Book book : library) {
                if (book.isAvailable) {
                    System.out.println(book.title + " by " + book.author);
                }
            }
        }
        else{
            System.out.println("No available books.");
        }
    }
    public void checkIn(){
        if(!isAvailable) {
            isAvailable = true;
        }
        else{
            System.out.println("This is already checked in.");
        }
    }
    public void checkOut() {
        if (isAvailable){
            isAvailable = false;
            timesCheckedOut++;
        }
        else{
            System.out.println("This is already checked out.");
        }
    }
    public static void main(String[] args){
        Book book1 = new Book("The Cat in the Hat", "Dr. Suess");
        Book book2 = new Book("The Giving Tree", "Shel Silverstein");
        Book book3 = new Book("Lord of the Flies", "William Golding");
        book1.checkOut();
        book3.checkOut();
        display();
        book3.checkIn();
        display();
    }
}
