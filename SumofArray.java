package arrayexample;
import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args) {
        int i;
        int[] sum = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int a = scan.nextInt();
        int[] arr1 = new int[a];
        System.out.print("Enter " + a + " elements for first array: ");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int b = scan.nextInt();
        int[] arr2 = new int[b];
        System.out.print("Enter " + b + " elements for second array: ");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        System.out.print("The sum of two arrays are: ");
        for (i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
            System.out.print(sum[i] + " ");
        }

        System.out.println();

    }
}
