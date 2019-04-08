public class Store {
    // instance fields
    String productType;
    double price;
    int quantity;

    // constructor method
    public Store(String product, double initialPrice, int count) {
        productType = product;
        price = initialPrice;
        quantity = count;
    }

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public void itemSold(int soldCount){
        int newQuantity = quantity - soldCount;
        System.out.println("Items remaining equals " + newQuantity);
        quantity = newQuantity; 
    }

    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75, 50);
        Store cookieShop = new Store("Cookies", 5, 100);
        Store bookSeller = new Store("books", 5, 20);
        bookSeller.itemSold(3);
        lemonadeStand.greetCustomer("Jerome");
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
    }
}