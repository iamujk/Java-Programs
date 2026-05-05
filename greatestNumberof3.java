public class greatestNumberof3 {
    public static void main(String[] args) {
        int a=10,b=80,c=79;
        int largest=a>b?a:b;
        largest=largest>c?largest:c;
        System.out.println(largest);
    }
}
