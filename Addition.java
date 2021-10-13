//Addition of two user input number

import java.util.*;
class Addition{
public static void main(String[]args){
int c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = sc.nextInt();
System.out.println("Enter Second Number: ");
int b = sc.nextInt();
c=a+b;
System.out.println("Addition of both number is" +c);
}
}