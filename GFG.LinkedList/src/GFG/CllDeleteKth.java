package GFG;

class Node16{
    int data;
    Node16 next;
    Node16(int data){
        this.data=data;
        this.next=null;
    }
}

public class CllDeleteKth{
    public static Node16 deleteKthCLL1(Node16 head, int pos){ //Naive
        if(head==null || (pos==1 && head.next==head)){
            System.out.println("listEmpty");
            return null;
        }
        else if(pos==1){
            head.data=head.next.data;
            head.next=head.next.next;
        }
        else {
            Node16 curr = head;
            /*int i=1;
            while (i<pos-1) {
                curr = curr.next;
            }*/
            for(int i=0;i<pos-2;i++){
                curr=curr.next;
            }
            curr.next = curr.next.next;
        }
        return head;
    }



    public static Node16 insertLastCLL1(Node16 head, int data){  //Naive
        Node16 newNode = new Node16(data);
        if(head==null){
            newNode.next=newNode;
            head=newNode;
        }else {
            Node16 curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            newNode.next = head;
            curr.next = newNode;
        }
        return head;
    }


    public static void printList1(Node16 head){ //forLOOP
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        for(Node16 temp=head.next;temp!=head;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }


    public static void main(String [] args){

        Node16 head=insertLastCLL1(null,10);
        printList1(head);
        head=insertLastCLL1(head,20);
        printList1(head);
        head=insertLastCLL1(head,30);
        printList1(head);
        head=insertLastCLL1(head,40);
        printList1(head);

        head=deleteKthCLL1(head,2);
        printList1(head);
        head=deleteKthCLL1(head,1);
        printList1(head);

        head=deleteKthCLL1(head,1);
        printList1(head);
        head=deleteKthCLL1(head,1);
        printList1(head);

        head=deleteKthCLL1(head,1);
        printList1(head);
        head=deleteKthCLL1(head,1);
        printList1(head);

    }
}



