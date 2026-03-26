class Calculator {

    // Public method - add two integers
    public int add(int x, int y) {
        return x + y;
    }

    // Protected method - add three integers
    protected int add(int x, int y, int z) {
        return x + y + z;
    }

    // Private method - add two decimal numbers
    private double add(double x, double y) {
        return x + y;
    }

    // Public method to access private method
    public void printDecimalAddition(double x, double y) {
        System.out.println("Decimal Sum: " + add(x, y));
    }

    // Main method to test
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(2, 3, 4));

        calc.printDecimalAddition(2.5, 3.5);
    }
}