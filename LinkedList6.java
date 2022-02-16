public class LinkedList6 {
   public static class Node{
        int data;
        Node next;
    }
public static void insertAtAnyPos(Node head, int pos, int value){
       Node temp=head;

       int count=1;
       while(count<pos-1){
           temp=temp.next;
           count++;
       }
       Node n=new Node();
       n.data=value;
       n.next=null;
       temp.next=n;
       n.next=temp.next;

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
        n1.data=10;n1.next=n2;
        n2.data=20;n2.next=n3;
        n3.data=30;n3.next=n4;
        n4.data=40;n4.next=null;
        insertAtAnyPos(n1,3,15);
    }
}
