package View;

import Controller.ThreadsSapo;

public class MainThread {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			ThreadsSapo thread = new ThreadsSapo();
			thread.start();
		}
	}
}