package test;

public class TestThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println("Run:"+name);
		Thread t1 = new Thread(new TestThread());
		t1.setName("derp");
		t1.start();
		
	}

	@Override
	public void run() { 
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}

}
