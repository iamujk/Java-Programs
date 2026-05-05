import java.util.Random;

public class math {
    public static void main(String[] args) {
        int n=64;
        int n2=65;
        System.out.println(Math.sqrt(n)+" "+Math.sqrt(n2));
 int n3=(int)Math.sqrt(n2);  //typecasting
        System.out.println(n3);
        System.out.println(Math.random());

        Random rd=new Random();  //random class
        int randomNum=rd.nextInt(1000);
        System.out.println(randomNum);
    }

}
