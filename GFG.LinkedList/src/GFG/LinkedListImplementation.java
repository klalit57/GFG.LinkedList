package GFG;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListImplementation {
     public static void main(String [] args){
         Node1 head= new Node1(10);
         Node1 sec= new Node1(20);
         Node1 thi= new Node1(30);

         head.next=sec;
         sec.next=thi;
     }
}
