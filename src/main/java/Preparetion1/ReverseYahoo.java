package Preparetion1;

public class ReverseYahoo {

    public static void main(String[] args) {

        String s = "madam";
        String t = "";
        for(int i=s.length()-1;i>=0;i--){

            t=t+ s.charAt(i);

        }
        System.out.println(t);

        if(t.equals(s)){
            System.out.println("palindrome");
        }
    }
}
