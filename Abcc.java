public class Abcc extends Thread {

    public void run(){
        try {
            for(int i = 1; i <= 5; i ++){
            Thread.sleep(1000);
            System.out.println("Hello world");
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        Abcc z = new Abcc();
        z.start();
    }
}
