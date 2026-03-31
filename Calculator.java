class Calculator {

   
    public int add(int x, int y) {
        return x + y;
    }

   
    protected int add(int x, int y, int z) {
        return x + y + z;
    }

    
    private double add(double x, double y) {
        return x + y;
    }

    public void printDecimalAddition(double x, double y) {
        System.out.println("Decimal Sum: " + add(x, y));
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(2, 3, 4));

        calc.printDecimalAddition(2.5, 3.5);
    }
}
