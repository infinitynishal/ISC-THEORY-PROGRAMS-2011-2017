import java.util.*;
public class Product {
    String name;
    int code;
    double amount;

    Product(String n,int c,double p){
        name=n;
        code=c;
        amount=p;
    }
    
    void show(){
        System.out.println("Name : "+name+"\nCode : "+code+"\nAmount : "+amount);
    }
}