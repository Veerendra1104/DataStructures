
import java.util.Scanner;

public class Example3_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.next();
        boolean res = isPalindrome(st);
        System.out.println();
        if(res)
            System.out.println("The given string is Palindrome");
        else
            System.out.println("The given string is not palindrome");

    }

     static boolean isPalindrome(String st) {
        char[] ch = st.toCharArray();
        String rev = "";
        for(int i = 0 ; i < ch.length ; i++){
            rev = ch[i] + rev;
        }
        return  st.equals(rev);
    }
}
