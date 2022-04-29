package TCExample3;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/*****************************************************************
 * @author Parth Parashar
 * This Program calculates the sum of N numbers using threads
 * Two threads are working here for calculating the sum of
 * a) even numbers
 * b) odd numbers
 * These are then used to calculate the total sum
 *****************************************************************/
public class MainClass {

    public static void main(String[] args) throws InterruptedException
    {
        AtomicLong total = new AtomicLong(0);
        System.out.println("Enter the number of elements whose sum you want to find");
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        sc.close();

        Example3 thread1 = new Example3(true,numberOfElements,total);
        Example3 thread2 = new Example3(false,numberOfElements,total);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
