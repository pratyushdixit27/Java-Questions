public class LinkedList4 {
    public static class Node{
        int data;
        Node next;

    }
    public static void middle(Node head, int value){
        Node n = new Node();
        Node temp=head;
        Node fast,slow,temp1;

        slow=head;
        fast=head.next;
        while(fast!=null && fast.next!=null){
            temp=slow;

            slow=slow.next;

            fast=fast.next.next;
        }
        n.data= value;
        temp.next=n;
        n.next=slow;
        traverse(head);
    }
    public static void traverse(Node head){
        Node temp3=head;
        while(temp3!=null){
            System.out.println(temp3.data);
            temp3=temp3.next;
        }
    }



    public static void main(String[] args) {
        Node n1=new Node();
        Node n2=new Node();
        Node n3= new Node();
        n1.data=10; n1.next=n2;
        n2.data=20; n2.next=n3;
        n3.data=30; n3.next=null;
        middle(n1, 15 );

    }
}
