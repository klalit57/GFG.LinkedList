package GFG;

class Node19{
    int data;
    Node19 next;
    Node19(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertMiddleSLL {
    public static Node19 insertMiddle(Node19 head, int data){
        Node19 newNode= new Node19(data);

        if(head==null){
            return null;
        }

        Node19 slow = head;
        Node19 fast=head;
        while (fast.next!=null && fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;
        return head;
    }

    public static void printMiddle(Node19 head){
        if(head==null){
            System.out.println("Middle");
            return;
        }

        Node19 slow = head;
        Node19 fast=head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data+" ");
    }
    public static Node19 insertFirst(Node19 head, int x){
        Node19 temp= new Node19(x);
        temp.next=head;
        return temp;
    }
    public static void printList1(Node19 head){  //Iterative
        Node19 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Node19 head= insertFirst(null,40);
        head=insertFirst(head,30);
        printList1(head);
        head=insertFirst(head,20);
        printList1(head);
        head=insertFirst(head,10);
        printList1(head);

        head=insertMiddle(head,25);
        printList1(head);
        printMiddle(head);

        head=insertMiddle(head,50);
        printList1(head);
        printMiddle(head);

        head=insertMiddle(head,5);
        printList1(head);
        printMiddle(head);

        head=insertMiddle(head,120);
        printList1(head);
        printMiddle(head);

        head=insertMiddle(head,28);
        printList1(head);
        printMiddle(head);
    }
}

