package Controller;

import javax.swing.JOptionPane;

public class ThreadsController extends Thread { // extendo uma classe como thread
	public ThreadsController() { // Recebe parametros
		super();
	}

	@Override
	public void run() { // Roda o role
//		System.out.println(getId());
		JOptionPane.showMessageDialog(null, "ID da Threads: " + getId());
	}
}