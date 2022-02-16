public class StringQuestion {
    public static void main(String[] args) {
        String s="Deepak Sir is Great";
        System.out.println(s);
        //Problem 1
        System.out.println(s.toLowerCase());
        //Problem 2
        System.out.println(s.toUpperCase());
        //Problem 3
        System.out.println(s.replace(" ", "_"));
        //Problem 4
        String letter = "Dear <|name|>, Thanks alot";
        System.out.println(letter.replace("<|name|>", "Pratyush"));

        // Detect double and triple spaces in a string
        String myString =" This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

    }
}
