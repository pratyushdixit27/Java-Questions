// INSERT AT END
public class LinkedList2 {
    static class Node{
        int data;
        Node next;

    }
    public static void insertAtEnd(Node head, int value){
        Node temp=head;
        Node n5=new Node();
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n5;
        n5.data=value;
        n5.next=null;
        traverse(head);
    }
    public static void traverse(Node head){
        Node temp2=head;
        while(temp2!=null){
            System.out.println(temp2.data);
            temp2=temp2.next;
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

        insertAtEnd(n1,50);
    }
}
