class InvoiceProcessor {
public void generateInvoice(String name,double amount){
System.out.println("Invoice for "+name+" Amount: "+amount);
}
private double calculateTax(double amount){
return amount*0.1;
}
public void processInvoice(String name,double amount){
double tax=calculateTax(amount);
generateInvoice(name,amount+tax);
}
}

class RetailInvoice extends InvoiceProcessor {
public void generateInvoice(String name,double amount){
double discount=amount*0.05;
System.out.println("Retail Invoice for "+name+" Amount: "+(amount-discount));
}
}

public class Tax {
public static void main(String[] args){
InvoiceProcessor ref=new RetailInvoice();
ref.generateInvoice("John",1000);
ref.processInvoice("John",1000);
}
}