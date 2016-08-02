package packexercises.thrd20executor.exec20call;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyPojo {
	private int x;
	
	public MyPojo(int x){
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public String toString(){
		return "Value:"+x;
	}
}

class StringTask implements Callable<MyPojo> {
	MyPojo mp;
	public StringTask(int x){
		mp = new MyPojo(x);
	}
	public MyPojo call() throws Exception {
		//System.out.println(mp);		
		return mp;
	}
}

public class ExecutorCallable {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		try {
			for(int i=0; i<10; i++){
				FutureTask<MyPojo> ft = new FutureTask<MyPojo>(new StringTask(i));
				pool.submit(ft);				
				MyPojo mp = ft.get();
				System.out.println(mp);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		pool.shutdown();
	}
}
