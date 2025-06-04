
import java.util.Scanner;

public class Example4_ToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        String res = ToLowerCase(st);
        System.out.println("The required result is " + res);

    }

     static String ToLowerCase(String st) {
        char[] ch = st.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char)(ch[i] + 32);

        }
        return  new String(ch);
    }
}
