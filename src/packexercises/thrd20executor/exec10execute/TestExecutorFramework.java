package packexercises.thrd20executor.exec10execute;

import java.util.concurrent.ExecutorService;

import packexercises.common.ExecutorFactory;

/*
 * On one CounterRunnable object 
 */
public class TestExecutorFramework {

	public static void main(String[] args) {
		CounterRunnable counter1 = new CounterRunnable("Obj1");
		CounterRunnable counter2 = new CounterRunnable("Obj2");
		CounterRunnable counter3 = new CounterRunnable("Obj3");
		
		ExecutorService execService = ExecutorFactory.getExecutorService();
		
		System.out.println("First execution:");
		execService.execute(counter1);
		
		System.out.println("Second execution:");
		execService.execute(counter2);
		//execService.execute(counter2);
		
		System.out.println("Third execution:");
		execService.execute(counter3);
		//execService.execute(counter3);
		
		execService.shutdown();
		String main = Thread.currentThread().getName();
		System.out.println("Which thread main() runs within?"+" "+main);
	}
}