package Controller;

public class ThreadsSapo extends Thread {
	static int PM = 25; // pulo maximo
	static int DM = 100; // distancia maxima
	static int i = 1;

	@Override
	public void run() {
		int SapoP = 0;
		int SapoL = 0;
		int cntP = 0;

		while (SapoL < DM) {

			SapoP = (int) (Math.random() * PM) + 0;
			SapoL += SapoP;
			cntP++;
			System.out.println("🐸 Sapo " + getId() + " fez pulo de  " + SapoP + " metros.\n   Metros restante: ("
					+ SapoL + "/" + DM + ")\n");
		}

		System.out.println("* 🐸 Sapo " + getId() + "° com " + cntP + " pulos" + " chegou em " + i + "° lugar *\n");
		i++;
	}
}