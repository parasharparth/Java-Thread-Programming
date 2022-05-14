package TCExample5;
import ThreadClass.Example;

import java.util.concurrent.atomic.AtomicLong;

public class Example5 extends Thread{

    int high;
    int low;
    AtomicLong total = new AtomicLong(1);

    //defining the default constructor
    Example5()
    {
        high = 0;
        low = 0;
        total.addAndGet(0);
    }

    //Parameterized constructor
    Example5(AtomicLong total, int high, int low)
    {
        total.addAndGet(0);
        this.high = high;
        this.low = low;
    }


    @Override
    public void run()
    {
        int localResult = 1;
        int localTotal = total.intValue();
        for(int i = low; i<high; i++)
        {
            if(i==0 || localTotal == 0)
            {
                //do nothing
            }
            else {
                localResult = localResult * i;
                localTotal = localTotal * i;
            }
        }
        System.out.println("Thread-"+Thread.currentThread().getName()+"with high:- " + high + "and low:- "+low+" localResult:- "+localResult +" localTotal:- "+localTotal);
    }
}
