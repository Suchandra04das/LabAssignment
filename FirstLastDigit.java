package Basicprograms;//find first and last digit
import java.util.Scanner;
public class FirstLastDigit{
    public void findFirstAndLastDigit(int number){//method creation
        int rem;
        rem=number%10;//find last digit
        while(number>10) {//find first digit
            number = number / 10;
        }//end loop
            System.out.println("the first digit is: "+number);
            System.out.println("the last digit is: "+rem);
    }//end method

    public static void main(String[] args) {
        int n;//variable declaration
        System.out.println("Enter any numbers: ");
        Scanner sc=new Scanner(System.in); //taking input from user
        n=sc.nextInt();
        FirstLastDigit obj = new FirstLastDigit();//invoking method
        obj.findFirstAndLastDigit(n);

    }}



