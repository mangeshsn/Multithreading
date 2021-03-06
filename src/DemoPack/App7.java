package DemoPack;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App7 {
	

	static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(5);

	private static void producer() throws InterruptedException {
		System.out.println("producer started...");
		Random random = new Random();
		while (true) {
			blockingQueue.put(random.nextInt(100));
			System.out.println(blockingQueue);
		}
	}

	private static void consumer() throws InterruptedException {
		System.out.println("consumer started...");
		Random random = new Random();
		Integer value;
		while (true) {
			Thread.sleep(100);
			
			if (random.nextInt(10) == 0) {
				value = blockingQueue.take();

				System.out.println("Integer value is :" + value +" and the size of queue is :"+blockingQueue.size());
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
