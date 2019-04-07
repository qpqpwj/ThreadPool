package feature_thread;

import java.util.concurrent.Callable;

class ComputeTask implements Callable<Integer> {
    //任务名称，方便查看
    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    //任务构造器
    public ComputeTask(String taskName) {
        this.taskName = taskName;
        System.out.println("创建子线程计算任务开始，任务名称：" + taskName);
    }

    @Override
    public Integer call() throws Exception {
        Integer result = 0;
        for (int i = 1; i <= 100; i++) {
            result = +i;
        }
        System.out.println("子线程任务" + taskName + "执行完成");
        return result;
    }
}