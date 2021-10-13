class LeapYear{
public static void main(String[]args){
int year = 20;
if(year%4==0 && year%100==0){
System.out.println("Leap Year Found");
}
else{
System.out.println("Leap year not found");
}
}
}