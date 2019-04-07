package thread_pool_one;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolByNewFixedThreadPool {
    public static void main(String[] args) {

        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            newFixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    Thread.currentThread().setName("Thread i = " + index);
                    System.out.println(Thread.currentThread().getName() + " index = " + index);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("exception");
                    }
                }
            });
        }
        newFixedThreadPool.shutdown();
        System.out.println("on the main thread...");
    }
}