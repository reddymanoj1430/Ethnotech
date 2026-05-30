package Task1;
import java.util.Scanner;

// Parent Class
class Food {
    String name;
    int price;

    Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void showFood() {
        System.out.println(name + " - Rs." + price);
    }
}

// Child Class
class FoodOrder extends Food {

    FoodOrder(String name, int price) {
        super(name, price);
    }

    // Polymorphism
    @Override
    void showFood() {
        System.out.println(name + " : Rs." + price);
    }
}

public class FoodOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodOrder[] menu = {
            new FoodOrder("Burger", 100),
            new FoodOrder("Pizza", 200),
            new FoodOrder("Fries", 80),
            new FoodOrder("Sandwich", 90),
            new FoodOrder("Pasta", 150),
            new FoodOrder("Noodles", 120),
            new FoodOrder("Rice", 130),
            new FoodOrder("Coffee", 50),
            new FoodOrder("IceCream", 70),
            new FoodOrder("Momos", 110)
        };

        int totalAmount = 0;
        int totalQuantity = 0;
        char choice;

        System.out.println("===== FOOD MENU =====");

        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + ". ");
            menu[i].showFood();
        }

        do {
            System.out.print("\nEnter Item Number: ");
            int item = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            int amount = menu[item - 1].price * qty;

            totalAmount += amount;
            totalQuantity += qty;

            System.out.println("Added: " + menu[item - 1].name +
                    " x " + qty + " = Rs." + amount);

            System.out.print("Do you want to order more? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        double discount = 0;

        if (totalQuantity >= 10) {
            discount = totalAmount * 0.20;
        } else if (totalQuantity >= 5) {
            discount = totalAmount * 0.10;
        }

        double finalBill = totalAmount - discount;

        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Quantity : " + totalQuantity);
        System.out.println("Total Amount   : Rs." + totalAmount);
        System.out.println("Discount       : Rs." + discount);
        System.out.println("Payable Amount : Rs." + finalBill);
        System.out.println("======================");
        
    }
}