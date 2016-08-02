package com.usingwaitnotify;

public class Test {
		public static void main(String[] args ){
			PCproblem pcp = new PCproblem();
			Thread pro = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						pcp.producer();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
			Thread con = new Thread(new Runnable() {
				public void run() {
					try {
						pcp.consumer();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			pro.start();
			con.start();
		}
}
