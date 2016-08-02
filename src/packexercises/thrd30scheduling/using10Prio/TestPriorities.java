package packexercises.thrd30scheduling.using10Prio;

public class TestPriorities {
	public static void main(String[] args) {
		
		try {
			HeavyProcess hp = new HeavyProcess();
			Thread thrdHeavy = new Thread(hp, "HeavyThrd");
			//thrdHeavy.setPriority(Thread.MAX_PRIORITY);
			thrdHeavy.setPriority(Thread.MIN_PRIORITY);
			
			LightProcess lp = new LightProcess();
			Thread thrdLight1 = new Thread(lp, "LightThrd1");
			//thrdLight1.setPriority(Thread.MIN_PRIORITY);
			thrdLight1.setPriority(Thread.MAX_PRIORITY);
			
			Thread thrdLight2 = new Thread(lp, "LightThrd2");
			//thrdLight2.setPriority(Thread.MIN_PRIORITY);
			thrdLight2.setPriority(Thread.MAX_PRIORITY);
			
			thrdHeavy.start();
			thrdLight1.start();
			thrdLight2.start();
			
			Thread.sleep(2000);
			Thread thrdLight3 = new Thread(lp, "LightThrd3");
			thrdLight2.setPriority(Thread.MIN_PRIORITY);
			//thrdLight3.setPriority(Thread.MAX_PRIORITY);
			
			thrdLight3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}