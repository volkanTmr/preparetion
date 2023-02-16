package Preparetion1;

import java.util.Scanner;

public class ReverseYahoo {

    public static void main(String[] args) {
        //Scanner scn =new Scanner(System.in);
       // String s = scn.nextLine();
        String s = "madam";
        String t = "";
        for(int i=s.length()-1;i>=0;i--){

            t=t + s.charAt(i);

        }
        System.out.println(t);

        if(t.equals(s)){
            System.out.println("palindrome");
        }
    }
}
