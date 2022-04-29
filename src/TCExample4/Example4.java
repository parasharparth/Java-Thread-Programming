package TCExample4;

import java.util.concurrent.atomic.AtomicLong;

public class Example4 extends Thread{

    AtomicLong total;
    Example4(AtomicLong total)
    {
        this.total = total;
    }
    @Override
    public void run()
    {

    }
}
