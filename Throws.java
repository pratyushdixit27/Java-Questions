import java.io.FileInputStream;
public class Throws {
    void fuck() throws Exception
    {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }
}
class Aaa{
    public static void main(String[]args){
        Throws t = new Throws();
           try {
               t.fuck();
           }
           catch(Exception e){
               System.out.println(e);

           }
           finally{
               System.out.println("Fuck You Bitch");
           }
    }
}