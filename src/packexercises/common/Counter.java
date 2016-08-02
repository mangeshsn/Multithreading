package packexercises.common;

public class Counter {
	private int counter;
	
	public Counter(){
		counter = 0;
	}
	
	public Counter(int initValue){
		counter = initValue;
	}
	
	public int incrementAndGet(){
		counter++;
		return counter;
	}
	
	public int decrementAndGet(){
		counter--;
		return counter;
	}
	
	public void initCounter(int initValue){
		counter = initValue;
	}
}
