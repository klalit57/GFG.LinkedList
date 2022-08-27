package GFG;

public class LruCacheDesign {
    public static void lruCacheMemory( ){

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
        head = insertFirst(head, 8);
        printList1(head);
        head = insertFirst(head, 15);
        printList1(head);
        head = insertFirst(head, 17);
        printList1(head);
        head = insertFirst(head, 80);
        printList1(head);
    }
}
