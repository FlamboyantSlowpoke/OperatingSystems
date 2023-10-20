package Part3;

public class SharedScreen {
    String[] myArray = new String[10];;   
    int in = 0; 
    int out = 0;
	int counter = 0;
	
	private int terminate = 0;

	public SharedScreen()
	{
		
	}
	
	public synchronized void terminate()
	{
		terminate = 1;
		notifyAll();
	}

	public synchronized void writeMessage(String message)
	{
		while(in == 10)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (in <= 10) {
            myArray[in] = message;
            System.out.println("MessageIn: " +in);
			counter++;
            in++;
        }
        if(in == 10) {
            out = 0;
        }
		notifyAll();
	}
	
	public synchronized void displayMessage(String message)
	{
		while(out == 10)
		{
			try 
			{
				wait();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (out <= 10) {
		    myArray[out] = message;
            System.out.println("MessageOut: " +out);
			counter++;
            out++;
        }
        if(out == 10) {
            in = 0;
        }
		notifyAll();
		
	}

	public synchronized void userMessage(String message)
	{
		while(counter != 250)
		{
			try 
			{
				wait();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (counter == 250) {
			int flag = 0;
		}
		
		notifyAll();
		
	}

}
