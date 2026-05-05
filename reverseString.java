public class reverseString {
    public static void main(String[] args) {
        /*String s="toyota";
        String rev="";
        char str[]=s.toCharArray();
        for(int i=str.length-1;i>=0;i--){
            rev=rev+str[i];
        }
        System.out.println(rev);*/
        String str="jdefe";
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}

