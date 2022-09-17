package Controller;

public class ThreadVetor extends Thread {
	int cod;
	int vet[] = new int[1000];

	public ThreadVetor(int cod) { // cria os parametros da thread
		this.cod = cod; // quando uma variavel e um parametro tem o mesmo nome deve determinar com this
		// para a utilização
	}

	@Override
	public void run() {
		StringBuffer buffer = new StringBuffer();
		double start = System.nanoTime();
		if (cod % 3 == 0) {
			for (int i = 0; i < vet.length; i++) {
				buffer.append(vet[i]);
			}
		} else {
			for (int i : vet) {
				buffer.append(vet[i]);
			}
		}
		double end = System.nanoTime();
		System.out.println("ID ☜(ˆ▿ˆc): " + getId() + " Tempo: " + (end - start) / Math.pow(10, 9)); // Conversão
	}
}