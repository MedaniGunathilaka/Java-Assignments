abstract class BankAccount{
   protected int accNumber;
   protected String accountType;
   protected String accHoldersName;
   protected static String branch="Kandy";
   protected static boolean isActiveAccount=true;
   protected double currentBalance;
   
   protected BankAccount(){

   }
   protected BankAccount(String accountType,double currentBalance){
    this.accountType=accountType;
    this.currentBalance=currentBalance;
   }
//    protected BankAccount(int accNumber,String accountType,String accHoldersName,double currentBalance){
//        this.accNumber=accNumber;
//        this.accountType=accountType;
//        this.accHoldersName=accHoldersName;
//        this.currentBalance=currentBalance;
//    }
   public double getBalance(){
       return currentBalance;
   }
   public double cashDeposit(double depositAmount){
       currentBalance=currentBalance+depositAmount;
       return currentBalance;
   }
   public abstract double calInterest();
   public abstract String toString();
}

class Savings extends BankAccount{
    private static double interestRate=0.03;

    // public Savings(int accNumber,String accountType,String accHoldersName,double currentBalance){
    //     super(accNumber,accountType,accHoldersName,currentBalance);
    // }
    public Savings(String accountType,double currentBalance){
        super(accountType, currentBalance);
    }
    @Override
    public double calInterest(){
        currentBalance=currentBalance+currentBalance*interestRate;
        return currentBalance;
    }
    @Override
    public String toString(){
        return "Account Type is "+super.accountType+" \nInterest Rate is "+interestRate*100+"%\nCurrent Balance is "+super.currentBalance;
    }
}
class Current extends BankAccount{
    private static double interestRate=0.012;
    // public Current(int accNumber,String accountType,String accHoldersName,double currentBalance){
    //     super(accNumber,accountType,accHoldersName,currentBalance);
    // }
    public Current(String accountType,double currentBalance){
        super(accountType, currentBalance);
    }
    @Override
    public double calInterest(){
        currentBalance=currentBalance+currentBalance*interestRate;
        return currentBalance;
    }
    @Override
    public String toString(){
        return "Account Type is "+super.accountType+" \nInterest Rate is "+interestRate*100+"%\nCurrent Balance is "+super.currentBalance;
    }
}
class FD extends BankAccount{
    private static double interestRate=0.08;
    // public FD(int accNumber,String accountType,String accHoldersName,double currentBalance){
    //     super(accNumber,accountType,accHoldersName,currentBalance);
    // }
    public FD(String accountType,double currentBalance){
        super(accountType, currentBalance);
    }
    @Override
    public double calInterest(){
        currentBalance=currentBalance+currentBalance*interestRate;
        return currentBalance;
    }
    @Override
    public String toString(){
        return "Account Type is "+super.accountType+" \nInterest Rate is "+interestRate*100+"%\nCurrent Balance is "+super.currentBalance;
    }
}


public class Main3 {
    public static void main(String[] args){
        System.out.println("Intial Balance of Accounts\n");
        Savings savings=new Savings("S",100000);
        System.out.println(savings.getBalance());
        Current current=new Current("C",100000);
        System.out.println(current.getBalance());
        FD fd=new FD("FD",100000);
        System.out.println(fd.getBalance());
        System.out.println("\nAfter cash deposit\n");
        savings.cashDeposit(2000);
        current.cashDeposit(2000);
        fd.cashDeposit(2000);
        System.out.println(savings.toString());
        System.out.println(current.toString());
        System.out.println(fd.toString());
        System.out.println("\nAfter calculating the interest\n");
        savings.calInterest();
        current.calInterest();
        fd.calInterest();
        System.out.println(savings.toString());
        System.out.println(current.toString());
        System.out.println(fd.toString());

    }
}