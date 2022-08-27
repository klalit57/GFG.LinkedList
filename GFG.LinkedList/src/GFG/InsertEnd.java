package GFG;

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertEnd {
    public static Node4 insertEnd(Node4 head, int x){
        Node4 node=new Node4(x);
        if(head==null){
            return node;
        }

        Node4 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public static void printList1(Node4 head){  //Iterative
        Node4 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Node4 head=insertEnd(null,10);
        printList1(head);
        head=insertEnd(head,20);
        printList1(head);
        head=insertEnd(head,30);
        printList1(head);
        head=insertEnd(head,40);
        printList1(head);

    }

}
