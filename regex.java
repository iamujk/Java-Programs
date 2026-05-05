public class regex {
    public static void main(String[] args) {
        String example = "AbC123!@#xYz";
        String filtered=example.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(filtered);
        String text="Java sdsd    proh kdshndns";
        text=text.replaceAll("[\\s]","");
        System.out.println(text);

        String str="Progrrammrinfdg";
        int len=str.length();
        String str1=str.replaceAll("[r]","");
        int OccurenceofR=str1.length();
        System.out.println(len-OccurenceofR);
    }
}
