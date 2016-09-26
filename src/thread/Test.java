package thread;

public class Test {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.setDaemon(true);
		/*
		 * Before starting the main thread, the nature of the child 
		 * thread has been set to daemon. Now child thread is a 
		 * background thread.
		 */
		
		t.start();
		/*
		 * At this point, we are having 2 threads : main thread and main thread.
		 * The main thread is non-daemon thread. 
		 * The child thread is daemon thread.
		 */
		
		System.out.println("End of Main Thread");
		/*
		 * After, this line executes, the only non-daemon thread will
		 * terminate.
		 * Automatically, all the daemon thread (including the child
		 * thread) will terminate, irrespective of their completion
		 * status.
		 */
	}

}
