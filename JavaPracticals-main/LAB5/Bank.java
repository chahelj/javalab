import java.util.Scanner;

// Base class
class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited successfully.");
    }

    void displayBalance() {
        System.out.println("Balance = ₹" + balance);
    }
}

// Savings Account class
class SavAcct extends Account {

    double rate = 0.05; // 5% interest

    void computeInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Current Account class
class CurAcct extends Account {

    double minBalance = 2000;
    double penalty = 200;

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;

            if (balance < minBalance) {
                balance -= penalty;
                System.out.println("Minimum balance not maintained.");
                System.out.println("Penalty imposed: ₹" + penalty);
            }

            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account type (1-Savings, 2-Current): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            SavAcct s = new SavAcct();

            System.out.print("Enter name: ");
            s.name = sc.next();

            System.out.print("Enter account number: ");
            s.accNo = sc.nextInt();

            s.accType = "Savings";

            System.out.print("Enter initial balance: ");
            s.balance = sc.nextDouble();

            s.deposit(1000);
            s.computeInterest();
            s.withdraw(500);
            s.displayBalance();
        } 
        else {
            CurAcct c = new CurAcct();

            System.out.print("Enter name: ");
            c.name = sc.next();

            System.out.print("Enter account number: ");
            c.accNo = sc.nextInt();

            c.accType = "Current";

            System.out.print("Enter initial balance: ");
            c.balance = sc.nextDouble();

            c.deposit(1000);
            c.withdraw(3000);
            c.displayBalance();
        }

        sc.close();
    }
}
