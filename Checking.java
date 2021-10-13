import java.util.*;
public class Checking{       //Printing the number using StringBuffer
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to reverse: ");
    int num = sc.nextInt();
    StringBuffer sb = new StringBuffer(String.valueOf(num));
    StringBuffer rev = sb.reverse();
    System.out.println(rev);

}

}
