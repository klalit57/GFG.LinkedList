package GFG;

public class SegregateOddEven {
    public static Node21 SegregateEvenOdd1(Node21 head){ //MyCode Maybe wrong
        Node21 last=head;
        while(last.next!=null){
            last=last.next;
        }
        Node21 stop=last;
        while(head.data%2==1){
            last.next=head;
            head=head.next;
            last=last.next;
            last.next=null;

        }
        Node21 curr=head;
        while(curr.next!=stop){
            if(curr.next.next!=stop && curr.next.data%2==1){
                last.next=curr.next;
                curr.next=curr.next.next;
                last=last.next;
                last.next=null;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }

    public static Node21 SegregateEvenOdd2(Node21 head){ //GFG Better approach
        Node21 evenStart=null;
        Node21 evenEnd=null;
        Node21 oddStart=null;
        Node21 oddEnd=null;

        Node21 curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                if(evenStart==null) {
                    evenStart = curr;
                    evenEnd=curr;
                }else{
                    evenEnd.next=curr;
                    evenEnd=evenEnd.next;
                }
            }
            else{
                if(oddStart==null) {
                    oddStart = curr;
                    oddEnd=curr;
                }else{
                    oddEnd.next=curr;
                    oddEnd=oddEnd.next;
                }
            }
            curr=curr.next;
        }

        if(oddStart==null || evenStart==null){
            return head;
        }
        evenEnd.next=oddStart;
        head=evenStart;
        oddEnd.next=null;
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
        head = insertFirst(head, 12);
        printList1(head);
        head = insertFirst(head, 8);
        printList1(head);
        head = insertFirst(head, 15);
        printList1(head);
        head = insertFirst(head, 17);
        printList1(head);

        head=SegregateEvenOdd2(head);
        printList1(head);
    }
}
