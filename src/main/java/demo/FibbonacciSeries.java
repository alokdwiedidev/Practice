package demo;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int num=5;
        int a=0;
        int  b=1;

        System.out.println(a);
        System.out.println(b);
        // 0,1,1,2,3,5,8,13,21
        for (int i=2 ;i<=num;i++){
            int temp=b;


            b=a+b;
            a=temp;
            System.out.println(b);

        }
        System.out.println(b);
    }
}
