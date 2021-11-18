package multithreading.threadscanner;

import java.util.Scanner;

class InputThread implements Runnable {

    Thread threadToStop = null;
    public InputThread(Thread th) {
        this.threadToStop = th;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String key = null;
        while (true) {
            key = sc.next();
            if (key.equals("q")) {
                threadToStop.stop();
                break;
            }
        }


    }
}

class TaskThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Value of i is: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        TaskThread t1 = new TaskThread();
        Thread taskThread = new Thread(t1);
        taskThread.start();

        InputThread t2 = new InputThread(taskThread);
        Thread inputThread = new Thread(t2);
        inputThread.start();
    }
}
