package multithreading.producerconsumer;

public class Producer implements Runnable{

    Company company;

    public Producer(Company c) {
        this.company = c;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            company.putItem(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
