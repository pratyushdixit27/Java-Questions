import java.util.*;
class LeapYear2{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year%400==0)
        {
            System.out.println("Leap Year Found");
        }
        else{
            System.out.println("Leap year not found");
        }
    }
}
