public class Del_LL2 {
   public static class Node
   {
        int data;
        Node next;
    }
static void delAtEnd(Node head, int pos){
       Node temp = head;
       int count=1;
       while(count<pos-1){
           temp=temp.next;
           count++;
       }
       temp.next=null;
       traverse(head);

}
public static void traverse(Node head){
       while(head!=null) {
           System.out.println(head.data);
           head = head.next;

       }
}




    public static void main(String[] args)
    {
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();

        n1.data=10; n1.next=n2;
        n2.data=20; n2.next=n3;
        n3.data=30; n3.next=n3;
        n4.data=40; n3.next=null;

        delAtEnd(n1, 4);
    }
}
