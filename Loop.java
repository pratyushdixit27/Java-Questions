// To check whether Loop exist or not and print the data and next
public class Loop {
    public static class Node{
        int data;
        Node next;
    }
    public static void check(Node head){
        Node temp=head;
        Node fast,slow;
        slow=head.next; fast=head.next.next;
        while(fast!=null && fast.next!=null && slow!=fast){
            slow=slow.next; fast= fast.next.next;


        }
            if(fast==null || fast.next==null){
                System.out.println("Loops does not exist");
            }
            else if(slow==fast){
                System.out.println("Loop exist");
                while(slow!=temp){
                    temp=temp.next;
                    slow=slow.next;
                }
              System.out.println(temp);
                System.out.println(temp.data);
            }
    }
    public static void main(String[]args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        n1.data = 10;
        n1.next = n2;
        n2.data = 20;
        n2.next = n3;
        n3.data = 30;
        n3.next = n4;
        n4.data = 40;
        n4.next = n3;
        check(n1);
    }
}
