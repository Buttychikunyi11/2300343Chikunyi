import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. List Items");
            System.out.println("4. Find Item by Title");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addItem(new Book(bookId, bookTitle, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String magazineId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String magazineTitle = scanner.nextLine();
                    System.out.print("Enter Issue Date: ");
                    String issueDate = scanner.nextLine();
                    library.addItem(new Magazine(magazineId, magazineTitle, issueDate));
                    break;

                case 3:
                    library.listItems();
                    break;

                case 4:
                    System.out.print("Enter Title to search: ");
                    String searchTitle = scanner.nextLine();
                    LibraryItem foundItem = library.findItemByTitle(searchTitle);
                    if (foundItem != null) {
                        System.out.println(foundItem.getDetails());
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}