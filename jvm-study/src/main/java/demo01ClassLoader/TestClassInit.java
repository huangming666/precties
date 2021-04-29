package demo01ClassLoader;/**
* @Description 
* @Author huangming 
* @Date 2021/4/29
**/
public class TestClassInit {
    private static int a = 1;

    static {
        a = 2;
        b = 20;
    }

    private static int b = 10;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
