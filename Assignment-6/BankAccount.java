//! Write a java program to define a class Bankaccount with member variables cus_name ,cus_ac , balance
//! The methods are :
//! a) getData() to initialise the variable
//! b) showData() to show record of customer 
//! c)deposit() to deposit ammount and update balance , if ammount <= 0 then throw an exception named "wrong ammount" and print alert message
//! d) withdraw() to withdraw ammount and update balance , if ammount > balance then throw an exception named "insufficient balance" and print alert message
//! Write Main class to define main() method where create object of Bankaccount class and call the methods.

class WrongAmount extends Exception {
    WrongAmount(String message) {
        super(message);
    }
}

class InsufficientBalance extends Exception {
    InsufficientBalance(String message) {
        super(message);
    }
}

class BankAccountDetails {
    String cus_name;
    int cus_acc;
    double balance;

    public void getData(String cus_name, int cus_acc, double balance) {
        this.cus_name = cus_name;
        this.cus_acc = cus_acc;
        this.balance = balance;
    }

    public void showData() {
        System.out.println("Customer Details: ");
        System.out.println("Name: " + cus_name);
        System.out.println("Account No.: " + cus_acc);
        System.out.println("Account Balance: " + balance);
    }

    public void deposit(double amt) {
        try {
            if (amt <= 0) {
                throw new WrongAmount("Deposit amount cannot be negative or zero!");
            } else {
                balance += amt;
                System.out.println("Amount Deposited Successfully. Updated balance: " + balance);
            }
        } catch (WrongAmount e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void withdraw(double amt) {
        try {
            if (amt > balance) {
                throw new InsufficientBalance("Insufficient Account Balance!");
            } else {
                balance -= amt;
                System.out.println("Amount Withdrawn Successfully. Updated balance: " + balance);
            }
        } catch (InsufficientBalance e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAccountDetails ob = new BankAccountDetails();

        ob.getData("Tushar", 123456789, 10000.00);

        ob.showData();
        System.out.println("------------------------------------------------");
        ob.deposit(-100000);
        System.out.println("------------------------------------------------");
        ob.deposit(10000.00);
        System.out.println("------------------------------------------------");
        ob.showData();
        System.out.println("------------------------------------------------");
        ob.withdraw(1000000);
        System.out.println("------------------------------------------------");
        ob.withdraw(1000);
        ob.showData();
    }
}