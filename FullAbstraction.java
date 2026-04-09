interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount){
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class UPI implements Payment {
    public void pay(double amount){
        System.out.println("Paid using UPI: " + amount);
    }
}

public class FullAbstraction {
    public static void main(String[] args){
        Payment p;

        p = new CreditCard();
        p.pay(1000);

        p = new UPI();
        p.pay(500);
    }
}