//Multithreading using Extending "Thread" Class

public class Threads extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
    public static void main(String[]args){

        Threads t = new Threads();
        t.start();
    }
}