import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int originalNumber=n;
        int reverse=0;
        while(n>0){
            int r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        System.out.println("reverse="+reverse);
        if(originalNumber==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
