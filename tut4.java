public class tut4 {
    public static void main(String[] args) {
        String s1= new String("Deepak");
        String s2=new String("deepak");
        System.out.println(s1==s2);   // Reference Comparison  (FALSE)
        System.out.println(s1.equalsIgnoreCase(s2));     // True (Object Comparison)
    }
}



class tut5{
    public static void main(String[] args) {
        String s1= "deepak";
        String s2="deepak";
        System.out.println(s1.equals(s2));     // Object Comparison
        System.out.println(s1==s2);            // Reference Comparison
    }
}


class tut6{
    public static void main(String[] args) {
        String s1=new String("Deepak");
        String s2=new String("Deepak");
        System.out.println(s1==s2);   // False since both have different memory reference
        System.out.println(s1.equals(s2));  // True
    }
}
