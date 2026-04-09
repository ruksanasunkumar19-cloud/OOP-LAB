class Employee {
    private int id;
    private String name;
    private double salary;

    // Setter methods
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }

    // Getter methods
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
}

public class Encapsulation2 {
    public static void main(String[] args){

        Employee e = new Employee();

        e.setId(101);
        e.setName("Rahul");
        e.setSalary(50000);

        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}