package packexercises.thrd30scheduling.using20Sleep;

import static packexercises.common.ThreadUtilities.randomSleep;

public class FetchValue implements Runnable {
	private ValueToProcess value;
	Thread client;
	
	public FetchValue(ValueToProcess value, Thread client) {
		super();
		this.value = value;
		this.client = client;
	}

	public void run() {
		// Do processing step 1
		randomSleep();
		
		// Do processing step 2
		//randomSleep();
		
		value.setValueToProcess(200);
		client.interrupt();
	}
}
