package TCExample2;

/******************************************************************************************************
 * @author Parth Parashar
 * Two threads are created
 * Thread-1 calculates the sum of odd numbers from 1 to 100.
 * Thread-2 calculates the sum of even numbers from 1 to 100.
 * This is the main class where the two threads are created and their routines are called.
 ******************************************************************************************************/

public class MainClass {
    public static void main(String args[])
    {
        try {
            //Thread for calculating the sum of even numbers
            Example2 thread1 = new Example2(true);
            thread1.start();

            //Thread for calculating the sum of odd numbers
            Example2 thread2 = new Example2(false);
            thread2.start();

            thread1.join();
            thread2.join();
        }
        catch(Exception e)
        {
            System.out.println("Error: -"+e.getMessage());
        }
    }
}
