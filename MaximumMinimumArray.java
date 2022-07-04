package arrayexample;
import java.util.Scanner;
public class MaximumMinimumArray {
    public static void main(String[] args) {
        int size, i, arr[],max,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        //instantiate array
        arr = new int[size];
        //getting array elements from user
        System.out.println("enter " + size + " elements in an array");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        max=min=arr[0];
        for(i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];}
                else if(arr[i]<min){
                    min=arr[i];
                }

            }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
        }

    }

