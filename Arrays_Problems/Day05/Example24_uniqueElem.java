package Arrays.exmple_21;

import java.util.Scanner;

public class Example24_uniqueElem {
    public static void main(String[] args) {
        int[] x = readArray();
        dispArray(x);
       int[] res = uniqueElems(x);
        System.out.println("unquie elements");
       dispArray(res);

    }

     static int[] uniqueElems(int[] x) {
        int[] z = new int[x.length];
        int k = 0;
        for(int i = 0 ; i < x.length ; i++) {
            int count = 0;
            for(int j = 0 ; j < x.length; j++) {
                if (x[i] == x[j]) {
                    count++;

                }
                }
            if(count == 1){
                z[k++] = x[i];

            }
        }
            int[] res  = new int[k];

            for(int i = 0 ; i < res.length  ; i++){
                res[i] = z[i];
            }
      return res;

    }

    static void dispArray(int[] arr) {
        System.out.println("The array elemnts are : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
