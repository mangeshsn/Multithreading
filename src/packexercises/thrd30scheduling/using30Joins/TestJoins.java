package packexercises.thrd30scheduling.using30Joins;

public class TestJoins {

	public static void main(String[] args) {
		Activity activity = new Activity();
		Thread thrdActivity = new Thread(activity, "Activity");
		
		thrdActivity.start();
	}
}
