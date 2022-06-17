package OOPs.inheritance;
class Employee
{
    //instance variables declaration
    long employeeId,employeePhone;
    String employeeName;
    String employeeAddress;
    double basicSalary;
    double specialAllowance=250.80;
    double Hra=1000.50;
    public Employee(long employeeId,long employeePhone, String employeeName,String employeeAddress,double BasicSalary)
    {//Employee class constructor
        this.employeeId= employeeId;
        this.employeePhone=employeePhone;
        this.employeeName= employeeName;
        this.employeeAddress=employeeAddress;
        this.basicSalary=BasicSalary;
    }
    public void calculateSalary()//method for salary calculation
    {
        double salary;
        salary= basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
        System.out.println(("the salary is: "+salary));
    }//end method
    public void calculateTransportAllowance()//method for transport allowance
    {
        double transportAllowance;
        transportAllowance=(10*basicSalary)/100;
        System.out.println("Transport allowance is: "+transportAllowance);
    }//end method

}
class Manager extends Employee
{//subclass manager (Hierarchical Inheritance)
    public Manager(long employeeId,long employeePhone, String employeeName,String employeeAddress,double salary)
    {//Subclass constructor(overloading)
        super(employeeId, employeePhone, employeeName, employeeAddress,salary);
    }
    public void calculateTransportAllowance()//method for transport allowance calculation of manager (overriding)
    {
        double transportAllowance;
        transportAllowance=(15*basicSalary)/100;
        System.out.println("Transport allowance of Manager is: "+transportAllowance);
    }//end method

}//end subclass manager
class Trainee extends Employee
{//subclass trainee (Hierarchical Inheritance)
    public Trainee(long employeeId,long employeePhone, String employeeName,String employeeAddress,double salary)
    {//Subclass constructor(overloading)
        super(employeeId, employeePhone, employeeName, employeeAddress,salary);
    }

}
public class InheritanceActivity {
    public static void main(String[] args) {
        Manager manager=new Manager(126534,237844,"Peter","Chennai India",65000);//object creation for Manager subclass
        Trainee trainee=new Trainee(29846,442085,"Jack","Mumbai",45000);//object creation for Trainee subclass
        manager.calculateSalary();//invoke the method for calculate the salary of manager
        trainee.calculateSalary();//invoke the method for calculate the salary of trainee
        manager.calculateTransportAllowance();//invoke the method for calculate the Transport Allowance of manager
        trainee.calculateTransportAllowance();//invoke the method for calculate the Transport Allowance of trainee


    }//end main method
}
