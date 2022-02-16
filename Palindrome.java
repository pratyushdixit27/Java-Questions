import java.util.*;
public class Palindrome {

    // PALINDROME = initial number = Reverse
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");

    int num = sc.nextInt();
    int temp = num;
    int rev=0, rem;
    while(temp!=0){
        rem = temp%10;
        rev= rev*10+rem;
        temp=temp/10;
    }
    if(rev==num){
        System.out.println("The number is palindrome number");
    }
    else{
        System.out.println("The number is not a palindrome number");
    }
}

}
