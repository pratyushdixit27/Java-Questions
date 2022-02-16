// Print the list in reverse order
public class Reverse_LinkedList {
    static class Node{
        int data;
        Node next;
    }
    public static void print(Node head){
        if(head.next==null){
            System.out.println(head.data);
            return;
        }
        print(head.next);
        System.out.println(head.data);


        }

    public static void main(String[]args){
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        n1.data=10;n1.next=n2;
        n2.data=20;n2.next=n3;
        n3.data=30;n3.next=null;
        print(n1);
    }
}
