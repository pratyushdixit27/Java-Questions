public class LinkedList3 {
    public static class Node{
        int data;
        Node next;
    }

    public static void middle(Node head){
        Node temp=head;
        Node fast, slow;
        slow=temp;
        fast=temp.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }


    public static void main(String[]args){
        Node n1= new Node();
        Node n2= new Node();
        Node n3= new Node();
        Node n4=new Node();
        n1.data=10; n1.next=n2;
        n2.data=20; n2.next=n3;
        n3.data=30; n3.next=n4;
        n4.data=40; n4.next=null;
        middle(n1);
    }
}
