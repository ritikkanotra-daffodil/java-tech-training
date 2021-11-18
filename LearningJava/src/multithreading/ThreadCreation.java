package multithreading;

import common.HeavyTask;

import java.util.*;

public class ThreadCreation {

    public static void main (String[] args) {

        // Doing heavy task without using multithreading
        long startTime = new Date().getTime();
        System.out.println(HeavyTask.findNthFibonacci(45));
        System.out.println(HeavyTask.findNthFibonacci(45));
        long endTime = new Date().getTime();
        System.out.println("[WITHOUT thread] Total time taken: " + ((double) endTime - startTime) / 1000);


        // Using multithreading concept to reduce the total processing time
        startTime = new Date().getTime();

        // create first thread
        MyThread myThread = new MyThread();
        Thread findFibThread = new Thread(myThread);
        findFibThread.start();

        //create second thread
        MyThread myThread1 = new MyThread();
        Thread findFibThread1 = new Thread(myThread1);
        findFibThread1.start();

        endTime = new Date().getTime();
        System.out.println("[WITH thread] Total time taken: " + ((double) endTime - startTime) / 1000);

    }

}
