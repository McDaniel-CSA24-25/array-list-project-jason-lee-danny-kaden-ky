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
    public Book(String t, String a, boolean i, int n){
        title = t;
        author = a;
        isAvailable = i;
        timesCheckedOut = n;
        library.add(this);
    }
    public static void display(){
        if(library.size() > 0) {
            for (Book book : library) {
                if (book.isAvailable) {
                    System.out.print(book.title + " " + book.author);
                }
            }
        }
        else{
            System.out.println("No available books.");
        }
    }
    public void checkIn(Book book){
        if(!book.isAvailable) {
            book.isAvailable = true;
        }
        else{
            System.out.println("This is already checked in.");
        }
    }
    public void checkOut(Book book) {
        if (book.isAvailable){
            book.isAvailable = false;
            book.timesCheckedOut++;
        }
        else{
            System.out.println("This is already checked out.");
        }
    }
}
