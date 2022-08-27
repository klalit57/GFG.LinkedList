package GFG;

public class DeleteNodeOnlyPointer {
    public static void deleteNodeOnlyPointer(Node21 random){
        random.data=random.next.data;
        random.next=random.next.next;
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
    }
}
