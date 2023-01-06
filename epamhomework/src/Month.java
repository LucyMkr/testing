import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value from 1 to 12");
        int i = s.nextInt();
        switch (i) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("the Month has 31");
                break;
            case 4, 6, 9, 11:
                System.out.println("Selected Month has 30");
                break;
            case 2:
                System.out.println("Selected month has 28/29");
            default:
                System.out.println("Input valid value");
        }
    }

}
