public class stringfunctions {
    public static void main(String[] args) {
        String s="Hello there";
        String str="hello THeRe";
        System.out.println(s.contains("f"));
        System.out.println(s.equalsIgnoreCase(str));
        String res=str.substring(2,4);
        String res2=str.substring(5);
        System.out.println(res);
        System.out.println(res2);
    }
}
