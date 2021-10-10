public class Words {                      //We are talking about Super Keyword and This Keyword.
    int a = 10;
}
class Sentence extends Words{
    int a = 20;
    void show(int a) {
        System.out.println(a);         //30
        System.out.println(this.a);    //20
        System.out.println(super.a);   //10


    }
        public static void main(String[]args){
        Sentence s = new Sentence();
        s.show(30);

        }

}