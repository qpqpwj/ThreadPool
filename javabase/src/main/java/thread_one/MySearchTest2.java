package thread_one;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MySearchTest2 {
    private final static Executor executor = Executors.newCachedThreadPool();// 启用多线程
    private static String mainUrl = "http://ac.qq.com/Comic/index/state/pink/page/";// 可以根据腾讯漫画的分类来进行抓取
    private static String url = "http://ac.qq.com/Jump";// +/Comic/comicInfo/id/11111
    // 可以获取具体的漫画页面

    public static void main(String[] args) {
        for (int i = 0; i < 144; i++) {
            final int j = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("begin*************第" + j + "页");

                        System.out.println("end*************第" + j + "页");
                    } catch (Exception e) {

                    }
                }
            });

        }
    }
}
