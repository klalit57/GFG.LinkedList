 package GFG;
import java.util.*;

public class PalindromeLL {
    public static boolean checkPalindrome1(Node21 head){  //gfg method-1
        Stack<Node21> s= new Stack<>();
        Node21 curr=head;
        while(curr!=null){
            s.push(curr);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            int x=s.pop().data;
            if(curr.data!=x){
                return false;
            }
            else{
                curr=curr.next;
            }
        }
        return true;
    }

    public static boolean checkPalindrome2(Node21 head){
        Node21 slow=head;
        Node21 fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=reverseList(slow.next);
        slow=slow.next;
        Node21 curr=head;
        while(slow!=null){
            if(slow.data!=curr.data){
                return false;
            }
            slow=slow.next;
            curr=curr.next;
        }
        return true;
    }

    public static Node21 reverseList(Node21 head){
        Node21 pre=null;
        Node21 curr=head;
        while(curr!=null){
            Node21 next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
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
        Node21 head2 = insertFirst(null, 5);
        head2 = insertFirst(head2, 10);
        head2 = insertFirst(head2, 30);
        head2 = insertFirst(head2, 50);
        head2 = insertFirst(head2, 50);
        head2 = insertFirst(head2, 30);
        head2 = insertFirst(head2, 10);
        head2 = insertFirst(head2, 5);
        printList1(head2);

        System.out.println(checkPalindrome1(head2));

        System.out.println(checkPalindrome2(head2));

    }
}
