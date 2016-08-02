package packexercises.thrd90otherThings.thrd10daemon;

public class ServiceProvider implements Runnable{
	private volatile long randomOfRandoms;
	
	  public void run() {
		  Thread thisThread = Thread.currentThread();
		  
		  System.out.println(thisThread.getName()+": Entering run()");

	      System.out.println(thisThread.getName()+": Thread State: "+thisThread.getState());
	      
	      System.out.println(thisThread.getName()+": Daemon status: "+thisThread.isDaemon());
	      
	      while(true){
	    	  try {
				randomOfRandoms = (long) (Math.random()*100);
				System.out.println(thisThread.getName()+": "+randomOfRandoms);
				  Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      }
	  }
	  
	  public long getRandomOfRandoms(){
		  return randomOfRandoms;
	  }
}