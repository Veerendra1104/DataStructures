package Arrays.exmple_21;

import java.util.Scanner;

public class Example13_CntBetMN {
    public static void main(String[] args) {
        int[] array = readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements to start m value :");
        int m = sc.nextInt();
        System.out.println("Enter the elements to end value :");
        int n = sc.nextInt();
        int res = CntBetMN(array, m, n);
        System.out.println("The numbers of  elements  that present between " + m + " and " + n + " is : " + res);
    }

     static int CntBetMN(int[] array, int m, int n) {
        int count = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > m && array[i] < n)
                count++;
        }
        return count;
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] general = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i < n ; i++){
            general[i] = sc.nextInt();
        }
        return  general;
    }
}
