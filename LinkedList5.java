public class LinkedList5 {
    public static class Node{
        int data;
        Node next;
    }
    public static void insertAtMiddle(Node head, int value){
        Node temp=head;
        Node n=new Node();
        n.data = value;
        Node slow,fast,temp1 = null;
        slow=temp;
        fast=temp;
        while(fast!=null && fast.next!=null){
            temp1=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null) {
            System.out.println("Nodes are even");
            temp1.next = n;
            n.next = slow;
            traverse(temp);
        }
        else if(fast.next==null){
            System.out.println("Node are odd");
            temp1.next = n;
            n.next = slow;
            traverse(temp);
        }
    }
    public static void traverse(Node head)
    {
         Node temp3=head;
         while(temp3!=null){
             System.out.println(temp3.data);
             temp3=temp3.next;
         }
    }

    public static void main(String[] args) {
        Node n1= new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();
        n1.data=10;n1.next=n2;
        n2.data=20;n2.next=n3;
        n3.data=30;n3.next=n4;
        n4.data=40;n4.next=null;

        insertAtMiddle(n1, 15);
    }
}
