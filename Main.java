import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Welcome to the book management application.");

    while (true){
      System.out.println("Press 1 if you want to add a book.");
      System.out.println("Press 2 if you want to remove a book.");
      System.out.println("Press 3 if you want to review list of books.");
      System.out.println("Press 4 if you want to exit application.");
      System.out.println();
      var userInput = scanner.nextLine();
      
      if(userInput.equals("1")){
            System.out.print("TITLE: ");
            var name = scanner.nextLine();
            System.out.print("AUTHOR: ");
            var author = scanner.nextLine();
            System.out.print("PAGES: ");
            var pages = scanner.nextLine();
            System.out.print("COVER TYPE: ");
            var cover = scanner.nextLine();
            var book = new Book(name, author, pages, cover);
            BookManager.addBook(book);
            System.out.println();
      } else if (userInput.equals("2")){
            BookManager.showBookList();
            System.out.println("Enter title of the book you want to delete:");
            var title = scanner.nextLine();
            BookManager.removeBook(title);
            System.out.println();
      } else if (userInput.equals("3")){
            BookManager.showBookList();
            System.out.println();
      } else if (userInput.equals("4")) {
            System.out.println("See you next time! Goodbye!");
            break;
      }
    }
    scanner.close();
  }


}
