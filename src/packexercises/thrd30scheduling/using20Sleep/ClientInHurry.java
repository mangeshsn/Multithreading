package packexercises.thrd30scheduling.using20Sleep;

public class ClientInHurry implements Runnable {
	private long timeOut;
	private String thrdName = "Thread in hurry";
	private ValueToProcess value;
	
	public ClientInHurry(long timeOut, ValueToProcess value){
		this.timeOut = timeOut;
		Thread.currentThread().setName(thrdName);
		this.value = value;
	}
	
	public void run(){
		
		try {
			Thread.sleep(timeOut);
			System.out.println("Time out");
		} catch (InterruptedException e) {
			System.out.println("Processing value:"+value.getValueToProcess());
		}
	}
}
