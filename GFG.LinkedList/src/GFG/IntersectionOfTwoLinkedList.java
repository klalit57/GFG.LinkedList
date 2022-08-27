package GFG;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
    public static int intersectionPoint1(Node21 head1, Node21 head2){  //GFG Method-1
        HashSet<Node21> hs= new HashSet<>();
        Node21 curr1=head1;
        while(curr1!=null){
            hs.add(curr1);
            curr1=curr1.next;
        }
        Node21 curr2=head2;
        while(curr2!=null){
            if(hs.contains(curr2)){
                return curr2.data;
            }
            curr2=curr2.next;
        }
        return -1;
    }

    public static int intersectionPoint2(Node21 head1, Node21 head2){  //GFG Method-2 better
        Node21 curr1=head1;
        Node21 curr2=head2;
        int count1=0;
        int count2=0;

        while(curr1!=null || curr2!=null){
            if(curr1!=null){
                curr1=curr1.next;
                count1++;
            }
            if(curr2!=null){
                curr2=curr2.next;
                count2++;
            }
        }
        curr1=head1;
        curr2=head2;

        int j=1;
        if(count1>count2){
            while(j<=count1-count2){
                curr1=curr1.next;
                j++;
            }
        }else{
            while(j<=count2-count1){
                curr2=curr2.next;
                j++;
            }
        }

        while(curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr1.data;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return -1;
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
        Node21 head2 = insertFirst(null, 12);
        head2.next=head.next.next.next;
        printList1(head2);

        System.out.println(intersectionPoint1(head,head2));

        System.out.println(intersectionPoint2(head,head2));
    }
}
