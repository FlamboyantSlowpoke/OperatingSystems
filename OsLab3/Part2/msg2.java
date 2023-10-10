package OsLab3.Part2;

public class msg2 extends Thread{
    SharedScreen myScreen;
	String message;

    public msg2(SharedScreen s, String m)
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
