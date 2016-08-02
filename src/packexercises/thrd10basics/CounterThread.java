package packexercises.thrd10basics;

import static packexercises.common.ThreadUtilities.randomSleep;

public class CounterThread extends Thread {
	private int counter = 0;
	//private int i = 0;
	
	{
		System.out.println("Object created: CounterRunnable");
	}
	
	public int increAndGet(){
		randomSleep();
		return ++counter;
	}
	
	public void run(){
		for(int i=0; i<5; i++)
			System.out.println(getName()+": "+increAndGet());
	}
	
	public static void main(String[] args) {
		CounterThread counter1 = new CounterThread();
		CounterThread counter2 = new CounterThread();
		CounterThread counter3 = new CounterThread();
		
		counter1.start();
		counter2.start();
		counter3.start();
		
		String main = Thread.currentThread().getName();
		System.out.println("Which thread main() runs within?"+" "+main);
	}
}
