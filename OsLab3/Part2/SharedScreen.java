package Part2;

public class SharedScreen {
    int turn = 1; 
	
	public SharedScreen()
	{
		
	}
	
	public synchronized void MyMessage(String message)
	{
		while(turn != 1)
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
		
		System.out.println(message);
		turn = 1;
		notifyAll();
	}
	
	public synchronized void NameMessage(String message)
	{
		while(turn != 2)
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
		
		System.out.println(message);
		turn = 2;
		notifyAll();
	}

    public synchronized void IsMessage(String message)
    {
        while(turn != 3)
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
        
        System.out.println(message);
        turn = 3;
        notifyAll();
    }

    public synchronized void BenMessage(String message)
    {
        while(turn != 4)
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
        
        System.out.println(message);
        turn = 4;
        notifyAll();
}

}
