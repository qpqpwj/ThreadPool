package thread_pool_one;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolByNewSingleThreadExecutor {

    public static void main(String[] args) {
        /**
         * 单线程化的线程池
         */
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        long startTime=System.currentTimeMillis();


        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
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
        singleThreadExecutor.shutdown();
        System.out.println("on the main thread...");
        //执行方法
        long endTime=System.currentTimeMillis();
        float excTime=(float)(endTime-startTime)/1000;
        System.out.println("执行时间："+excTime+"s");

    }


}
