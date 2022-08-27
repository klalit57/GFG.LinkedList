package GFG;
class Node17{
    int data;
    Node17 next;
    Node17 prev;
    Node17(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class CircularDoublyLinkedList {
    public static Node17 insertFirstCdll(Node17 head,int data){
        Node17 newNode= new Node17(data);

        if(head==null){
        newNode.next=newNode;
        newNode.prev=newNode;

        }else{

            newNode.next=head;
            newNode.prev=head.prev;

            head.prev.next=newNode;

            head.prev=newNode;
        }
        head=newNode;
        return head;
    }
    public static void main(String [] args){

    }
}
