package multithreading.producerconsumer;

class Company {

    int item;

    public void putItem(int item) {
        System.out.println("Put: " + item);
        this.item  = item;
    }

    public void getItem() {
        System.out.println("Get: " + this.item);
    }
}

public class PCProblem {

    public static void main(String[] args) {
        Company company = new Company();
        Producer t1 = new Producer(company);
        Thread p = new Thread(t1);
        Consumer t2 = new Consumer(company);
        Thread c = new Thread(t2);
        p.start();
        c.start();
    }



}
