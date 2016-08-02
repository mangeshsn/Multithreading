package packexercises.thrd30scheduling.using10Prio;

import static packexercises.common.ThreadUtilities.lightProcessing;

public class LightProcess implements Runnable {

	public void run() {
		Thread currentThread = Thread.currentThread();
		long startTime = System.currentTimeMillis();
		System.out.println("Thread started:"+currentThread.getName());
		
		lightProcessing();
		
		long endTime = System.currentTimeMillis();
		System.out.println(currentThread.getName()+" Run time:"+(endTime-startTime));
	}
}
