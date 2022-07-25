package arrayexample;//searching element in array
import java.util.Scanner;
public class SearchingInArray {
    static Scanner sc = new Scanner(System.in);

    public static int[] searchElementInArray() {//creating method
        int size, i, arr[];
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        //instantiate array
        arr = new int[size];
        //getting array elements from user
        System.out.println("enter " + size + " elements in an array");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void searchingElement(int arr[], int search) {
        int position = -1, i;//variable declaration
        //logic for searching element in array
        for (i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                position = i;
                break;
            }
        }
        //need to check that we got position or not
        if (position != -1) {
            System.out.println("element found at " + (position + 1) + " position");
        } else {System.out.println("data not found");
    }}

//end method
    public static void main(String[] args) {
        int arr[]=SearchingInArray.searchElementInArray();
        System.out.println("enter elements to search: ");
        int search=sc.nextInt();
        SearchingInArray.searchingElement(arr,search);//invoking method

    }
}
