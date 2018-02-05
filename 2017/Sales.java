import java.util.*;

public class Sales extends Product{
    int day;
    double tax,totamt;
    Sales(String n,int c,double p,int da){
        super(n, c, p);
        day = da;
        tax = 0;
        totamt = 0;
    }
    void compute(){
        tax = super.amount*12.4/100;
        double fine=0.0;
        if(day>30){
            fine = super.amount*2.5/100;
        }
        totamt = super.amount+tax+fine;
    }
    void show(){
        super.show();
        System.out.println("Total Amount : "+totamt);
    }
   
    public static void main(String[] args) {
        Sales obj = new Sales("Nishal Kulkarni", 161250, 1000.0, 31);
        obj.compute();
        obj.show();
    }
}