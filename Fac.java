//Sum of N natural number using Recursion
class Fac{
    public static int sum(int x){
        if(x==3)
            return 1;

         return(x+sum(x-1));
    }
    public static void main(String[]args){
        sum(3);
    }
}