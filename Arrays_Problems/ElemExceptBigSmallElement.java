

public class ElemExceptBigSmallElement {
    public static void main(String[] args) {
        int[] a = {20,30, 40,50, 10};
        int[] res = BigSmall(a);
        System.out.println("The big number is " + res[0]);
        System.out.println("The numbers less  big number is ");
        for (int i = 0 ; i < a.length ; i++){
            if(a[i] < res[0])
                System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("The small number is " + res[1]);
        System.out.println("The numbers greater  small number is ");
        for (int i = 0 ; i < a.length ; i++){
            if(a[i] > res[1])
                System.out.print(a[i] + " ");
        }
    }

    public static int[] BigSmall(int[] a){
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i< a.length; i++){
            if(a[i] > big)
                big = a[i];
            if(a[i] < small)
                small = a[i];
        }
        int[] res = {big, small};
        return res;
    }

}
