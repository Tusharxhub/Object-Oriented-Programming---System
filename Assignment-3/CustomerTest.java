//! Define a class `Account` with attributes `account_no`, `name`, and `balance`. Derive `SavingsAccount` with `interest_rate` and `status`, and further derive `FixedDeposit` with `amount`, `interest_rate`, `period`, and `status`. Also, create `CurrentAccount` with a subclass `LoanAccount` having `amount`. Implement a `display()` method in each class to show details.

class Customer {
    String account_no, name;
    double balance;

    Customer(String account_no, String name, double balance) {
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + account_no + "\nName: " + name + "\nBalance: " + balance);
    }
}

class SavingsAccount extends Customer {
    double interest_rate;
    String status;

    public SavingsAccount(String account_no, String name, double balance, double interest_rate, String status) {
        super(account_no, name, balance);
        this.interest_rate = interest_rate;
        this.status = status;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interest_rate + "%\nStatus: " + status);
    }
}

class FixedDeposit extends SavingsAccount {
    double amount;
    int period;

    public FixedDeposit(String account_no, String name, double balance, double interest_rate, String status,
            double amount, int period) {
        super(account_no, name, balance, interest_rate, status);
        this.amount = amount;
        this.period = period;
    }

    void display() {
        System.out.println("FD: " + name + ", " + account_no + ", " + balance + ", " + amount + ", " + interest_rate
                + "%, " + period + " days");
    }
}

class CurrentAccount extends Customer {
    CurrentAccount(String account_no, String name, double balance) {
        super(account_no, name, balance);
    }
}

class LoanAccount extends CurrentAccount {
    double amount;
    double interest_rate;

    public LoanAccount(String account_no, String name, double balance, String status, double amount,
            double interest_rate) {
        super(account_no, name, balance);
        this.amount = amount;
        this.interest_rate = interest_rate;
    }

    void display() {
        System.out.println(
                "Loan: " + name + ", " + account_no + ", " + balance + ", " + amount + ", " + interest_rate + "%");
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        FixedDeposit fixedDeposit = new FixedDeposit("101", "Tushar Kanti Dey", 12345, 5.5, "Active", 5000, 365);
        LoanAccount loanAccount = new LoanAccount("102", "Aditya Dey", 54321, "Active", 10000, 7.2);

        fixedDeposit.display();
        System.out.println();
        loanAccount.display();
    }
}