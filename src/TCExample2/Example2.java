package TCExample2;

/*********************************************************************************
 *@author Parth Parashar
 * This class calculates the sum of odd and even numbers using respective threads
 *********************************************************************************/

public class Example2 extends Thread{

    boolean b;
    Example2(boolean b)
    {
        this.b = b;
    }

    @Override
    public void run()
    {
        int sum = 0;
        if(b)
            {
                //calculating the sum of even numbers
                for(int i=1; i<=100; i++)
                {
                    if(i%2 == 0)
                    {
                       sum = sum + i;
                    }
                }
                System.out.println("EVEN SUM = "+sum);
            }
            else {
                //calculating the sum of odd numbers
            for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0) {
                        sum = sum + i;
                    }
                }
                System.out.println("ODD SUM = " + sum);
            }
    }
}
