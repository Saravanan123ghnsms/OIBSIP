import java.util.Scanner;

class ATM {
    String username;
    int userid;

    public void setusername(String username)
     {
        this.username = username;
    }

    public void setuserid(int userid) 
    {
        this.userid = userid;
    }

    public String getusername()
     {
        return username;
    }

    public int getuserid() 
    {
        return userid;
    }
}

class Transaction 
{
    String transactionType;
    double amount;
    String date;

    public Transaction(String transactionType, double amount, String date) 
    {
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }

    public String getTransactionType()
     {
        return transactionType;
    }


    public double getAmount() 
    {
        return amount;
    }

    public String getDate()
     {
        return date;
    }
}

class Withdrawal 
{
    public static int balance(int withdrawlamount, int balance) 
    {
        balance = balance - withdrawlamount;
        System.out.println("the amount debited :" + withdrawlamount);
        System.out.println("balance is " + balance);
        return balance;
    }
}

class Deposit
 {
    public static int depositamount(int depositamou, int balance) 
    {
        balance = balance + depositamou;
        System.out.println("deposited amount :" + depositamou);
        System.out.println("balance is " + balance);
        return balance;
    }
}

class Quit 
{
    public static void getquit() {
        System.out.println("Thanks for using ATM ...");
    }
}

public class task3 
{
    public static void main(String[] args) {
        ATM a = new ATM();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        a.setusername(username);

        System.out.print("Enter user ID: ");
        int userid = scanner.nextInt();
        a.setuserid(userid);

        System.out.println("Username: " + a.getusername());
        System.out.println("User ID: " + a.getuserid());

        scanner.nextLine();

        System.out.print("Enter transaction type: ");
        String transactionType = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Enter date (DD-MM-YYYY): ");
        String date = scanner.nextLine();

        Transaction b = new Transaction(transactionType, amount, date);

        int balance = 50000;

        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        balance = Withdrawal.balance(withdrawAmount, balance);

        System.out.print("Enter amount to deposit: ");
        int depositAmount = scanner.nextInt();
        balance = Deposit.depositamount(depositAmount, balance);

        Quit.getquit();
    }
}
