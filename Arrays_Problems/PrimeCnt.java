
import java.util.Scanner;

public class PrimeCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter the value of " + i + "element");
            a[i] = sc.nextInt();
        }
        int res = CntPrime(a);
        System.out.println("The number of prime number in given array is : " + res);
    }

    static int CntPrime(int[] a) {
        int count = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for(int j = 2; j<= a[i] / 2 ; j++){
                if(a[i] % j == 0)
                    count++;
            }

        }
        return count;
    }
}
