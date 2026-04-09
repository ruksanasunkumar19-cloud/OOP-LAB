class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("This is Calculator class");
    }

    private void show() {
        System.out.println("Private method in Calculator");
    }

    public void accessPrivate() {
        show(); // calling private method inside same class
    }
}

class AdvancedCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        return a + b + 10; // modified behavior
    }

    @Override
    protected void display() {
        System.out.println("This is AdvancedCalculator class");
    }

    // This is NOT overriding (parent method is private)
    public void show() {
        System.out.println("Show method in AdvancedCalculator");
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        AdvancedCalculator ac = new AdvancedCalculator();
        Calculator ref = new AdvancedCalculator(); // polymorphism

        System.out.println(c.add(5, 3));
        c.display();
        c.accessPrivate();

        System.out.println(ac.add(5, 3));
        ac.display();
        ac.show();

        System.out.println(ref.add(5, 3));
        ref.display();
    }
}