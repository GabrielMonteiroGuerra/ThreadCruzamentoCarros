package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCruzamentoCarros;

public class Principal {

	public static void main(String[] args) {
		
		int permissão = 1;
		Semaphore semaforo = new Semaphore(permissão);
		
		for (int idCarro = 0 ; idCarro < 4 ; idCarro++) {
			Thread tCarro = new ThreadCruzamentoCarros(idCarro + 1, semaforo);
			tCarro.start();
		}
	}
}
