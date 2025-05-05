import java.util.Scanner;

public class EOSum {
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
        System.out.println("The even sum value is : " + res[0]);
        System.out.println("The even sum value is : " + res[1]);
    }

    static  int[] SumEO(int[] a){
        int e_sum = 0, o_sum = 0;
        for(int i = 0; i<= a.length - 1; i++){
            if(a[i] % 2 == 0)
                e_sum += a[i];
            else
                o_sum += a[i];
        }
        int[] res = {e_sum, o_sum};

        return res;
    }
}
