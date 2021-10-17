import java.util.*;
public class Factorial {
    public static void main(String[]args){
        int factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to take out the factorial");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            factorial = factorial * i;

        }
        System.out.println(factorial);

    }
}
