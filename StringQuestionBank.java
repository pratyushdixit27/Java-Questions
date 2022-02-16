public class StringQuestionBank {
    public static void main(String[] args) {
        String s ="Deepak";
        int length = s.length();
        System.out.println(length);
        char[] ch= s.toCharArray();
        for(int i = ch.length-1; i>=0; i-- ){
            System.out.println(ch[i]);
        }
    }
}

class Ques2{
    public static void main(String[]args){
        String s= "@$Java i$s gre@at";
        System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
    }
}

class   Q2{
    public static void main(String[] args) {
        String s2="J ava i  s g reat";
        System.out.println(s2.replaceAll("\\s", ""));
    }
}

