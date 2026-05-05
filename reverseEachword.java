public class reverseEachword {
    public static void main(String[] args) {
        String str="Hello java programmer";
        String[] words=str.split("\\s");
        /*String reverseLine="";
        for(String s:words){
            String reverseWord="";
            for(int i=s.length()-1;i>=0;i--){
                reverseWord+=s.charAt(i);
            }
            reverseLine+=reverseWord+" ";
        }
        System.out.println(reverseLine);*/
        String reverseline=" ";
        for(String s:words){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            reverseline+=sb+" ";
        }
        System.out.println(reverseline);
    }
}
