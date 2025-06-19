public class Logger
{
    private static Logger instance;
    //is an instace for the class Logger (Lazy initialzation)
    private Logger()
    {
        System.out.println("Initialisation done:");
    }
    public static Logger getInstance()
    {
        if(instance == null)
        {
            instance=new Logger();
            //an instance is created since there is no instance created it is lazy initialisation
        }
        return instance;
    }
    //to start logging process
    public void log(String message)
    {
        System.out.println(message);
    }
}