public class Store {
    // declare instance fields here!
    String productType;
    // constructor method
    public Store(String product) {
        productType = product;
        System.out.println("I am inside the constructor method.");
    }

    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        Store lemonadeStand = new Store("lemonade");
        System.out.println(lemonadeStand.productType);
    }
}

