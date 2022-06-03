package Basicprograms; //checking Armstrong Number
import java.util.Scanner;
public class ArmstrongNumber {
    public void findArmstrong(int n){ //create method
        int sum,rem,count=0; //variable declare
        sum=n;//holding the value in sum
        while(n>0){ //calculating armstrong number using while loop
            rem=n%10;
            count=count+(rem*rem*rem);
            n=n/10;}
        if(sum==count)// checking entered number is equal to count
            System.out.println("Armstrong number");
        else System.out.println("not Armstrong number");
    } //end method
    public static void main(String[] args) {
        int num;// variable declare in main method
        System.out.println("enter any num: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        ArmstrongNumber obj= new ArmstrongNumber();//invoking method
        obj.findArmstrong(num);

    }
}
