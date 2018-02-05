import java.util.*;
public class Queue {
    int Que[] = new int[100];
    int size,front,rear;

    Queue(int mm){
        size = mm;
        front = 0;
        rear = 0;
    }

    void addele(int v){
        if(rear<size){
            Que[rear] = v;
            rear++;
        }else{
            System.out.println("Overflow");
        }
    }

    int delele(){
        int n=-9999;
        if(rear==0){
            System.out.println("Underflow");            
        }else if(front==rear){
            n = Que[front];
            front =0;
            rear=0;
        }else{
            n = Que[front];
            front++;    
        }
        return n;
    }
    void display(){
        for(int i=front;i<rear;i++){
            System.out.print(Que[i]+"\t");            
        }System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Queue obj = new Queue(4);
        obj.addele(1);
        obj.addele(2);
        obj.addele(3);
        obj.addele(4);
        obj.display();
        System.out.println(obj.delele());
        obj.display();
        System.out.println(obj.delele());
        obj.display();
    }
}