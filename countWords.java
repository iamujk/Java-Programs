import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int num=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                num++;
            }
        }
        System.out.println(num+1);
    }
}
