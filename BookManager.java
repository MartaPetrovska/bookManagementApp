import java.util.ArrayList;

public class BookManager {
  public static ArrayList<Book> books = new ArrayList<Book>();

  public static void addBook(Book book){
    books.add(book);
    System.out.println("Book '" + book.title + "' added.");
  }

  public static void removeBook(String booksTitle) {
    books.removeIf(book -> book.title.equals(booksTitle));
    System.out.println("Book '" + booksTitle + "' removed");
  }

  public static void showBookList(){
    System.out.println("List of books:");
        for(var book : books){
            System.out.println("Name: " + book.title + ", author: " + book.author + ", pages: " + book.pages + ", cover: " + book.cover);
        }
  }

}
