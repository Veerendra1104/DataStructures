
import java.util.Scanner;

public class Example5_VowelToCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        String res = VowelsToCapital(st);
        System.out.println("The required result is " + res);

    }

     static String VowelsToCapital(String st) {
         char[] ch = st.toCharArray();
         for(int i = 0 ; i < ch.length ; i++) {
             if (ch[i] >= 'a' && ch[i] <= 'z') {
                 if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                     ch[i] = (char) (ch[i] - 32);
                 }
             } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                 if (ch[i] != 'A' || ch[i] != 'E' || ch[i] != 'I' || ch[i] != 'O' || ch[i] != 'U') {
                     ch[i] = (char) (ch[i] + 32);
                 }
             }
         }


         return  new String(ch);
     }


}
