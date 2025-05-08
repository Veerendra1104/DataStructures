package Arrays.exmple_21;

import java.util.Scanner;

public class Example15_SmallElemIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = readArray();

        int res = SmallElemIndex(array);
        System.out.println("The " + res + " index has the biggest element");
    }

    static int SmallElemIndex(int[] array) {
        int small_index = 0 ;
        for (int i = 0 ; i < array.length ; i++){
            if(array[i] < array[small_index])
                small_index = i;
        }
        return small_index + 1;
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
