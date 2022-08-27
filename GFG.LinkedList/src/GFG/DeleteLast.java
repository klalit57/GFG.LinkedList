package GFG;

class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteLast{
    public static Node6 deleteLast(Node6 head){ //Method
        if(head==null || head.next==null){
            return null;
        }
        else{
            Node6 temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        return head;
    }

    public static Node6 insertEnd(Node6 head, int x){
        Node6 node=new Node6(x);
        if(head==null){
            return node;
        }

        Node6 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public static void printList1(Node6 head){  //Iterative
        Node6 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String [] args){
        Node6 head=insertEnd(null,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        head=insertEnd(head,40);
        printList1(head);

        head=deleteLast(head);
        printList1(head);
        head=deleteLast(head);
        printList1(head);
        head=deleteLast(head);
        printList1(head);
        head=deleteLast(head);
        printList1(head);


    }
}
