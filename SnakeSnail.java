public class SnakeSnail {
    public static class Node{
        int data;
        Node next;
    }
           public static void traverse(Node head)
           {
                 Node temp=head;
                 while(temp.next!=null && temp.next!=head){
                     temp=temp.next;
                 }
                 if(temp.next==null){
                     System.out.println("Given Linked List is snake");
                 }
                 else if(temp.next==head){
                     System.out.println("Given Linked List snake is Snail");
                 }
           }

    public static void main(String[] args) {
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();

        n1.data= 10; n1.next= n2;
        n2.data= 20; n2.next= n3;
        n3.data= 30; n3.next= n1;
        traverse(n1);
    }
}
