package arrayexample;
import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        int i, j=0,s1,s2;//variable declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of first array: ");
         s1=scan.nextInt();
        int[] arr1 = new int[s1];//instantiate array1
        System.out.println("enter the size of second array: ");
        s2=scan.nextInt();
        int[] arr2 = new int[s2];//instantiate array2
        int[] arr3 = new int[s1+s2];
        //getting array elements for 1st array from user
        System.out.print("Enter  "+s1+" elements for First Array: ");
        for(i=0; i<s1; i++){
            arr1[i] = scan.nextInt();
        arr3[j++] = arr1[i];
        }
        //getting array elements for 2nd array from user
        System.out.print("Enter"+s2+" elements for Second Array: ");
        for(i=0; i<s2; i++) {
            arr2[i] = scan.nextInt();
            arr3[j++] = arr2[i];
        }
        System.out.println("\nThe merged array is: ");
        for(i=0; i<arr1.length+arr2.length; i++){
            System.out.print(arr3[i]+ " ");
    }
}}
