package ThreadClass;

public class Solution1 {

    public static void main(String args[])
    {
        int numberOfThreads = Integer.parseInt(args[0]);
        for(int i=1;i<=numberOfThreads; i++)
        {
            Example ex = new Example();
            ex.start();
        }
    }
}

