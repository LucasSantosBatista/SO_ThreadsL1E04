/**
 * 
 */
package controller;

/**
 * @author Lucas Batista 17 de mar. de 2024
 */
public class SapoThread extends Thread {
	private static int colocacao = 0;
	
	private int id;
	private int distanciaPulo;
	private int distanciaMaxima;
	private int distanciaPercorrida;

	public SapoThread(int id, int distanciaPulo, int distanciaMaxima) {
		super();
		this.id = id;
		this.distanciaPulo = distanciaPulo;
		this.distanciaMaxima = distanciaMaxima;
		this.distanciaPercorrida = 0;
	}

	public void run() {
		while (distanciaPercorrida < distanciaMaxima) {

			int tamanhoSalto = (int) (Math.random() * (distanciaPulo + 1));
			distanciaPercorrida += tamanhoSalto;

			System.out.println("Sapo #" + id + " pulou " + tamanhoSalto + "m - Total " + distanciaPercorrida
					+ " metros");

			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		colocacao++;
		System.out.println("	Sapo #" + id + " chegou em " + colocacao + "º lugar");
		
	}

}
