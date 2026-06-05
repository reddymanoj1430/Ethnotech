package Collection;
import java.util.Scanner;

class Post {
    String content;
    Post prev;
    Post next;

    Post(String content) {
        this.content = content;
        prev = null;
        next = null;
    }
}

class SocialMediaFeed {
    Post head;
    Post tail;
    Post current;

    // Add normal post
    public void addPost(String content) {
        Post newPost = new Post(content);

        if (head == null) {
            head = tail = current = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }
    }

    // Insert sponsored post at beginning
    public void addSponsoredPost(String content) {
        Post sponsored = new Post("[SPONSORED] " + content);

        if (head == null) {
            head = tail = current = sponsored;
        } else {
            sponsored.next = head;
            head.prev = sponsored;
            head = sponsored;
        }

        System.out.println("Sponsored post inserted.");
    }

    // Move to next post
    public void nextPost() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Current Post: " + current.content);
        } else {
            System.out.println("No next post available.");
        }
    }

    // Move to previous post
    public void previousPost() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current Post: " + current.content);
        } else {
            System.out.println("No previous post available.");
        }
    }

    // Delete current post
    public void deleteCurrentPost() {
        if (current == null) {
            System.out.println("No post to delete.");
            return;
        }

        System.out.println("Deleted Post: " + current.content);

        if (head == tail) {
            head = tail = current = null;
            return;
        }

        if (current == head) {
            head = head.next;
            head.prev = null;
            current = head;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
            current = tail;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = current.next;
        }
    }

    // Show current post
    public void showCurrentPost() {
        if (current == null) {
            System.out.println("Feed is empty.");
        } else {
            System.out.println("Current Post: " + current.content);
        }
    }

    // Display all posts
    public void displayFeed() {
        if (head == null) {
            System.out.println("Feed is empty.");
            return;
        }

        Post temp = head;

        System.out.println("\n----- FEED -----");
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
        System.out.println("----------------\n");
    }
}

public class SocialMediaAppsinglelinked {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SocialMediaFeed feed = new SocialMediaFeed();

        int choice;

        do {
            System.out.println("\n===== SOCIAL MEDIA FEED =====");
            System.out.println("1. Add Post");
            System.out.println("2. Add Sponsored Post");
            System.out.println("3. Next Post");
            System.out.println("4. Previous Post");
            System.out.println("5. Delete Current Post");
            System.out.println("6. Show Current Post");
            System.out.println("7. Display Feed");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter post content: ");
                    String post = sc.nextLine();
                    feed.addPost(post);
                    break;

                case 2:
                    System.out.print("Enter sponsored content: ");
                    String sponsored = sc.nextLine();
                    feed.addSponsoredPost(sponsored);
                    break;

                case 3:
                    feed.nextPost();
                    break;

                case 4:
                    feed.previousPost();
                    break;

                case 5:
                    feed.deleteCurrentPost();
                    break;

                case 6:
                    feed.showCurrentPost();
                    break;

                case 7:
                    feed.displayFeed();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}