public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                switch (i) {
                    case 0:
                        arr1[0] = 64;
                        break;
                    case 1:
                        arr1[1] = 32;
                        break;
                    case 2:
                        arr1[2] = 16;
                        break;
                    case 3:
                        arr1[3] = 8;
                        break;
                    case 4:
                        arr1[4] = 4;
                        break;
                    case 5:
                        arr1[5] = 2;
                        break;
                    case 6:
                        arr1[6] = 1;
                        break;
                }
            } else {
                arr1[i] = 0;
            }
        }
        double k = arr1[0] + arr1[1] + arr1[2] + arr1[3] + arr1[4] + arr1[5] + arr1[6];
        System.out.println(k);

    }
}
