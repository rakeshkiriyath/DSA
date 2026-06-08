package recursion;

public class Basic {

    public static void fun(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        fun(n - 1);
        System.out.println(n);
    }

    public static void fun_two(int n) {
        if(n == 0)
            return;
        fun_two(n - 1);
        System.out.println(n);
        fun_two(n - 1);
    }

    public static void reduceByOne(int n) {
        System.out.println("Before "+n);
        if(n > 0) {
            reduceByOne(n - 1);
            System.out.println("Inside "+n);
        }
        System.out.println("After "+n);
    }


    public static void main(String[] args) {
        reduceByOne(3);
    }
}
