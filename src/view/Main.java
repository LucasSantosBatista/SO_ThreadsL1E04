/**
 * 
 */
package view;

import controller.SapoThread;

/**
 * @author Lucas Batista 17 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {

		int distanciaMaximaSalto = (int) (Math.random() * 10) + 1;
		int distanciaTotalCorrida = 30;
		
		System.out.println("A distancia do salto é " + distanciaMaximaSalto);
		
		for (int i = 0; i < 5; i++) {
			new SapoThread(i + 1, distanciaMaximaSalto, distanciaTotalCorrida).start();
		}
	}

}
