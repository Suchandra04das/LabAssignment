package Basicprograms;//find strong number
import java.util.Scanner;
public class StrongNumber {
    public static int fact(int no) {// create fact method
        int i, f;//declaration variables
        f = 1;
        for (i = 1; i <= no; i++) {
            f = i * f;
        }
        return f;
    }//end of fact method
    public void calculateStrong(int num) {// method of calculation of strong number
        int i, temp,factorial, fact, rem, c = 0;//variables declare
        temp = num;//holding the input for future use
        while (num > 0) {
            rem = num % 10; //holding the remainder
            factorial=fact(rem);//invoking fact method
        c = c + factorial;
        num = num / 10;}
        if (c == temp) //checking entered is equal or not with c
            System.out.println("strong number");
        else
            System.out.println("not strong number");
    }//end method

     public static void main(String[] args) {
        int number; //variable declare in main method
        System.out.println("Enter any num: ");
        Scanner sc=new Scanner(System.in); //taking input from user
        number=sc.nextInt();
        StrongNumber obj = new StrongNumber();//invoking method
        obj.calculateStrong(number);

    }
}

