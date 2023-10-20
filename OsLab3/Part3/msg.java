package Part3;

public class msg extends Thread{
    SharedScreen myScreen;
	String message;
	
	public msg(SharedScreen s, String m)
	{
		myScreen = s;
		message = m;
	}

	public void run()
	{
		for(int i=0;i<20;i++)
		{
			myScreen.writeMessage(message);
			myScreen.displayMessage(message);
		}
	}
}
