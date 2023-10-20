package Part2;

public class msg4 extends Thread   {
    
    SharedScreen myScreen;
	String message;

    public msg4(SharedScreen s, String m)
    {
        myScreen = s;
        message = m;
    }
    
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            myScreen.MyMessage(message);
        }
    }
}
