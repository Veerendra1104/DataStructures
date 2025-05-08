package Arrays.exmple_21;

import java.util.Scanner;

public class Example14_BigElemIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = readArray();

        int res = BigElemIndex(array);
        System.out.println("The " + res + " index has the biggest element");
    }

     static int BigElemIndex(int[] array) {
        int big_index =0 ;
        for (int i = 0 ; i < array.length ; i++){
            if(array[i] > array[big_index])
                big_index = i;
        }
        return big_index + 1;
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
