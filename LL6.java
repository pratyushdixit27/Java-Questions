public class LL6 {
    public static class Node{
        int data;
        Node next;
    }

static void insertAtPos(Node head, int pos, int value){
        Node temp=head;
        int count=1;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        Node temp1 = new Node();
        temp1.data=value;
        temp1.next=null;

        temp1.next=temp.next; 
    temp.next=temp1;

        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
    public static void main(String[] args) {
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        n1.data=10;n1.next=n2;
        n2.data=20;n2.next=n3;
        n3.data=30;n3.next=null;
        insertAtPos(n1,2,11);
    }
}
