package day01;

public class Demo06 {

    public static void main(String[] args) {
        int a = 77;
        int b = 88;
        int sum = sum(a,b);
        System.out.println(sum);
        sum1(a,b);
        sum2(1,2,3,4,5,6,7,8);
    }
    //方法与方法之间是并列的关系
    //方法的定义：  修饰符  返回值类型 方法名(参数){}
    public static int sum(int a,int b){
        //返回值类型不为空 必须有return
        return a+b; //return的作用就是结束方法，将值返回
    }
    // void 返回值类型为空
    public static void sum1(int c,int d){
        System.out.println(c+d);
    }


    // ...表示个数不定灵活改变
    public static  void sum2(int... values){
        //这个值是一个集合/数组
        int sum =0;
        for (int x : values){
            sum+=x;
        }
        System.out.println(sum);
    }

}
