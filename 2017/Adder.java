import java.util.*;
public class Adder {
    int a[]=new int[2];
    Adder(){
        this.a[0]=0;
        this.a[1]=0;
    }
    void readtime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours and Minutes");
        this.a[0] = sc.nextInt();
        this.a[1] = sc.nextInt();
    }
    void addtime(Adder X,Adder Y){
        this.a[0] = X.a[0]+Y.a[0];
        this.a[1] = X.a[1]+Y.a[1];
        while(this.a[1]>59){
            this.a[0]++;
            this.a[1] -= 60;
        }
    }
    void disptime(){
        System.out.println("hours = "+this.a[0]+" and minutes = "+this.a[1]);
    }
    public static void main(String[] args) {
        Adder obj1 = new Adder();
        Adder obj2 = new Adder();
        Adder obj3 = new Adder();

        obj1.readtime();
        obj2.readtime();
        obj3.addtime(obj1, obj2);
        obj3.disptime();
    }
}