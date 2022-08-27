package GFG;

class Node8{
    int data;
    Node8 next;
    Node8(int data){
        this.data=data;
        this.next=null;
    }
}

public class SearchInLinkedList {
    public static int searchInLinkedList1(Node8 head, int data){  //Iterative MyCode
        int res=1;

        while(head!=null && head.data!=data){
            head=head.next;
            res++;
        }
        if(head==null){
            return -1;
        }
        return res;
    }

    public static int searchInLinkedList2(Node8 head, int data){  //Iterative GFG
        int pos=1;

        Node8 curr=head;
        while(curr!=null){
            if(curr.data==data){
                return pos;
            }
            curr=curr.next;
            pos++;
        }
        return -1;
    }

    public static int searchInLinkedList3(Node8 head, int data, int res){  //MyCode Recursive
        if(head==null){
            return -res;
        }
        if(head.data==data){
            return 1;
        }
        res= 1+searchInLinkedList3(head.next,data,res+1);
        return res;
    }

    public static int searchInLinkedList4(Node8 head, int data){  //GFG Recursive
        if(head==null){
            return -1;
        }
        if(head.data==data){
            return 1;
        }else {
            int res = searchInLinkedList4(head.next,data);
            if(res==-1){
                return -1;
            }
            else {
                return res+1;
            }
        }
    }

    public static Node8 insertEnd(Node8 head, int x){
        Node8 node=new Node8(x);
        if(head==null){
            return node;
        }

        Node8 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public static void printList1(Node8 head){  //Iterative
        Node8 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String [] args) {
        Node8 head = insertEnd(null, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        head = insertEnd(head, 40);
        printList1(head);

        System.out.println(searchInLinkedList1(head,20));
        System.out.println(searchInLinkedList2(head,40));

        System.out.println(searchInLinkedList3(head,50,1));

        System.out.println(searchInLinkedList4(head,50));
    }
}
