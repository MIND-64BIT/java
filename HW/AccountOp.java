// import java.util.Scanner;

class Account{
    private String name;
    private int age;
    private double balance = 0.0;

    Account(String name, int age, int firstDeposit, boolean hasDocumentSubmitted){
        this.name = name;
        this.age = age;
        if(hasDocumentSubmitted == true && firstDeposit <=  5000){
            this.balance += firstDeposit;
        }
    }

    void getBalance(){
        System.out.println("Balance: "+this.balance);
    }

    void deposit(int ammount){
        this.balance += ammount;
    }

    void withdraw(int ammount){
        this.balance -= ammount;
    }
}

public class AccountOp {
    public static void main(String[] args) {
        Account a1 = new Account("ramesh", 18, 1000, true);
        a1.getBalance();
        a1.deposit(5000);
        a1.getBalance();
        a1.withdraw(400);
        a1.getBalance();
    }
}
