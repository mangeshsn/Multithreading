package packexercises.common;

public class ThreadUtilities {
	
	public static void randomSleep(){
		try {
			Thread.sleep((long)( Math.random()*3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	public static void lightProcessing(){
		int l = 0, m = 0, n = 0;
		for(int i=0; i<10000; i++)
			for(int j=0; j<1000; j++)
				for (int k=0; k<100; k++){
						
						l++; m++; n++;
				}
	}
	
	@SuppressWarnings("unused")
	public static void heavyProcessing(){
		int l = 0, m = 0, n = 0;
		for(int i=0; i<10000; i++)
			for(int j=0; j<20000; j++)
				for (int k=0; k<100; k++){
						
						l++; m++; n++;
				}
	}
}
