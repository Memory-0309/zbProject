package day01;

public class Demo04 {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = a%b;
        System.out.println(c);

        //++  -- 自增一  自减一
        //++  -- 写在后面 先赋值再运算
        c = a++;
        System.out.println(c);
        //++ -- 写在前面 先运算再赋值
        c = ++a;
        System.out.println(c);

        int i = 5;
        //  i     6           7      6    6      5
        // ()     6       6       6       6
        int j = (++i) + (i++) + (--i) + (i--);
        System.out.println(j); //24
        System.out.println(i); //5




    }


}
