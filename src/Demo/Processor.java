package Demo;

import java.util.Scanner;

public class Processor {
	
	public void produce() throws InterruptedException{
		System.out.println("Produce started...");
		synchronized (this) {
			wait();// leaves the lock and when notified, it will start from here below
			System.out.println("Producer resumed");
		}
		
	}

	public void consume() throws InterruptedException{
		System.out.println("Consume started....");
		Thread.sleep(2000);
		System.out.println("Please hit return button");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		synchronized (this) {
			notify();// Notify should be ideally last line with in the Your synchronised block/method
			// as we see, wait cannot immediately Run if there lock is not released from with in the sync block
			Thread.sleep(5000);
		}
	}
}