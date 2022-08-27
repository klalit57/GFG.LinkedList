package GFG;

class Node20{
    int data;
    Node20 next;
    Node20(int data){
        this.data=data;
        this.next=null;
    }
}
public class NthNodeFromEnd {
    public static int nthFromEnd1(Node20 head, int k){  //MyCode
        if(k<=0){
            return -1;
        }
        Node20 temp = head;
        int i=1;
        Node20 res=head;
         while(temp!=null){
             if(i>k){
                 res=res.next;
             }
             temp=temp.next;
             i++;
         }
         if(i<=k){
             return -1;
         }
         return res.data;
    }

    public static int nthFromEnd2(Node20 head, int k){  //GFG Code Method-1
        int len=0;
        for(Node20 curr=head;curr!=null;curr=curr.next){
            len++;
        }
        if(len<k){
            return -1;
        }
        Node20 curr = head;

        for(int i=0;i<len-k;i++){
            curr=curr.next;
        }
        return curr.data;
    }

    public static int nthFromEnd3(Node20 head, int k){   //GFG 2nd method
        if (head == null) {
            return-1;
        }
        Node20 first=head;
        for(int i=0;i<k;i++){
            if(first==null){
                return -1;
            }
            first=first.next;
        }
        Node20 second =head;
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        return second.data;
    }

    public static Node20 insertFirst(Node20 head, int x){
        Node20 temp= new Node20(x);
        temp.next=head;
        return temp;
    }
    public static void printList1(Node20 head){  //Iterative
        Node20 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Node20 head= insertFirst(null,40);
        head=insertFirst(head,30);
        printList1(head);
        head=insertFirst(head,20);
        printList1(head);
        head=insertFirst(head,10);
        printList1(head);
        head=insertFirst(head,60);
        printList1(head);
        head=insertFirst(head,90);
        printList1(head);
        head=insertFirst(head,100);
        printList1(head);

        System.out.println(nthFromEnd1(head,2));
        System.out.println(nthFromEnd1(head,4));
        System.out.println(nthFromEnd1(head,8));
        System.out.println(nthFromEnd1(head,3));

        System.out.println(nthFromEnd2(head,2));
        System.out.println(nthFromEnd2(head,4));
        System.out.println(nthFromEnd2(head,8));
        System.out.println(nthFromEnd2(head,3));

        System.out.println(nthFromEnd3(head,2));
        System.out.println(nthFromEnd3(head,4));
        System.out.println(nthFromEnd3(head,8));
        System.out.println(nthFromEnd3(head,3));


    }
}


