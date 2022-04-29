package TCExample1;

public class MainClass {

    public static void main(String args[])
    {
        int numberOfThreads=10;
        for(int i=1; i<numberOfThreads; i++)
        {
            ExecutableClass object = new ExecutableClass();
            object.start();
        }
    }
}
