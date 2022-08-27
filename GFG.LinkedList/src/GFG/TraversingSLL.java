package GFG;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}

public class TraversingSLL{
    public static void printList1(Node2 head){  //Iterative
        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void printList2(Node2 head) {  //Recursive
    if(head==null){
        System.out.println();
        return;
    }
        System.out.print(head.data+" ");
        printList2(head.next);
    }

    public static void main(String [] args){
        Node2 head= new Node2(10);
        Node2 sec= new Node2(20);
        Node2 thi= new Node2(30);

        head.next=sec;
        sec.next=thi;

        printList1(head);
        printList2(head);
    }
}
