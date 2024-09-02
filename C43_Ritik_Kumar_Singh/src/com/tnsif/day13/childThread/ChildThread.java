package com.tnsif.day13.childThread;

public class ChildThread extends Thread {
	private int n;
	private String msg;

	// Constructor
	public ChildThread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.err.println("Thread interrupted: " + e.getMessage());
			}
			System.out.println(msg + i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ChildThread thread1 = new ChildThread(5, "Message ");
		thread1.start();
	}
}
