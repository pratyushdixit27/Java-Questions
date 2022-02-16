public class Del_LL3 {
    static class Node{
        int data;
        Node next;
    }
public static void delAtMiddle(Node head){
        Node temp = head;
        Node slow, fast, temp1;
        slow= head;
        fast= head.next;

        while(fast!=null && fast.next!=null){
            temp1=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
            temp.next=slow.next;
            slow.next=null;
            slow=null;
            traverse(head);
        }
        public static void traverse(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
        }

    public static void main(String[] args) {
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();

        n1.data=10; n1.next=n2;
        n2.data=20; n2.next=n3;
        n3.data=30; n3.next=n3;
        n4.data=40; n4.next=null;
        delAtMiddle(n1);
    }
}
