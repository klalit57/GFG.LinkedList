package GFG;

class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteFirst {
    public static Node5 deleteFirst(Node5 head){ //Method
        if(head==null){
            return null;
        }else {
            return head.next;
        }
    }

    public static Node5 insertEnd(Node5 head, int x){
        Node5 node=new Node5(x);
        if(head==null){
            return node;
        }

        Node5 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public static void printList1(Node5 head){  //Iterative
        Node5 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String [] args){
        Node5 head=insertEnd(null,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        head=insertEnd(head,40);
        printList1(head);

        head=deleteFirst(head);
        printList1(head);
        head=deleteFirst(head);
        printList1(head);
        head=deleteFirst(head);
        printList1(head);
        head=deleteFirst(head);
        printList1(head);
    }

}
