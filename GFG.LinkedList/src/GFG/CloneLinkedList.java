package GFG;

import java.util.HashMap;

class Node22{
    int data;
    Node22 next;
    Node22 random;
    Node22(int data){
        this.data=data;
        this.next=null;
        this.random=null;
    }
}
public class CloneLinkedList {
    public static Node22 cloneList1(Node22 head1){  //MyCode
        Node22 head2=new Node22(head1.data);
        Node22 curr1=head1;
        Node22 curr2=head2;
        while(curr1.next!=null){
            curr2.next=new Node22(curr1.next.data);
            curr1=curr1.next;
            curr2=curr2.next;
        }
        curr1=head1;
        curr2=head2;
        while(curr1!=null){
            Node22 random2=head2;
            while(curr1.random.data!=random2.data){
                random2=random2.next;
            }
            curr2.random=random2;
            curr2=curr2.next;
            curr1=curr1.next;
        }
        return head2;
    }

    public static Node22 cloneList2(Node22 head1){  //GFG Method-1
        HashMap<Node22,Node22> hm= new HashMap<>();
        Node22 curr=head1;
        while(curr!=null){
            hm.put(curr, new Node22(curr.data));
            curr=curr.next;
        }

        Node22 head2=hm.get(head1);

        curr=head1;

        while(curr!=null){
            hm.get(curr).next=hm.get(curr.next);
            hm.get(curr).random=hm.get(curr.random);
            curr=curr.next;
        }
        return head2;
    }


    public static Node22 cloneList3(Node22 head1){  //GFG Method-2
        Node22 curr=head1;
        while(curr!=null){
            Node22 next=curr.next;
            curr.next=new Node22(curr.data);
            curr.next.next=next;
            curr=next;
        }
        curr= head1;
        while(curr!=null){
            curr.next.random=(curr.random!=null)?curr.random.next:null;
            curr=curr.next.next;
        }
        Node22 head2=head1.next;
        curr=head2;

        while(curr!=null && curr.next!=null){
            Node22 next=curr.next;
            curr.next=curr.next.next;
            curr=next.next;
        }
        return head2;
    }

    public static Node22 insertFirst(Node22 head, int x){
        Node22 temp= new Node22(x);
        temp.next=head;
        return temp;
    }

    public static void printList1(Node22 head){  //Iterative
        Node22 temp=head;
        while(temp!=null){
            System.out.println(temp.data+" "+temp.random.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String [] args) {
        Node22 head = insertFirst(null, 20);
        head = insertFirst(head, 15);
        head = insertFirst(head, 22);
        head = insertFirst(head, 5);
        head = insertFirst(head, 10);
        head = insertFirst(head, 16);
        head = insertFirst(head, 8);


        head.random=head.next.next.next;
        head.next.random=head.next.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next;
        head.next.next.next.next.random=head.next.next;
        head.next.next.next.next.next.random=head.next.next.next.next.next.next;
        head.next.next.next.next.next.next.random=head.next.next.next.next.next;

        printList1(head);

        //Node22 head1=cloneList1(head);
        //printList1(head1);

        //Node22 head2=cloneList2(head);
        //printList1(head2);

        Node22 head3=cloneList3(head);
        printList1(head3);

    }

}
