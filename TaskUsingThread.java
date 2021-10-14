// Performing Single Task from Multiple Thread

public class TaskUsingThread extends Thread{

    public void run(){
        System.out.println("Task 1");
    }
    public static void main(String[]args){             // Main Thread created by JVM
        TaskUsingThread t1 = new TaskUsingThread();   //Thread 1 created
        t1.start();
        
        TaskUsingThread t2 = new TaskUsingThread();   // Thread 2 created
        t2.start();
    }
}
