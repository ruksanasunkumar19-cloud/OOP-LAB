class Person{
String name;
int age;
Person(String name,int age){
this.name=name;
this.age=age;
}
}
class Students extends Person{
String Studentid;
String course;
Students(String name,int age,String Studentid,String course){
super(name,age);
this.Studentid=Studentid;
this.course=course;
}
void display(){
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("Studentid:"+Studentid);
System.out.println("course:"+course);
}
}
public class Singleinheritance{
public static void main(String[] args){
Students s1=new Students("joe",18,"ch.sc.u4cse25019","cse");
s1.display();
}
}




