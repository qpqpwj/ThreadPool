package future_one;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureTest {
    public static Integer t1 = 0;
    public static Integer t2 = 0;
    public static Integer t3 = 0;
    public static Integer t4 = 0;

    public static class Task implements Runnable{


        @Override
        public void run() {
            System.out.println("ah" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();    //获取开始时间
        ExecutorService es = Executors.newFixedThreadPool(4);
        long endTime = System.currentTimeMillis();    //获取结束时间
        for (int i = 0; i < 20; i++) {
            es.submit(new Task());
        }
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间?
    }
}
