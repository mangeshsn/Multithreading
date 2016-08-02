package packexercises.thrd90otherThings.thrd10daemon;

public class DaemonThread {
	  public static void main(String[] args) {
		  System.out.println("entering main()");
		  
		  ServiceProvider randomOfRandoms = new ServiceProvider();

		  Thread poolService = new Thread(randomOfRandoms, "RandomOfRandoms");
		  poolService.setDaemon(false);
		  poolService.start();
		  
		  Thread worker = new Thread(new TaskUsingService(randomOfRandoms), "TaskThread");
		  worker.start();
		  System.out.println("leaving main()");
	  }
}