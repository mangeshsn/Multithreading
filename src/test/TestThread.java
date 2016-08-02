package test;

public class TestThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println("Run:"+name);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}

}
