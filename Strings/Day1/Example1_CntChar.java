
import java.util.Scanner;

public class Example1_CntChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.next();
        int res[] = CntFre(st);
        System.out.println("UpperCase Cnt : " + res[0]);
        System.out.println("LowerCase Cnt : " + res[1]);
        System.out.println("Digits Cnt : " + res[2]);
        System.out.println("Special Cnt : " + res[3]);



    }

    static int[] CntFre(String st){
        int uc=0, lc=0, dig= 0, vc = 0, cc= 0, spc= 0;
       for(int i= 0; i< st.length(); i++){
           char x = st.charAt(i);
           if(x >= 'A' && x <= 'Z'){
               uc++;
           } else if (x >= 'a' && x <= 'z'){
               lc++;
           } else if ( x > '1' && x < '9') {
               dig++;
           }
           else{
               spc++;
           }
       }
       int res[] = {uc, lc, dig, spc} ;
       return res;
    }
}
