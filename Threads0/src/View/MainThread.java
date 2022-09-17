package View;

import Controller.ThreadVetor;

public class MainThread {
	static int vet[] = new int[1000]; // fora do metodo é global

	public static void main(String[] args) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) Math.random() * 100 + 1;
		}

		for (int i = 0; i < 2; i++) { // Chamando 2 threads
			Thread thread = new ThreadVetor(i);
			thread.start();
		}
	}
}