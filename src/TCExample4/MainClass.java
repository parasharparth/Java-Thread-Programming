package TCExample4;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

/***************************************************************************
 * @author Parth Parashar
 * Take NumberOfThreads and the NumberOfElements from the user.
 * Create numberOfThreads and divide the work among them
 * Start the threads and print the total
 ***************************************************************************/
public class MainClass {

    public static void main(String[] args) throws InterruptedException
    {
        //The first step is to get the input from the user
        System.out.println("Enter the number of elements whose sum you want to calculate");
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int numberOfThreads = sc.nextInt();
        sc.close();

        //Declaring the array of threads
        Example4[] thread = new Example4[numberOfThreads];

        //Declaring the shared variable total
        AtomicLong total = new AtomicLong(0);

        //Partitioning
        int start = 0;
        int end = 0;

        //Starting the threads
        for(int i=1; i<=numberOfThreads; i++)
        {
            thread[i] = new Example4(total);
            thread[i].start();
        }

        //joining the threads for inter thread communication
        for(int i=1; i<=numberOfThreads; i++)
        {
            thread[i].join();
        }

    }
}
