package OOPs;//program to create bank account details
import java.util.Scanner;
class Account{
    //instance variable
    private long accountNo;
    private String accHolderName;
    private int accBalance;
    private String accType;
    public Account(long accountNo,String accHolderName, int accBalance,String accType)
    {//constructor
        this.accountNo=accountNo;
        this.accHolderName=accHolderName;
        this.accType=accType;
        this.accBalance=accBalance;
    }
    public void withdraw(int amount)//method for balance withdraw
    {
        if(amount>this.accBalance)
            System.out.println("There have not sufficient value in this account");
        else{
            this.accBalance=this.accBalance-amount;
            System.out.println("Your account has been debited with: "+amount);
            System.out.println("Your account balance is: "+this.accBalance);
            System.out.println("Thank you");
        }

    }
    public void deposit(int amount)//method for balance deposit
    {
        this.accBalance=this.accBalance+amount;
        System.out.println("Your account is credited with: "+amount);
        System.out.println("The account balance is: "+this.accBalance);
        System.out.println("Thank you");
    }
    public void check()//method for balance checking
    {
        System.out.println("Account holder name: "+this.accHolderName);
        System.out.println("Account number: "+this.accountNo);
        System.out.println("Your account balance is: "+this.accBalance);
        System.out.println("Thank you");
    }

}
public class AccountDetails {
    public static void main(String[] args) {
        int choice,amt;//variable declare
        Account Customer=new Account(145696524,"Suchandra Das",30000,"Savings");
        System.out.println("Welcome to Web Bank of India");
        System.out.println("Please enter your choice");
        System.out.println("Press 1 for check balance\nPress 2 for deposit amount\nPress 3 for withdraw");
        Scanner sc=new Scanner(System.in); //taking input from user
        choice=sc.nextInt();
        switch(choice){ //taking choice from user
            case 1:
                Customer.check();
                break;
            case 2:
                System.out.println("Enter the amount which you want to deposit: ");
                amt=sc.nextInt(); //taking amount from user
                Customer.deposit(amt);
                break;
            case 3:
                System.out.println("Enter the amount which you want to withdraw: ");
                amt=sc.nextInt();//taking amount from user
                Customer.withdraw(amt);
                break;
            default:
                System.out.println("Enter a valid choice");

    }
    }//end of main method
}
