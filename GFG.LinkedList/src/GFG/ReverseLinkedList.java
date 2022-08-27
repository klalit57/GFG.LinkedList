package GFG;

import java.util.ArrayList;

class Node21{
    int data;
    Node21 next;
    Node21(int data){
        this.data=data;
        this.next=null;
    }
}

public class ReverseLinkedList {
    public static Node21 reverseList1(Node21 head){    //GFG Efficient iterative
        Node21 prev=null;
        Node21 curr=head;

        while(curr!=null){
            Node21 next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }

    public static Node21 reverseList2(Node21 head){ //GFG Naive iterative
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(Node21 curr=head;curr!=null;curr=curr.next){
            arr.add(curr.data);
        }
        for(Node21 curr=head;curr!=null;curr=curr.next){
            curr.data=arr.remove(arr.size()-1);
        }
        return head;
    }

    public   static Node21 reverseList3(Node21 head){//GFG recursive Method-1 from last node to 1st
        if(head==null || head.next==null ){   //|| head.next==null
            return head;
        }
        Node21 revHead= reverseList3(head.next);
        Node21 revTail=head.next;
        revTail.next=head;
        head.next=null;
        return revHead;
    }

    public   static Node21 reverseList4(Node21 curr, Node21 pre){//GFG recursive Method-2 from 1st node to last
        if(curr==null){ //
            return pre;
        }
        Node21 next=curr.next;
        curr.next=pre;
        return reverseList4(next,curr);

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

    public static void main(String [] args){
        Node21 head= insertFirst(null,40);
        head=insertFirst(head,30);
        printList1(head);
        head=insertFirst(head,20);
        printList1(head);
        head=insertFirst(head,10);
        printList1(head);
        head=insertFirst(head,60);
        printList1(head);
        head=insertFirst(head,90);
        printList1(head);
        head=insertFirst(head,100);
        printList1(head);

        head=reverseList1(head);
        printList1(head);

        head=reverseList2(head);
        printList1(head);

        head=reverseList3(head);
        printList1(head);

       head=reverseList4(head,null);
        printList1(head);


    }
}
