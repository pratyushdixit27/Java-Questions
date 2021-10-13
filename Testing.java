//Multithreading by implementing Runnable interface

class Testing implements Runnable{
    public void run(){
        System.out.println("Hello World");
    }
    public static void main(String[]args){
        Testing t = new Testing();
        Thread th = new Thread(t);
        th.start();
    }
    
}