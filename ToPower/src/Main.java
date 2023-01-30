public class Main {
    public static void main(String[] args) {
        toThePower(2, 7);
        toThePower(11, 2);
        toThePower(3, 13);
        toThePower(-1, 9);
    }

    public static int toThePower(int base, int exponent) {
        if (base > 0 && base < 10 && (exponent > 0 && exponent < 10 || exponent < 0 && exponent > -10) ) {
            int base1 = base;
            while (exponent > 0) {
                base = base * base1;
                exponent--;
            }
            System.out.println(base);
        }
        else if (base > 10 || exponent > 10 ) {
            System.out.println("-1");
            System.out.println("Wrong base or exponent");
            System.out.println("Please, input correct data");

        }
        else if (base <= 0) {
            System.out.println("-2");
            System.out.println("Wrong base");
            System.out.println("Please, input correct data");
        }
        return base;
    }
}
