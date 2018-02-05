import java.util.*;

public class Palin {
    int num,revnum;
    Palin(){
        num=0;
        revnum=0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
    }
    int reverse(int y){
        if(y==0){
            return revnum;
        }else{
            int rem = y%10;
            revnum = (revnum*10)+rem;
            return reverse(y/10);
        }
    }
    void check(){
        revnum = reverse(num);
        if(num==revnum){
            System.out.println("The number -"+num+" is Palindrome");
        }else{
            System.out.println("The number -"+num+" is not Palindrome. Its reverse is -"+revnum);
        }
    }
    public static void main(String[] args) {
        Palin obj = new Palin();
        obj.accept();
        obj.check();

    }
    
}