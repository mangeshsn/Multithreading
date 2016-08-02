package packexercises.thrd10basics;

import static packexercises.common.ThreadUtilities.randomSleep;

public class CounterRunnable implements Runnable {
	private int counter = 0;
	
	{
		System.out.println("Object created: CounterRunnable");
	}
	
	public int increAndGet(){
		randomSleep();
		return ++counter;
	}
		
	public void run(){
		Thread thisThread = Thread.currentThread();
		String threadName = thisThread.getName();
		for(int i=0; i<5; i++)
			System.out.println(threadName+": "+increAndGet());
	}
	
	public static void main(String[] args) {
		CounterRunnable counter = new CounterRunnable();
		Thread counter1 = new Thread(counter);
		Thread counter2 = new Thread(counter);
		Thread counter3 = new Thread(counter);
		
		counter1.start();
		counter2.start();
		counter3.start();
		
		try {
			counter1.join();
			counter2.join();			
			counter3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String main = Thread.currentThread().getName();
		System.out.println("Which thread main() runs within?"+" "+main);
	}
}
