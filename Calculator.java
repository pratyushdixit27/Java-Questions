import java.util.*;
public class MyCalculators {
    public static void main(String[]args){
        double result;
        Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to MyCalculator!");
        System.out.println("*********");
        System.out.println("Choose your First Number: ");
        double num1 = sc.nextDouble();
        System.out.println("######");
        System.out.println(" Select the operator among this: + , - , * , /: ");
        char operator = sc.next().charAt(0);
        System.out.println("######");
        System.out.println("Choose your Second Number: ");
        double num2 = sc.nextDouble();

        switch(operator){
            case '+':
              result = num1 + num2;
                System.out.println("The addition of " +num1 + '+' +num2 + '='  + result);
                break;
            case'-':
                result = num1-num2;
                System.out.println("The subtraction of " +num1 + '-' +num2 + '='  + result);
                break;

            case'*':
                result = num1*num2;
                System.out.println("The multiplication of " +num1 + '*' +num2 + '='  + result);
                break;

            case'/':
                result = num1/num2;
                System.out.println("The division of " +num1 + '/' +num2 + '='  + result);
                break;
        }
    }
}