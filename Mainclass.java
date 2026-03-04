class a{
int one =1;
}
class b extends a{
int two=2;
}
class c extends b{
int three=3;
}
public class Mainclass {
public static void main(String[] args){
c ob1=new c();
System.out.println(ob1.three);
System.out.println(ob1.two);
System.out.println(ob1.one);
}
}