package multithreading.producerconsumer;

public class Consumer implements Runnable {

    Company company;
    public Consumer(Company c) {
        this.company = c;
    }

    @Override
    public void run() {
        while (true) {
            company.getItem();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
