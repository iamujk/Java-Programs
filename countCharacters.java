import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        countCharactersInName(str);
    }
    static void countCharactersInName(String s){
        Map<Character,Integer> mp=new HashMap<>();
        char[] str=s.toCharArray();
        for(Character c:str){
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            }
            else{
                mp.put(c,1);
            }
        }
        System.out.println(mp);
    }
}
