public class DecodeString {
    public static void main(String[] args) {
        String input = "A1B2CD1AI10C0R2";
        StringBuilder result = new StringBuilder();
        StringBuilder group = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);
            // 1. Build letter group
            if (Character.isLetter(ch)) {
                group.append(ch);
                i++;
            }
            // 2. When digit found, process full number
            else if (Character.isDigit(ch)) {
                int num = 0;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    num = num * 10 + (input.charAt(i) - '0');
                    i++;
                }
                // repeat group
                for (int j = 0; j < num; j++) {
                    result.append(group);
                }
                // reset group
                group.setLength(0);
            }
        }
        System.out.println(result);
    }
}
