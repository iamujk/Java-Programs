import java.util.LinkedHashSet;

public class nonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "Ujjwal Kumar";
        String s = "";

        /*for (int i = 0; i < str.length(); i++) {
            int flag = 0;

            for (int j = 0; j < s.length(); j++) {
                if (str.charAt(i) == s.charAt(j)) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                s += str.charAt(i);
            }
        }
        System.out.println(s);*/
        LinkedHashSet<Character> lhs=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            lhs.add(str.charAt(i));
        }
        for(Character c:lhs){
            s+=c;
        }
        System.out.println(s);
    }
}
