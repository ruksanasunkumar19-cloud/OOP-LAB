class Book{
String title;
String author;
String isbn;

Book(String title,String author,String isbn){
this.title=title;
this.author=author;
this.isbn=isbn;
}
}

class EBook extends Book{
double fileSize;

EBook(String title,String author,String isbn,double fileSize){
super(title,author,isbn);
this.fileSize=fileSize;
}

void display(){
System.out.println("Title:"+title);
System.out.println("Author:"+author);
System.out.println("ISBN:"+isbn);
System.out.println("File Size:"+fileSize);
}
}

class PrintedBook extends Book{
int pageCount;

PrintedBook(String title,String author,String isbn,int pageCount){
super(title,author,isbn);
this.pageCount=pageCount;
}

void display(){
System.out.println("Title:"+title);
System.out.println("Author:"+author);
System.out.println("ISBN:"+isbn);
System.out.println("Page Count:"+pageCount);
}
}

public class BookInheritance{
public static void main(String[] args){

EBook e1=new EBook("Java Programming","James",1234+"",5.5);
PrintedBook p1=new PrintedBook("Python Basics","Guido",5678+"",350);

System.out.println("EBook Details");
e1.display();

System.out.println("\nPrinted Book Details");
p1.display();

}
}