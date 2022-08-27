package GFG;

class Node10{
    int data;
    Node10 prev;
    Node10 next;
    Node10(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DLLInsertLast {

    public static Node10 insertLast1(Node10 head, int data){
        Node10 newNode= new Node10(data);
        if(head==null){
            return newNode;
        }
        Node10 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
         return head;
    }

    public static void printList(Node10 head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Node10 head=insertLast1(null,30);
        head=insertLast1(head,20);
        head=insertLast1(head,10);
        printList(head);

//        Node10 head2=insertBegin2(null,30);
//        head2=insertBegin2(head,20);
//        head2=insertBegin2(head,10);
//        printList(head);
    }
}
