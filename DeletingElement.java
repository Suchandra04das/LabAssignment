package arrayexample;
import java.util.Scanner;
public class DeletingElement {
    public static void main(String[] args) {
        int size,pos,arr[],i;//variables declaration
        arr=new int[10];
        System.out.println("Enter size of the array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.println();
        System.out.println("Enter " +size+ " elements of array: " );
        //creating array
        for (i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position of insert element: ");
        pos=sc.nextInt();
        ///check position valid or not
        if(pos>size+1) {
            System.out.println("\nour size is "+size+" please choose position according to size");}
        else {
            //replacing the elements
            for(i=pos-1;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            //delete length
            size--;
            System.out.println("After deleting the element,the new array is: ");
            //new array
            for (i = 0; i <size; i++) {
                System.out.println(arr[i]);
            }
        }
    }}


