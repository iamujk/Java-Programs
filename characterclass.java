public class characterclass {
    public static void main(String[] args) {
        String str="Fdjhbfjdf dskfnks";
        str=str.toLowerCase();
        char[] s=str.toCharArray();
        for(Character c:s){
            System.out.println("Character is: "+c);
            System.out.println(Character.isAlphabetic(c));
            System.out.println(Character.isLetter(c));
            System.out.println(Character.isDigit(c));
            System.out.println(Character.isWhitespace(c));

        }
        /* Converting char array to string
        char[] re={'a','b','c'};
        String ref=String.valueOf(re);
        System.out.println(ref);*/
    }
}
