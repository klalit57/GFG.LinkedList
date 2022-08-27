package GFG;

public class DetectLoopSLL {

     public static boolean detectLoop1(Node21 head){ //Mycode GFG floyd cycle
         Node21 slow=head;
         Node21 fast=head;
         while(fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if(slow==fast){
                 return true;
             }
         }
         return false;
    }

    public static void removingLoop(Node21 head){ //Mycode GFG floyd cycle
        Node21 slow=head;
        Node21 fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast){
            return;
        }
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
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

    public static void makeAloop(Node21 head, int pos){  //Iterative
        Node21 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        Node21 temp2=head;
        int count=1;
        while(count<pos){
            temp2=temp2.next;
            count++;
        }

        temp.next=temp2;

    }

    public static void main(String [] args) {
        Node21 head = insertFirst(null, 40);
        head = insertFirst(head, 30);
        printList1(head);
        head = insertFirst(head, 20);
        printList1(head);
        head = insertFirst(head, 10);
        printList1(head);
        head = insertFirst(head, 60);
        printList1(head);
        head = insertFirst(head, 90);
        printList1(head);
        head = insertFirst(head, 100);
        printList1(head);

        makeAloop(head,3);

        System.out.println(detectLoop1(head));

        System.out.println(detectLoop1(head));

        removingLoop(head);
        System.out.println(detectLoop1(head));
        printList1(head);

    }
}
