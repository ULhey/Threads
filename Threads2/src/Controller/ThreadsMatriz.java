package Controller;

import javax.swing.JOptionPane;

public class ThreadsMatriz extends Thread {
	int i;
	int[][] m;

	public ThreadsMatriz(int i, int[][] m) {
		this.i = i;
		this.m = m;
	}

	@Override
	public void run() {
		int[] soma = new int[3];
		for (int c = 0; c < 5; c++) {
			soma[i] += m[i][c]; // += é usado como uma outra maneira mais curta de escrever que você quer somar
								// na própria variável algum outro valor
		}
		JOptionPane.showMessageDialog(null, "Linha da Matriz: " + (i + 1) + "\nSoma:  " + soma[i]);
	}
}