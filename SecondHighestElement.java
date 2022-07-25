package arrayexample;

import java.util.Scanner;

public class SecondHighestElement {
    public static void main(String[] args) {
        int  i,j,Temp,size,array[];
        array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        size = sc.nextInt();
        System.out.println("Enter " + size + " elements in the array: ");
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    Temp=array[i];
                    array[i]=array[j];
                    array[j]=Temp;
                }
            }
        }
        System.out.println("After sorting,the new array in ascending order: ");
        for (i = 0; i <size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Second largest element is: "+array[size-2]);
    }
}
