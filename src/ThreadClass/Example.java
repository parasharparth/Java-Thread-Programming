package ThreadClass;

public class Example extends Thread{
    @Override
    public void run()
    {
        try
        {
            System.out.println("The thread in execution is: -"+ Thread.currentThread().getName());
        }
        catch(Exception e)
        {
            System.err.println("Error occured : -"+e.getMessage());
        }
    }
}
