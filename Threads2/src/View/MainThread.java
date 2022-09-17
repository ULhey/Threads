package View;

import Controller.ThreadsMatriz;

public class MainThread {
	public static void main(String[] args) {
		int[][] m = new int[3][5];
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 5; c++) {
				m[l][c] = (int) (Math.random() * 10) + 1;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			ThreadsMatriz thread = new ThreadsMatriz(i, m);
			thread.start();
		}
	}
}