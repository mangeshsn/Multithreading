package packexercises.thrd30scheduling.using30Joins;

public class Activity implements Runnable {

	public void run() {
		Thread task1 = new Thread(new Task(), "Task1");
		Thread task2 = new Thread(new Task(), "Task2");
		Thread task3 = new Thread(new Task(), "Task3");
		
		task1.start();
		task2.start();
		task3.start();
		///*
		try {
			// Do join
			task1.join();
			task2.join();
			task3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//*/
		
		// To do task4
		System.out.println("doing Task4");
	}
}
