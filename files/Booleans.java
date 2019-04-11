public class Booleans {
    public static void main(String[] args) {
        // false statements
        System.out.println(23 >= 14 && 23 >= 25);
        System.out.println(!(1 < 8 || (5 > 2 && 3 < 5)));
        System.out.println(!(4 <= 10));

        // true statements
        System.out.println(23 >= 14 || 23 >= 25);
        System.out.println(!(false) || true && false);

        // Control Flow
        if (9 > 2) {
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

        // switch statement
        char penaltyKick = 'R';

        switch (penaltyKick) {
            case 'L':
                System.out.println("Messi shoots to the left and scores!");
                break;
            case 'R':
                System.out.println("Messi shoots to the right and misses the goal!");
                break;
            case 'C':
                System.out.println("Messi shoots down the center, but the keeper blocks it!");
                break;
            default:
                System.out.println("Messi is in position...");
        }
    }
}