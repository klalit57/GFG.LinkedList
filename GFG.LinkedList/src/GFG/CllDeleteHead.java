package GFG;

class Node15{
    int data;
    Node15 next;
    Node15(int data){
        this.data=data;
        this.next=null;
    }
}

public class CllDeleteHead{
    public static Node15 deleteHeadCLL1(Node15 head){ //Naive
        if(head==null || head.next==head){
            return null;
        }else{
            Node15 curr= head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=head.next;
            head=head.next;
        }
        return head;
    }

    public static Node15 deleteHeadCLL2(Node15 head){ //efficient
        if(head==null || head.next==head){
            return null;
        }else{
            head.data=head.next.data;
            head.next=head.next.next;
        }
        return head;
    }


    public static Node15 insertLastCLL1(Node15 head, int data){  //Naive
        Node15 newNode = new Node15(data);
        if(head==null){
            newNode.next=newNode;
            head=newNode;
        }else {
            Node15 curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            newNode.next = head;
            curr.next = newNode;
        }
        return head;
    }


    public static void printList1(Node15 head){ //forLOOP
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        for(Node15 temp=head.next;temp!=head;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }


    public static void main(String [] args){

        Node15 head=insertLastCLL1(null,10);
        printList1(head);
        head=insertLastCLL1(head,20);
        printList1(head);
        head=insertLastCLL1(head,30);
        printList1(head);
        head=insertLastCLL1(head,40);
        printList1(head);

        head=deleteHeadCLL1(head);
        printList1(head);
        head=deleteHeadCLL1(head);
        printList1(head);

        head=deleteHeadCLL2(head);
        printList1(head);
        head=deleteHeadCLL2(head);
        printList1(head);



    }
}


