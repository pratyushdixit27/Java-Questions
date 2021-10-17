class Fact{
static void factorial(int n){
for(int i=1; i<n; i++){
result=result*i;
}
System.out.println(result);
}
public static void main(String[]args){
int result=1;
factorial(3);
}
}