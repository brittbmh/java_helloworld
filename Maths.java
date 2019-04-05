public class Maths {
    public static void main(String[] args){
        double num1 = 3544.24765;
        double num2 = 35741.5284;
        double sum = num1 + num2;
        System.out.println(sum);

        int num3 = 354;
        int num4 = 33;
        int total = num3 - num4;
        System.out.println(total);
        // dividing ints results in an whole number, regardless of remainder/decimal
        int division = num3 / num4;
        double divided = num1 / num2;
        System.out.println(division);
        System.out.println(divided);

        double multiply = num2 * num4;
        System.out.println(multiply);

        int num5 = 54;
        int modNum = num5 % 5;
        System.out.println(modNum);

        System.out.println(modNum < num4);
        boolean match = num2 == num3;
        boolean noMatch = num3 != num4;
        System.out.println(match);
        System.out.println(noMatch);
    }
}