import java.util.HashSet;
import java.util.Scanner;

public class panagram {
    static boolean isPanagram(String str){
        char[] s=str.toCharArray();
        HashSet<Character> hs=new HashSet<>();
        for(Character c:s){
            if(Character.isAlphabetic(c)){
                hs.add(Character.toLowerCase(c));
            }
        }
        if(hs.size()==26){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        if(isPanagram(s)){
            System.out.println("Panagram");

        }
        else{
            System.out.println("Not a panagram");
        }
    }
}
