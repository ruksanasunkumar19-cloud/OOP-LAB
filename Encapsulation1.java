class Account {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
}

class Student {
    private String name;
    private int roll;
    private int marks;

    public void setName(String name){
        this.name = name;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }

    public void setMarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        }
    }

    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public int getMarks(){
        return marks;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {

        // Account example
        Account acc = new Account();
        acc.setAccountNumber(12345);
        acc.deposit(1000);
        acc.withdraw(200);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());

        // Student example
        Student s = new Student();
        s.setName("Avanthi");
        s.setRoll(1);
        s.setMarks(95);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll: " + s.getRoll());
        System.out.println("Marks: " + s.getMarks());
    }
}