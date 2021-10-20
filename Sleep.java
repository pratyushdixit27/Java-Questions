// Sleep method in Thread Class

public class Sleep extends Thread {
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);

                System.out.println("Love me Bro");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[]args){
        for(int i=1; i<=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        Sleep s = new Sleep();
        s.start();
    }
}
