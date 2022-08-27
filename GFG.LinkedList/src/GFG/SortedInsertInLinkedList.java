package GFG;

class Node18{
    int data;
    Node18 next;
    Node18(int data){
        this.data=data;
        this.next=null;
    }
}
public class SortedInsertInLinkedList {
    public static Node18 sortedInsert(Node18 head, int data){
        Node18 newNode = new Node18(data);

        if(head==null){
            return newNode;
        }

        if(head.data>newNode.data){
            newNode.next=head;
            return newNode;
        }
        Node18 temp = head;
            while (temp.next!=null && temp.next.data < newNode.data) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;


        return head;
    }
    public static Node18 insertFirst(Node18 head, int x){
        Node18 temp= new Node18(x);
        temp.next=head;
        return temp;
    }
    public static void printList1(Node18 head){  //Iterative
        Node18 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Node18 head= insertFirst(null,40);
        head=insertFirst(head,30);
        printList1(head);
        head=insertFirst(head,20);
        printList1(head);
        head=insertFirst(head,10);
        printList1(head);

        head=sortedInsert(head,30);
        printList1(head);

        head=sortedInsert(head,50);
        printList1(head);

        head=sortedInsert(head,5);
        printList1(head);

        head=sortedInsert(head,50);
        printList1(head);

        head=sortedInsert(head,5);
        printList1(head);
    }
}
