package day01;

public class Demo05 {

    public static void main(String[] args) {

        //两个数找最大值
        int a =100;
        int b = 20;
        int max = a>b?a:b;
        //三个数找最大值
        a =100;
        b =50;
        int c =200;
        // max ?
        max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max);



    }

}
