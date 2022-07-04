package arrayexample;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int size,pos,n,arr[],i;
        arr=new int[10];
        System.out.println("Enter size of the array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.println();
        System.out.println("Enter " +size+ " elements of array: " );
        for (i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position of insert element: ");
        pos=sc.nextInt();
        ///check position valid or not
        if(pos>size+1) {
            System.out.println("\nour size is "+size+" please choose position according to size");}
        else {
            System.out.println("enter value: ");
            n=sc.nextInt();
        //shifting the elements
        for(i=size;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        //insert in position
        arr[pos-1]=n;
        size++;
        System.out.println("After inserting the element");
        //new array
        for (i = 0; i <size; i++) {
            System.out.println(arr[i]);
        }
    }
}}
