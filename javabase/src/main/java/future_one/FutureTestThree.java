package future_one;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureTestThree {
    public static class Task implements Callable<String>{

        @Override
        public String call() throws Exception {
            System.out.println("ah" + Thread.currentThread().getName());
            return "something";

        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<String>> results = new ArrayList<Future<String>>();
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 20; i++) {
            results.add(es.submit(new Task()));
        }
        for(Future<String> res : results){
            System.out.println(res.get() + res.toString());

        }
    }
}
