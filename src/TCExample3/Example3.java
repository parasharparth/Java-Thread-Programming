package TCExample3;

import java.util.concurrent.atomic.AtomicLong;

public class Example3 extends Thread{

    public AtomicLong total;

    boolean flag ;

    int numberOfElements ;
    Example3(boolean flag,int numberOfElements,AtomicLong total)
    {
        this.flag = flag;
        this.total=total;
        this.numberOfElements = numberOfElements;
    }

    @Override
    public void run()
    {
        long sum = 0;
        if(flag)
        {
            //calculating the sum of even numbers
            for(int i=1; i<=numberOfElements; i++)
            {
                if(i%2 == 0)
                {
                    sum = sum + i;
                    total.addAndGet(i);
                }
            }
            System.out.println("EVEN SUM = "+sum);
            System.out.println("TOTAL = "+total);
        }
        else {
            //calculating the sum of odd numbers
            for (int i = 1; i <= numberOfElements; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                    total.addAndGet(i);
                }
            }
            System.out.println("ODD SUM = " + sum);
        }
    }
}
