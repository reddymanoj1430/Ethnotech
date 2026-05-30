package Oops;

abstract class Foodorder {
    String customerName;
    int quantity;
    double price;

    Foodorder(String name, int quantity, double price) {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderFood();

    void generateBill() {
        double total = quantity * price;

        System.out.println("\n----- BILL -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price per Item: " + price);
        System.out.println("Total Bill    : " + total);
    }
}

class PizzaOrder extends Foodorder {
    PizzaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderFood() {
        System.out.println("You have ordered a Pizza.");
        System.out.println("Ordering food...");
    }

    @Override
    void generateBill() {
        double total = quantity * price;
        double discount = total * 0.30; // 30% discount
        double finalBill = total - discount;
        super.generateBill();
        System.out.println("Total Bill    : " + total);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Bill    : " + finalBill);
        System.out.println("------ Thank You For Visiting ------");
    }
}

public class Abst {
    public static void main(String[] args) {

        PizzaOrder pizzaOrder = new PizzaOrder("Manoj", 3, 250.0);

        pizzaOrder.orderFood();
        pizzaOrder.generateBill();
    }
}