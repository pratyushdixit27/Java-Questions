// Daemon Thread
class DaemonThread extends Thread{
    public void run()
    {
        System.out.println("Daemon Thread");
    }

    public static void main(String[]args)
    {
        System.out.println("Main thread");


        ThreadName t = new ThreadName();
        t.setDaemon(true);
        t.start();
    }
}