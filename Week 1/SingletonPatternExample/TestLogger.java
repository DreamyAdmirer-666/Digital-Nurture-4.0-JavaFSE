public class TestLogger {
    public static void main(String args[])
    {
        //creation of Logger class instance and calling the method
        Logger logger1=Logger.getInstance();
        logger1.log("Started...");

        //calling of Logger instance again
        Logger logger2=Logger.getInstance();
        logger2.log("Running...");

        //we check if both logger instances are same or not
        if(logger1==logger2)
        {
            System.out.println("Both Logger instances are same.Singleton pattern works!");
        }
        else
        {
            System.out.println("Not singleton!");
        }
    }
}
