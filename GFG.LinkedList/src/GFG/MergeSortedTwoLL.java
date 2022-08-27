package GFG;

public class MergeSortedTwoLL {
    public static Node21 mergeTwoSortedLL(Node21 head1, Node21 head2){
        Node21 dummy=new Node21(0);
        Node21 trav=dummy;
        Node21 a=head1;
        Node21 b=head2;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                trav.next=a;
                a=a.next;
                trav=trav.next;
            }
            else if(b.data<a.data){
                trav.next=b;
                b=b.next;
                trav=trav.next;
            }
        }
        if(a!=null){
            trav.next=a;
        }
        if(b!=null){
            trav.next=b;
        }
        return dummy.next;
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
        Node21 head2 = insertFirst(null, 120);
        head2 = insertFirst(head2, 100);
        head2 = insertFirst(head2, 80);
        head2 = insertFirst(head2, 50);
        head2 = insertFirst(head2, 30);
        head2 = insertFirst(head2, 10);
        head2 = insertFirst(head2, 5);
        printList1(head2);

        Node21 head1= insertFirst(null, 70);
        head1 = insertFirst(head1, 60);
        head1 = insertFirst(head1, 50);
        head1 = insertFirst(head1, 40);
        head1 = insertFirst(head1, 30);
        head1 = insertFirst(head1, 20);
        head1 = insertFirst(head1, 10);
        printList1(head1);

        printList1(mergeTwoSortedLL(head1,head2));
    }
}
