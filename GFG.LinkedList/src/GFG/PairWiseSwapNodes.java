package GFG;

public class PairWiseSwapNodes {
    public static Node21 pairWiseSwap1(Node21 head){  //Method-1 by swapping data
        Node21 curr=head;
        while(curr!=null && curr.next!=null){
            int temp=curr.data;
            curr.data=curr.next.data;
            curr.next.data=temp;
            curr=curr.next.next;
        }
        return head;
    }

    public static Node21 pairWiseSwap2(Node21 head){  //GFG better approach
        if(head==null || head.next==null){
            return head;
        }

        Node21 curr=head.next.next;
        Node21 prev=head;
        head=head.next;
        head.next=prev;
        while (curr != null && curr.next != null){
            prev.next=curr.next;
            prev=curr;
            curr = curr.next.next;
            prev.next.next=prev;
        }
        prev.next=curr;
        return head;
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
        Node21 head = insertFirst(null, 24);
        head = insertFirst(head, 20);
        printList1(head);
        head = insertFirst(head, 7);
        printList1(head);
        head = insertFirst(head, 8);
        printList1(head);
        head = insertFirst(head, 15);
        printList1(head);
        head = insertFirst(head, 17);
        printList1(head);
        head = insertFirst(head, 80);
        printList1(head);

        head = pairWiseSwap2(head) ;
        printList1(head);
    }

    }
