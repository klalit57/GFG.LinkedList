package GFG;

class Node11{
    int data;
    Node11 prev;
    Node11 next;
    Node11(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DllReverse {
    public static Node11 reverseDll1(Node11 head){
        if(head==null || head.next==null){
            return head;
        }
      Node11 pre=null;
        Node11 curr=head;

        while(curr!=null){
            pre=curr.prev;
            curr.prev=curr.next;
            curr.next=pre;
            curr=curr.prev;
        }
        return pre.prev;
    }
    public static Node11 insertLast1(Node11 head, int data){
        Node11 newNode= new Node11(data);
        if(head==null){
            return newNode;
        }
        Node11 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }

    public static void printList(Node11 head){
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
        Node11 head=insertLast1(null,30);
        head=insertLast1(head,20);
        head=insertLast1(head,10);
        printList(head);

        head=reverseDll1(head);
        printList(head);

    }
}
