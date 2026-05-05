public class sumofnumbersinstring {
    static int sumofNumbers(String s){
        int sum=0;
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                str+=c;
            }
            else if(!str.isEmpty()){
                sum+=Integer.parseInt(str);
                str="";
            }
        }
        if(!str.isEmpty()){
            sum+=Integer.parseInt(str);
        }
        return sum;
        }


    public static void main(String[] args) {
String str="abc123xyz45!6";
        System.out.println(sumofNumbers(str));
    }
}
