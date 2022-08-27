package GFG;

class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertAtGivenPosition {
    public static Node7 insertAtGivenPos(Node7 head, int pos, int x){ //Method
        Node7 curr= new Node7(x);

        if(pos==1){
           curr.next=head;
           return curr;
        }

        Node7 prev=head;
        int i;
        for(i=1;i<=pos-2 && prev!=null;i++){
            prev=prev.next;
        }
        if(prev==null){
            return head;
        }
        curr.next=prev.next;
        prev.next=curr;
        return head;
    }

    public static Node7 insertEnd(Node7 head, int x){
        Node7 node=new Node7(x);
        if(head==null){
            return node;
        }

        Node7 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public static void printList1(Node7 head){  //Iterative
        Node7 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String [] args){
        Node7 head=insertEnd(null,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        head=insertEnd(head,40);
        printList1(head);

        head=insertAtGivenPos(head,2,80);
        printList1(head);
        head=insertAtGivenPos(head,5,70);
        printList1(head);
        head=insertAtGivenPos(head,1,120);
        printList1(head);
        head=insertAtGivenPos(head,7,150);
        printList1(head);
        head=insertAtGivenPos(head,15,200);
        printList1(head);

    }

}
