package Third_Assignment;

public class Task_01_Bank_Account {
public static class BankAccount{
    private int accountId;
    private double balance;
    public BankAccount(){
        this.accountId= 0;
        this.balance = 0.0;
    }
    public BankAccount(int accountId,double balance){
        this.accountId = accountId;
        this.balance = balance;

    }
    public void setAccountId(int accountId){
        this.accountId = accountId;
    }
    public int getAccountId(){
        return accountId;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public double withDraw(int amount ){
        if(amount>balance){
            System.out.println("\nError Amount must <= Your Balance.\n");
            return -1.0;
        }
        return balance -= amount;
    }
    public double deposit(int amount){
        return balance += amount;
    }

    public void printInfo(){
        System.out.println("Your Account id is : "+accountId);
        System.out.println("Your Balance is    : "+balance);
    }
    public static void main(String[]args){

        BankAccount ahmed = new BankAccount();
        BankAccount akram = new BankAccount(11,5000);
        akram.withDraw(5001);
        //akram.deposit(10000);
        //akram.printInfo();
    }

}

}
