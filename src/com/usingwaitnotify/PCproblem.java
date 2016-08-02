package com.usingwaitnotify;

public class PCproblem {

	public void producer() throws InterruptedException {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized(this){
				System.out.println("Producing values..........");
				wait();
				notify();
			System.out.println("produccer");
			}
		}
	}

	public void consumer() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Consumer started.......");
		Thread.sleep(100);
		while(true){
			
			synchronized(this){
			System.out.println("consumer");
			Thread.sleep(500);
			
			notify();
			wait();
			}
		}
	}

}
