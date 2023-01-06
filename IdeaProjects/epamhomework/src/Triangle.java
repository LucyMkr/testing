import java.util.Scanner;

public class Triangle {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 3 values ");
            int a = s.nextInt();

            int b = s.nextInt();
            int c = s.nextInt();
            if (a < (b + c) && b < (a + c) && c < (a + b) && a > 0 && b > 0 && c > 0) {
                System.out.println("This three values create a triangle");
            } else
                System.out.println("This three values do not create a triangle");
        }
}

