package packexercises.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFactory {

	public static ExecutorService getExecutorService(){
		// Starts one thread and executes more than one execute() in same thread.
		//return Executors.newSingleThreadExecutor();
		
		// Starts two threads max.
		return Executors.newFixedThreadPool(3);
		//return Executors.newFixedThreadPool(4);
		//return Executors.newCachedThreadPool();
	}
}
