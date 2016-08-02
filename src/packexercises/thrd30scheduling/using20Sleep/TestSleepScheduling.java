package packexercises.thrd30scheduling.using20Sleep;

public class TestSleepScheduling {


	public static void main(String[] args) {
		ValueToProcess valueToProcess = new ValueToProcess();
		
		Thread client = new Thread(new ClientInHurry(4000, valueToProcess));

		Thread fetchValue = new Thread(new FetchValue(valueToProcess, client));
		
		client.start();
		fetchValue.start();
	}

}
