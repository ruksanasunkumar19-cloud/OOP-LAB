class Employee{
String name;
double salary;
Employee(String name,double salary){
this.name=name;
this.salary=salary;
}
}
class Manager extends Employee{
int teamsize;
Manager(String name,double salary,int teamsize){
super(name,salary);
this.teamsize=teamsize;
}
}
class Projectmanager extends Manager{
String projectname;
Projectmanager(String name,double salary,int teamsize,String projectname){
super(name,salary,teamsize);
this.projectname=projectname;
}
void display(){
System.out.println("name:"+name);
System.out.println("salary:"+salary);
System.out.println("teamsize:"+teamsize);
System.out.println("prjectname:"+projectname);
}
}
public class Hierachicalinheritance{
public static void main(String[] args){
Projectmanager p1=new Projectmanager("ruksanasun",200000,2,"kkjik");
p1.display();
}
}
