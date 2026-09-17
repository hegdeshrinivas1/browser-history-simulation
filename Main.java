
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n================================");
            System.out.println("     BROWSER HISTORY SYSTEM");
            System.out.println("================================");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Show History");
            System.out.println("6. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            // Validate numeric input
            if (!scanner.hasNextInt()) {
                System.out.println(
                        "Invalid input! Please enter a number from 1 to 6."
                );
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine().trim();

                    if (url.isEmpty()) {
                        System.out.println("URL cannot be empty.");
                    } else {
                        browser.visitPage(url);
                    }
                    break;

                case 2:
                    browser.goBack();
                    break;

                case 3:
                    browser.goForward();
                    break;

                case 4:
                    browser.showCurrentPage();
                    break;

                case 5:
                    browser.showHistory();
                    break;

                case 6:
                    System.out.println("Exiting Browser History System...");
                    scanner.close();
                    return;

                default:
                    System.out.println(
                            "Invalid choice! Please enter a number from 1 to 6."
                    );
            }
        }
    }
}
