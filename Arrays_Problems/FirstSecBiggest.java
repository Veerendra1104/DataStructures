
public class FirstSecBiggest {
    //  1st way
//    public static void main(String[] args) {
//        int[] a = {20,30, 40,50, 10};
//        Arrays.sort(a);
//        int first_big = a[a.length-1];
//        int sec_big = a[a.length-2];
//        System.out.println("The first biggest number is "+ first_big);
//        System.out.println("The second biggest number is " + sec_big);
//    }
    public static void main(String[] args) {
        int[] a = {10, 20,30, 40,50};
     // 2nd way
//        int big_1 = BigElem(a);
//        int big_2 = SecBig(a, big_1);
//        System.out.println("The first biggest element in the given array is " + big_1);
//        System.out.println("The first biggest element in the given array is " + big_2);


        // 3rd way
        int[] res = BigSecBig(a);
        System.out.println("The first biggest element in the given array is " + res[0]);
        System.out.println("The second biggest element in the given array is " + res[1]);
    }
// 2nd way
//    public static int BigElem(int[] a ){
//        int big=0;
//        for(int i= 0; i < a.length ; i++){
//            if(a[i] > big)
//                big = a[i];
//        }
//        return big;
//    }
//
//    public static int SecBig(int[] a,int big_1){
//        int  big_2 =0;
//        for (int i = 0; i< a.length; i++){
//            if(a[i] > big_2 && a[i] < big_1)
//                big_2 = a[i];
//        }
//        return big_2;
//    }


    // 3rd way
    public static int[] BigSecBig(int[] a ){
        int big_1 = 0,big_2 = 0;
        for(int i = 0 ; i< a.length; i++){
            if(a[i] > big_1) {
                big_2 = big_1;
                big_1 = a[i];
            }else if (a[i] > big_2 && a[i] < big_1){
                big_2 = a[i];
            }
        }
        int[] res = {big_1, big_2};

        return res;
    }
}
