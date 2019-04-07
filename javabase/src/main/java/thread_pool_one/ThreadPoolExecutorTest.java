package thread_pool_one;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(12);
        for (int i = 0; i < 40; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(index);
//                        Thread.sleep(2000);
                }
            });
        }
    }
}