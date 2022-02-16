public class LoopLL {
    public static class Node{
        int data;
        Node next;
    }
    public static void checkLoop(Node head){
        Node temp=head;
        Node  fast,slow;
        slow=head.next; fast=head.next.next;
        while(fast.next!=null && fast!=null & slow!=fast){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null || fast.next==null){
            System.out.println("Loop Does not exist");
        }
        else if(slow==fast){
            System.out.println("Loop Exist");
            while(slow!=temp){
                slow=slow.next;
                temp=temp.next;
            }
            System.out.println(slow.data);
        }
    }



    public static void main(String[]args){
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();
        Node n5=new Node();
        Node n6=new Node();
        n1.data=10;n1.next=n2;
        n2.data=20;n2.next=n3;
        n3.data=30;n3.next=n4;
        n4.data=40;n4.next=n5;
        n5.data=50;n5.next=n6;
        n6.data=60;n6.next=n4;

        checkLoop(n1);
    }
}
