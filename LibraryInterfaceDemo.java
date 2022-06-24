package OOPs.polymorphism;
// Creating interface
interface LibraryUser
{
    void registerAccount();// abstract method
    void requestBook();// abstract method
}
// creating a subclass,implements the above created interface
class KidUser implements LibraryUser
{
   private int age;private String bookType;//instance variable of the subclass
    public KidUser(int age,String bookType)
    { // constructor of the subclass
        this.age=age;
        this.bookType=bookType;
    }
    public void registerAccount()// creating method for register account of kids
    {
      if(age<12)
          System.out.println("You have successfully registered under a kids Account");
      else System.out.println("Sorry your age must be less than 12 to register as a kid");
    }//end of method registerAccount
    public void requestBook()
    {// creating method for request books for kids
        if(bookType=="Kids")
            System.out.println("Book issued successfully,please return the book within 10 days");
        else System.out.println("Oops, you are allowed to take only kids books");

    }// end of method requestBook
}
//subclass for adult users
    class AdultUser implements LibraryUser
    {
     private int age;private String bookType;// instance variable declaration in sub class
        public AdultUser(int age,String bookType)
        {// constructor for the subclass
            this.age=age;
            this.bookType=bookType;
        }
        // creating method for register account of adults
       public void registerAccount()
       {
           if(age>12)
               System.out.println("You have successfully registered under adult account");
           else System.out.println("Sorry,Age should be greater than 12 to register account");
       }
       //creating method for request books for adults
       public void requestBook()
       {
           if(bookType=="Fiction")
               System.out.println("Book Issued successfully,please return the book within 10 days");
           else System.out.println("Oops, you are allowed to take only adult Fiction books");
       }//end of method requestBook

    }//end of class subclass AdultUsers
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid=new KidUser(18,"Fiction");// object creation in the KidUsers Class
        kid.registerAccount();// method invoke for register book for kids
        kid.requestBook();// method invoke for request book for kids
        AdultUser adult=new AdultUser(25,"Fiction");//object creation in the AdultUsers Class
        adult.registerAccount();// method invoke for register book for AdultUsers
        adult.requestBook();// method invoke for request  book for AdultUsers


    }//end of main method
}
