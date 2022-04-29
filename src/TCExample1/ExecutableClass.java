package TCExample1;

public class ExecutableClass extends Thread{

    @Override
    public void run()
    {
        System.out.println("Thread: "+Thread.currentThread().getName());
    }
}
