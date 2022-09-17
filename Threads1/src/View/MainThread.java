package View;

import Controller.ThreadsController;

public class MainThread {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread thread = new ThreadsController(); //Iniciam em nanos segundos
			thread.start(); //Sempre deve colocar para apresentar a thread
		}
	}
}