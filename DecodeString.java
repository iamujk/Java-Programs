public class DecodeString {
    public static void main(String[] args) {
        String input = "A1B2CD1AI3C0R2";
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                temp.append(ch); // build group
            } else if (Character.isDigit(ch)) {
                int count = ch - '0';  //converts char into int

                for (int j = 0; j < count; j++) {
                    result.append(temp);
                }

                temp.setLength(0); // reset group
            }
        }

        System.out.println(result.toString());
    }
}
