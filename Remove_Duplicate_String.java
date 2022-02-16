public class Remove_Duplicate_String {
    public static void main(String[]args){
        String s1="Programming";
        StringBuilder sb2= new StringBuilder();
        for(int i=0; i<s1.length(); i++){
            char ch =s1.charAt(i);
            int idx= s1.indexOf(ch, i+1);
            if(idx==-1){
                sb2.append(ch);
            }

        }
        System.out.println(sb2);
    }
}
