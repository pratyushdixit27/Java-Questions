public class ThreadName {
    public static void main(String[]args){
        System.out.println(Thread.currentThread().getName()); //main
        System.out.println("Hello");    //Hello
        Thread.currentThread().setName("Deepak");
        System.out.println(Thread.currentThread().getName()); //Deepak

    }
}
