

import java.util.Scanner;

public class Example2_VowConsCnt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        int res[] = CntFre(st);
        System.out.println("Vowels Cnt : " + res[0]);
        System.out.println("Consonents Cnt : " + res[1]);
        System.out.println("The total length of " + st.length());

    }

    static int[] CntFre(String st){
        int  vc = 0;
       for(int i= 0; i< st.length(); i++){
           char x = st.charAt(i);
           if(x >= 'A' && x <= 'Z'  ){
               if(x == 'A' || x == 'E' || x == 'I'|| x == 'O'|| x == 'U')
                   vc++;
           } else if (x >= 'a' && x <= 'z'){
               if(x == 'a' || x == 'e' || x == 'i'|| x == 'o'|| x == 'u')
                   vc++;
           }
       }
       int res[] = {vc, st.length()-vc} ;
       return res;
    }
}
