package com.connectUS;

public class Nthread implements Runnable{

	Thread t;
	Notification NFC;
        TittleFrame T = new TittleFrame();
	public Nthread(String threadName)
	{
		t = new Thread(this, threadName);
		
		t.start();
	}
	
	public void run()
	{
			try 
			{	
				NFC = new Notification();
				NFC.setVisible(true);
                                Thread.sleep(7000);
				NFC.setVisible(false);
				
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
	}
}