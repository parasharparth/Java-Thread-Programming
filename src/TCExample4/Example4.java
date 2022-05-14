package TCExample4;

import java.util.concurrent.atomic.AtomicLong;

public class Example4 extends Thread{

    final AtomicLong total;
    int high;
    int low;
    Example4(AtomicLong total,int high, int low)
    {
        this.total = total;
        this.high = high;
        this.low = low;
    }
    @Override
    public void run() {
        int sum;
        synchronized (total) {
            sum = 0;
            for (int i = low; i < high; i++) {
                sum = sum + i;
                total.addAndGet(i);
            }
        }
        System.out.println("Sum calculated by Thread- " + Thread.currentThread().getName() + " is= " + sum+" where LOW:- "+low+" AND High:- "+high);
    }
}
