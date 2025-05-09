    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= a.length - 1 ; i++){
            System.out.println("Enter the value of " + i + "element");
            a[i] = sc.nextInt();
        }
        int res = AvgArr(a);
        System.out.println("The average value is : " + res);
    }

    static  int AvgArr(int[] a){
        int sum = 0;
        for(int i = 0; i<= a.length - 1; i++){
            sum += a[i];
        }

        return  sum / a.length;
    }
}
