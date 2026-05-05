import java.util.Stack;

public class balancedParanthesis {
    public static void main(String[] args) {
        String str="[{()}([]){{[()]}}([]{()]]})({[()()]})]";
        if(checkBalanced(str)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
   static boolean checkBalanced(String s){
        Stack<Character> st=new Stack<>();
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='{' || str[i]=='[' || str[i]=='('){
                st.push(str[i]);
            }
            else if(str[i]==']' || str[i]=='}' || str[i]==')'){
                if(st.isEmpty()){
                    return false;
                }
              char top=st.pop();
                if((str[i]==')' && top!='(') ||(str[i]==']' && top!='[') || (str[i]=='}' && top!='{')){
                    return false;
                }
            }
        }
return st.isEmpty();
    }
}
