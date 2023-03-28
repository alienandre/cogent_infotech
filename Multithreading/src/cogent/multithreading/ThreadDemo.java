package cogent.multithreading;

class MyThread implements Runnable{
	public void run() {
		System.out.println("This is " + Thread.currentThread().getName());
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
	MyThread t1 = new MyThread();
	MyThread t2 = new MyThread();
	Thread thread1 = new Thread(t1);
	Thread thread2 = new Thread(t2);
	thread1.setPriority(1);
	thread2.setPriority(10);
	
	thread1.start();
	thread2.start();
		
	}	
}
