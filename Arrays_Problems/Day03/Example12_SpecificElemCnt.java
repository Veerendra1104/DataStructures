package Arrays.exmple_21;

import java.util.Scanner;

public class Example12_SpecificElemCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = readArray();
        System.out.println("Enter the number to check how many times repeated : ");
        int n = sc.nextInt();
        int res = SpecificElemCnt(array, n);
        System.out.println("The element " + n + " is present : " + res + " times .");
    }

     static int SpecificElemCnt(int[] array, int n) {
        int count = 0 ;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == n)
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
