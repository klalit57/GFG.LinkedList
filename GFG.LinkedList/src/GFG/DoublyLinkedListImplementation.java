package GFG;
class Node9{
    int data;
    Node9 prev;
    Node9 next;
    Node9(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DoublyLinkedListImplementation {
    public static Node9 insertBegin1(Node9 head, int data){ //Mycode
        Node9 newNode= new Node9(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        return newNode;
    }

    public static Node9 insertBegin2(Node9 head, int data){ //GFG
        Node9 newNode= new Node9(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        return newNode;
    }

    public static void printList(Node9 head){
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
        Node9 head=insertBegin1(null,30);
        head=insertBegin1(head,20);
        head=insertBegin1(head,10);
        printList(head);

        Node9 head2=insertBegin2(null,30);
        head2=insertBegin2(head,20);
        head2=insertBegin2(head,10);
        printList(head);
    }
}
