package future_one;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureTestTwo {
    public static class Task implements Callable<String>{

        @Override
        public String call() throws Exception {
            System.out.println("ah"+Thread.currentThread().getName());
            return "something";
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 20; i++) {
            es.submit(new Task());
        }
    }
}
