import java.util.*;


interface Shape {
    void calculate(int choice);
}


class Calculate implements Shape {

    public void calculate(int choice) {

        Scanner sc = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("Enter radius:");
                double r = sc.nextDouble();
                double area = Math.PI * r * r;
                System.out.println("Area of Circle: " + area);
                break;

            case 2:
                System.out.println("Enter length and breadth:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Area of Rectangle: " + (l * b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}


public class Abstraction2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape s = new Calculate(); 

        System.out.println("1. Circle\n2. Rectangle");
        System.out.println("Enter choice:");

        int ch = sc.nextInt();

        s.calculate(ch);
    }
}
