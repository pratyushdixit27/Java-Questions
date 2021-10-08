import java.util.*;
class FormalDressException extends RuntimeException{
    FormalDressException(String msg){
        super(msg);
    }
}



public class PartyAtCruise {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Which Dress you are wearing? Is it formal code[1] or  informal code[2]: ");
   int dress = sc.nextInt();
    if(dress== 1){
        System.out.println("Welcome to PartyAtCruise");
    }
    else if(dress== 2){
        throw new FormalDressException("Sorry but you cannot come on board");
        }
    }

}
