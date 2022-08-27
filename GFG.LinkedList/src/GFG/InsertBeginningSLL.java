package GFG;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
        this.next=null;
    }
}


public class InsertBeginningSLL {

    public static Node3 insertFirst(Node3 head, int x){
        Node3 temp= new Node3(x);
        temp.next=head;
        return temp;
    }
    public static void printList1(Node3 head){  //Iterative
        Node3 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String [] args){
        Node3 head=insertFirst(null,10);
        printList1(head);
        head=insertFirst(head,20);
        printList1(head);
        head=insertFirst(head,30);
        printList1(head);
        head=insertFirst(head,40);
        printList1(head);

    }
}
