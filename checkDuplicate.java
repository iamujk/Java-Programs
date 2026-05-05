import java.util.HashSet;

public class checkDuplicate {
    public static void main(String[] args) {
        String[] str={"java","c++","java"};
        HashSet<String> hs=new HashSet<>();
        for(String s:str){
            if(!hs.add(s)){
                System.out.println("Duplicate present");
                System.exit(0);
            }
        }
        System.out.println("Duplicate not present");
    }
}
