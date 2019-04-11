public class Booleans {
    public static void main(String[] args){
        // false statements
        System.out.println(23 >= 14 && 23 >= 25);
        System.out.println(!(1 < 8 || (5 > 2 && 3 < 5)));
        System.out.println(!(4 <= 10));

        // true statements
        System.out.println(23 >= 14 || 23 >= 25);
        System.out.println(!(false) || true && false);

        // Control Flow
        if (9> 2){
            System.out.println("Control flow rocks!");
        }

        // if statements
        int num = 4;
        if (7 <= num) {
            System.out.println("Try again...");
        } else {
            System.out.println("Success!");
        }

        int shoeSize = 10;

        if (shoeSize > 12) {
            System.out.println("Sorry, your shoe size is currently not in stock.");
        } else if (shoeSize >= 6) {
            System.out.println("Your shoe size is in stock!");
        } else {
            System.out.println("Sorry, this store does not carry shoes smaller than a size 6.");
        }

        // ternary
        int fuelLevel = 3;

        char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
        System.out.println(canDrive);
    }
}