import java.util.Stack;

public class Stack_LinkedList_ {
    static class Node{
        int data;
        Node next;
    }
    public static void traverse(Node head){

        System.out.println("Using Stack");

        Stack st=new Stack();
        Node temp=head;
        while(temp!=null){

            st.push(temp);
            temp=temp.next;

        }
        while(st.isEmpty()!=true){
            Node temp1 = (Node) st.pop();
            System.out.println(temp1.data);
        }
    }


    public static void main(String[] args) {

        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();

        n1.data=10;n1.next=n2;
        n2.data=20;n2.next=n3;
        n3.data=30;n3.next=null;
        traverse(n1);
    }
}
