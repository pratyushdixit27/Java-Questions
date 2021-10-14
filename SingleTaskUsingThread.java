// Performing Single Task from Single Thread

public class SingleTaskUsingThread extends Thread{

    public void run(){
        System.out.println("Task 1");
    }
    public static void main(String[]args){
        TaskUsingThread t1 = new TaskUsingThread();
        t1.start();
    }
}
