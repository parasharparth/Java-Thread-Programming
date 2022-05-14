package TCExample5;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

/************************************************************
 * @author Parth Parashar
 * This program is used to calculate factorial using threads
 ************************************************************/
public class MainClass {

    public static void main(String[] args) throws InterruptedException
    {
        //The first step is to get the inputs from the user
        System.out.println("Enter the number whose factorial you want to find");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the number of threads");
        int numberOfThreads = sc.nextInt();

        //Defining the total variable
        AtomicLong total = new AtomicLong(1);

        //The second step is define the threads, start them and join them
        //This step will also involve partitioning
        Example5[] thread = new Example5[numberOfThreads];

        for(int i=0; i<numberOfThreads; i++)
        {
            int low = (number/numberOfThreads) * i;
            int high = (number/numberOfThreads) + low;
            thread[i] = new Example5(total,high,low);
            thread[i].start();
        }

        for(int i=0; i<numberOfThreads; i++)
        {
            thread[i].join();
        }

        System.out.println("TOTAL:- "+total.intValue()*number);
    }
}
