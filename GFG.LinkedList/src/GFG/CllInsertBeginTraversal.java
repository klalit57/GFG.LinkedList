package GFG;

class Node13{
    int data;
    Node13 next;
    Node13(int data){
        this.data=data;
        this.next=null;
    }
}

public class CllInsertBeginTraversal {
    public static Node13 insertBeginCLL1(Node13 head, int data){  //Naive
        Node13 newNode = new Node13(data);
        if(head==null){
           newNode.next=newNode;
        }else {
            Node13 curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            newNode.next = head;
            curr.next = newNode;

        }
        return newNode;
    }

    public static Node13 insertBeginCLL2(Node13 head, int data){  //efficient
        Node13 newNode= new Node13(data);
        if(head==null){
            newNode.next=newNode;
            return newNode;
        }
        else{
          newNode.next=head.next;
          head.next=newNode;

          int t=head.data;
          head.data=newNode.data;
          newNode.data=t;

          return head;
        }
    }
    public static void printList1(Node13 head){ //forLOOP
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        for(Node13 temp=head.next;temp!=head;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }

    public static void printList2(Node13 head){ //DO While loop
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node13 temp=head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp!= head);
        System.out.println();
    }

    public static void main(String [] args){

        Node13 head=insertBeginCLL1(null,10);
        printList1(head);
        head=insertBeginCLL1(head,20);
        printList1(head);
        head=insertBeginCLL2(head,30);
        printList2(head);
        head=insertBeginCLL2(head,40);
        printList2(head);

    }
}
