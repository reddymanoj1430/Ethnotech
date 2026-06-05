package Collection;

import java.util.Scanner;

class Page1 {
    String url;
    Page1 next;
    Page1 prev;

    Page1(String url) {
        this.url = url;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory1 {
    Page1 head;
    Page1 tail;

    // Visit New Page
    public void visitPage(String url) {
        Page1 newPage = new Page1(url);

        if (head == null) {
            head = tail = newPage;
        } else {
            tail.next = newPage;
            newPage.prev = tail;
            tail = newPage;
        }

        System.out.println("Page Visited Successfully!");
    }

    // Display Browsing History
    public void displayHistory() {
        if (head == null) {
            System.out.println("No Browsing History Found!");
            return;
        }

        Page1 temp = head;

        System.out.println("\n===== BROWSING HISTORY =====");

        while (temp != null) {
            System.out.println(temp.url);
            temp = temp.next;
        }
    }

    // Search Page
    public void searchPage(String url) {
        Page1 temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.url.equalsIgnoreCase(url)) {
                System.out.println("Page Found at Position: " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Page Not Found!");
    }

    // Delete Page
    public void deletePage(String url) {
        if (head == null) {
            System.out.println("History is Empty!");
            return;
        }

        Page1 temp = head;

        while (temp != null) {

            if (temp.url.equalsIgnoreCase(url)) {

                // Single Node
                if (head == tail) {
                    head = tail = null;
                }

                // First Node
                else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                }

                // Last Node
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }

                // Middle Node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Page Deleted Successfully!");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Page Not Found!");
    }

    // Count Total Pages
    public void countPages() {
        int count = 0;
        Page1 temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Visited Pages: " + count);
    }
}

public class BrowserHistorySystem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserHistory1 history = new BrowserHistory1();

        int choice;

        do {
            System.out.println("\n===== BROWSER HISTORY MENU =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Display Browsing History");
            System.out.println("3. Search Page");
            System.out.println("4. Delete Page");
            System.out.println("5. Count Total Pages");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Page URL: ");
                    String url = sc.nextLine();
                    history.visitPage(url);
                    break;

                case 2:
                    history.displayHistory();
                    break;

                case 3:
                    System.out.print("Enter Page URL to Search: ");
                    String searchUrl = sc.nextLine();
                    history.searchPage(searchUrl);
                    break;

                case 4:
                    System.out.print("Enter Page URL to Delete: ");
                    String deleteUrl = sc.nextLine();
                    history.deletePage(deleteUrl);
                    break;

                case 5:
                    history.countPages();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}