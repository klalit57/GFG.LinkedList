package GFG;

class Node14{
    int data;
    Node14 next;
    Node14(int data){
        this.data=data;
        this.next=null;
    }
}

public class CllInsertLast {
    public static Node14 insertLastCLL1(Node14 head, int data){  //Naive
        Node14 newNode = new Node14(data);
        if(head==null){
            newNode.next=newNode;
            head=newNode;
        }else {
            Node14 curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            newNode.next = head;
            curr.next = newNode;
        }
        return head;
    }

    public static Node14 insertLastCLL2(Node14 head, int data){  //efficient
        Node14 newNode = new Node14(data);
        if(head==null){
            newNode.next=newNode;
        }else {
            newNode.next=head.next;
            head.next=newNode;


            newNode.data=head.data; //swap data of newNode & head
            head.data=data;
        }
        head=newNode;
        return head;
    }


    public static void printList1(Node14 head){ //forLOOP
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        for(Node14 temp=head.next;temp!=head;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }

    public static void printList2(Node14 head){ //DO While loop
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node14 temp=head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp!= head);
        System.out.println();
    }

    public static void main(String [] args){

        Node14 head=insertLastCLL1(null,10);
        printList1(head);
        head=insertLastCLL1(head,20);
        printList1(head);
        head=insertLastCLL1(head,30);
        printList2(head);
        head=insertLastCLL1(head,40);
        printList2(head);

        Node14 head2=insertLastCLL2(null,10);
        printList1(head2);
        head2=insertLastCLL2(head2,20);
        printList1(head2);
        head2=insertLastCLL2(head2,30);
        printList2(head2);
        head2=insertLastCLL2(head2,40);
        printList2(head2);
    }
}

