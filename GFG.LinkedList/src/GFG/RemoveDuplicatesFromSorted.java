package GFG;


public class RemoveDuplicatesFromSorted {
    public static Node21 removeDuplicateFromSorted1(Node21 head){ //mycode
        if(head==null ||head.next==null){
            return head;
        }
        Node21 temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void removeDuplicateFromSorted2(Node21 head){ //GFG

        Node21 curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data== curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
    }
    public static Node21 insertFirst(Node21 head, int x){
        Node21 temp= new Node21(x);
        temp.next=head;
        return temp;
    }
    public static void printList1(Node21 head){  //Iterative
        Node21 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String [] args) {
        Node21 head = insertFirst(null, 30);
        head = insertFirst(head, 30);
        printList1(head);
        head = insertFirst(head, 30);
        printList1(head);
        head = insertFirst(head, 20);
        printList1(head);
        head = insertFirst(head, 20);
        printList1(head);
        head = insertFirst(head, 10);
        printList1(head);
        head = insertFirst(head, 10);
        printList1(head);

        head=removeDuplicateFromSorted1(head);
        printList1(head);

        Node21 head2 = insertFirst(null, 50);
        head2 = insertFirst(head2, 50);
        printList1(head2);
        head2 = insertFirst(head2, 40);
        printList1(head2);
        head2 = insertFirst(head2, 33);
        printList1(head2);
        head2 = insertFirst(head2, 33);
        printList1(head2);
        head2 = insertFirst(head2, 23);
        printList1(head2);
        head2 = insertFirst(head2, 23);
        printList1(head2);

        removeDuplicateFromSorted2(head2);
        printList1(head2);
    }
}
