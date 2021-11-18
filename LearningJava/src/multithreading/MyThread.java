package multithreading;

import common.HeavyTask;

/**
 * Custom class to create threads to run heavy task
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(HeavyTask.findNthFibonacci(45));
    }
}
