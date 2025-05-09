import java.util.Scanner;

public class NPNumCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= a.length - 1 ; i++){
            System.out.println("Enter the value of " + i + "element");
            a[i] = sc.nextInt();
        }
        int[] res = SumEO(a);
        System.out.println("The positive number count is : " + res[0]);
        System.out.println("The negative number count is : " + res[1]);
    }

    static  int[] SumEO(int[] a){
        int p_cnt = 0, n_cnt = 0;
        for(int i = 0; i<= a.length - 1; i++){
            if(a[i] > 0)
                p_cnt ++;
            else
                n_cnt ++;
        }
        int[] res = {p_cnt, n_cnt};

        return res;
    }
}
