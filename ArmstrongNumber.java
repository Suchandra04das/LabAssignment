package Basicprograms; //checking Armstrong Number
import java.util.Scanner;
public class ArmstrongNumber {
    public void findArmstrong(int n) { //create method
        int temp, sum=0, rem, count = 0; //variable declare
        temp = n;//holding the value in  for future use
        //count number of digits
        while (n > 0) {//counting the no of digits in the given number
            n = n / 10;
            count++;
        }
        n=temp;
        while (n > 0) { //calculating armstrong number using while loop
            rem = n % 10;
            sum+=Math.pow(rem,count);
            n = n / 10;
        }
        if (sum == temp)// checking entered number is equal or not
            System.out.println(temp+ " is an Armstrong number");
        else System.out.println(temp+ " is not an Armstrong number");
        //end method
    } public static void main(String[] args) {
        int num;// variable declare in main method
        System.out.println("enter any num: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        ArmstrongNumber obj= new ArmstrongNumber();//invoking method
        obj.findArmstrong(num);

    }
}
