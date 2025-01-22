import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

        double[] a = {1.57, 7.654, 9.986};

        String[] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "orange";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        for (int j = 0; j < a.length; j++) {
            if (j == 0) {
                System.out.print("(" + a[j] + ", ");
                continue;
            } else if (j == a.length - 1) {
                System.out.println(a[j] + ")");
                break;
            }
            System.out.print(a[j] + ", ");
        }

        System.out.println(Arrays.toString(fruits));

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
                continue;
            }
            System.out.println(arr[i]);
        }

        for (int j = a.length - 1; j >= 0; j--) {
            if (j > 0) {
                System.out.print(a[j] + ", ");
                continue;
            }
            System.out.println(a[j]);
        }

        for (int k = fruits.length - 1; k >= 0; k--) {
            if (k > 0) {
                System.out.print(fruits[k] + ", ");
                continue;
            }
            System.out.println(fruits[k]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}