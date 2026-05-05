import java.util.*;
public class commonPrefixInArrayOfStrings
{
    public static String commonPrefix(String[] s) {
        for(int i=0;i<s[0].length();i++){
            char ch=s[0].charAt(i);
            for(int j=1;j<s.length;j++){
                if(i>s[j].length() || s[j].charAt(i)!=ch){
                    return s[0].substring(0,i);
                }
            }
        }
        return s[0];
    }
    public static void main(String[] args) {
        String[] str={"ishu","ishan","isa"};
        String cmn=commonPrefix(str);
        System.out.println(cmn);
    }
}
