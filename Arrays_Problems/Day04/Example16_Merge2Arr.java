package Arrays.exmple_21;

import java.util.Scanner;

public class Example16_Merge2Arr {
    public static void main(String[] args) {

        int[] array_1 = readArray();
        int[] array_2 = readArray();

        int[] merger_array = merge(array_1, array_2);

        System.out.println("Array 1 : ");
        dispArray(array_1);

        System.out.println("Array 2 : ");
        dispArray(array_2);

        System.out.println("Merrged Array : ");
        dispArray(merger_array);

    }

    static void dispArray(int[] arr) {
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] merge(int[] array1, int[] array2) {
        int[] new_array = new int[array1.length + array2.length];
        for(int i = 0 ; i< array1.length ; i++){
            new_array[i] = array1[i];
        }
        for(int i = 0 ; i< array2.length ; i++){
            new_array[array1.length + i ] = array2[i];
        }
        return new_array;
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
