// INSERT AT BEGINING

public class LinkedList {
    static class Node{
        int data;
        Node next;

    }

        public static void insertAtBegin(Node head, int value){
Node temp=new Node();
temp.data=value;
temp.next=head;
traverse(temp);

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
        n1.data=10; n1.next=n2;
        n2.data=20; n2.next=n3;
        n3.data=30; n3.next=null;

        insertAtBegin(n1, 25);

    }
}
