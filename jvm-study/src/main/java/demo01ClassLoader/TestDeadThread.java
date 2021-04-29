package demo01ClassLoader;/**
* @Description 
* @Author huangming 
* @Date 2021/4/29
**/
public class TestDeadThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "start");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "end");
        };

        Thread thread1 = new Thread(runnable,"thread1");
        Thread thread2 = new Thread(runnable,"thread2");

        thread1.start();
        thread2.start();
    }
}

class DeadThread{
    static {
        if (true){
            System.out.println(Thread.currentThread().getName() + "initialized");
            while (true){

            }
        }
    }
}
