public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int t = 1;
        int[] arr = {23, 24, 76, 79, 84, 83};
        for (int i = 0; i < arr.length; i++) {
            while (t < arr[i]) {
                t++;
                if ( arr[i] % t != 0) {
                    counter++;
                    System.out.println(arr[i]);
                    break;
                }
                else {
                    break;
               }
            }
        }
    }
}



