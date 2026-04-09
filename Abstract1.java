abstract class Transport {
    abstract double calculateFare(double distance);

    public void displayType(){
        System.out.println("Transport System");
    }
}

class Bus extends Transport {
    double calculateFare(double distance){
        return distance * 5;
    }
}

class Train extends Transport {
    double calculateFare(double distance){
        return distance * 3;
    }
}

abstract class FoodOrder {
    abstract void prepareOrder();

    public void orderStatus(){
        System.out.println("Order is being processed");
    }
}

class VegOrder extends FoodOrder {
    void prepareOrder(){
        System.out.println("Preparing Veg Order");
    }
}

class NonVegOrder extends FoodOrder {
    void prepareOrder(){
        System.out.println("Preparing Non-Veg Order");
    }
}

public class Abstract1 {
    public static void main(String[] args){

        // Transport Example
        Transport t;

        t = new Bus();
        t.displayType();
        System.out.println(t.calculateFare(10));

        t = new Train();
        t.displayType();
        System.out.println(t.calculateFare(10));

        // FoodOrder Example
        FoodOrder f;

        f = new VegOrder();
        f.orderStatus();
        f.prepareOrder();

        f = new NonVegOrder();
        f.orderStatus();
        f.prepareOrder();
    }
}