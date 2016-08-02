package packexercises.thrd90otherThings.thrd10daemon;

public class TaskUsingService implements Runnable {
	private ServiceProvider randomOfRandoms;
	
	
	public TaskUsingService(ServiceProvider randomOfRandoms) {
		super();
		this.randomOfRandoms = randomOfRandoms;
	}

	public void run(){
		Thread thisThread = Thread.currentThread();
		System.out.println(thisThread.getName() + ": Entering run()");

		System.out.println("----------------------");

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("-->" + randomOfRandoms.getRandomOfRandoms());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}