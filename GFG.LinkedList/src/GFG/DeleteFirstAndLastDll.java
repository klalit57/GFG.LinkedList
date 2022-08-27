package GFG;

class Node12{
    int data;
    Node12 prev;
    Node12 next;
    Node12(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DeleteFirstAndLastDll {

    public static Node12 deleteFirstDll(Node12 head){ //Method
        if(head==null || head.next==null){
            return null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        return head;
    }

    public static Node12 deleteLastDll(Node12 head) { //Method
        if (head == null || head.next == null) {
            return null;
        }
        Node12 temp=head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next=null;
        return head;
    }

    public static Node12 insertLast1(Node12 head, int data){
        Node12 newNode= new Node12(data);
        if(head==null){
            return newNode;
        }
        Node12 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }

    public static void printList(Node12 head){
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

        Node12 head=insertLast1(null,30);
        head=insertLast1(head,20);
        head=insertLast1(head,10);
        printList(head);

        head=deleteFirstDll(head);
        printList(head);
        head=deleteLastDll(head);
        printList(head);

    }
}

