
// Factorial Using Recursion

import java.util.*;

public class Recursion {
    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

       System.out.println(factorial(n));
    }

}
