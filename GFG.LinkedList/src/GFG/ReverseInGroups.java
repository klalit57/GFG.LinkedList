package GFG;

public class ReverseInGroups {
    public static Node21 reverseInGroups1(Node21 head, int k){  //GFG Recursive
        Node21 curr=head;
        Node21 prev=null;
        Node21 next=null;

        int count=0;
        while(curr!=null && count<k){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        count++;
        }
        if(next!=null){
            Node21 rest_head=reverseInGroups1(next,k);
            head.next=rest_head;
        }
        return prev;
    }

    public static Node21 reverseInGroups2(Node21 head, int k){  //GFG Iterative
        Node21 curr=head;
        Node21 prevFirst=null;
        boolean isFirstPass=true;

        while(curr!=null) {
            Node21 first = curr;
            Node21 prev = null;
            int count = 0;
            while (curr != null && count < k) {
                Node21 next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            if (isFirstPass) {
                head = prev;
                isFirstPass = false;
            } else {
                prevFirst.next = prev;
            }
                prevFirst = first;
            }
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

        head=reverseInGroups1(head,3);
        printList1(head);

        head=reverseInGroups2(head,3);
        printList1(head);

    }

}
