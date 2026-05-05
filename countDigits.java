import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Number of digits are: "+countDigit(n));
        sc.close(); //closing scanner is good for memory leak
    }
    public static int countDigit(int n){
        int count = 0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
}
