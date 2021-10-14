// Performing Multiple Task from Multiple Thread

 class TaskUsingThread2 extends Thread {

     public void run() {
         System.out.println("Task 1");
     }
 }

     class AnotherTask extends Thread {
         public void run() {
             System.out.println("Task 2");
         }
     }

     class Main {
         public static void main(String[] args) {             // Main Thread created by JVM
             TaskUsingThread t1 = new TaskUsingThread();   //Thread 1 created
             t1.start();

             AnotherTask t2 = new AnotherTask();   // Thread 2 created
             t2.start();
         }
     }
