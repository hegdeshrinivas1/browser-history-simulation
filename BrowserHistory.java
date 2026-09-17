import java.util.LinkedList;
import java.util.ListIterator;

public class BrowserHistory {

    private final LinkedList<String> history = new LinkedList<>();
    private final ListIterator<String> iterator = history.listIterator();

    private String currentPage;

    // Visit a new page
    public void visitPage(String url) {

        // Remove forward history
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        iterator.add(url);
        currentPage = url;

        System.out.println("Visited: " + url);
    }

    // Go to previous page
    public void goBack() {

        if (iterator.hasPrevious()) {
            currentPage = iterator.previous();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No previous page exists.");
        }
    }

    // Go to next page
    public void goForward() {

        if (iterator.hasNext()) {
            currentPage = iterator.next();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No forward page exists.");
        }
    }

    // Display current page
    public void showCurrentPage() {

        if (currentPage == null) {
            System.out.println("No page visited yet.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    // Display complete history
    public void showHistory() {

        if (history.isEmpty()) {
            System.out.println("Browser history is empty.");
            return;
        }

        System.out.println("\n----- Browser History -----");

        for (String page : history) {
            System.out.println(page);
        }
    }
}

