package Third_Assignment;

enum WithDrawOrder{
    SUCCESS,

    ERROR_MUST_AMMOUNT_LESS_THAN_OR_EQUAL_YOUR_BALANCE,

    ERROR_YOU_MUST_ENTER_POSITIVE_NUMBER,

}



public class Task01 {
    public static class BankAccount {
        private int accountId;
        private double balance;
        private static int counter_Id = 0;

        public BankAccount() {
            accountId = ++counter_Id;
            this.balance = 0.0;
        }

        public BankAccount(double balance) {
            accountId = ++counter_Id;
            this.balance = balance;

        }



        public int getAccountId() {
            return accountId;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public WithDrawOrder withDraw(int amount) {
            if (amount > balance ) return WithDrawOrder.ERROR_MUST_AMMOUNT_LESS_THAN_OR_EQUAL_YOUR_BALANCE;
            if (amount < 0) return WithDrawOrder.ERROR_YOU_MUST_ENTER_POSITIVE_NUMBER;
            balance -= amount;
            return WithDrawOrder.SUCCESS;
        }

        public double deposit(int amount) {
            return balance += amount;
        }

        public void printInfo() {
            System.out.println("Your Account id is : " + accountId);
            System.out.println("Your Balance is    : " + balance);
        }

        public static void main(String[] args) {

            BankAccount ahmed = new BankAccount();
            BankAccount akram = new BankAccount( 5000);
            akram.withDraw(5001);
            //akram.deposit(10000);
            //akram.printInfo();
        }

    }

}
