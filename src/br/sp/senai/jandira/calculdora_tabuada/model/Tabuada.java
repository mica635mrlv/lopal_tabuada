package br.sp.senai.jandira.calculdora_tabuada.model;

import javax.swing.JLabel;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	public void CalcularTabuada() {
		
		System.out.println("----------------");
		System.out.println("Calcular Tabuada");
		System.out.println("----------------\n");
		
		//Verificar se os valores estão invertidos
		
		if(minimoMultiplicador > maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = temp;
		}
		
		// Calcular e mostrar tabela
		while (minimoMultiplicador <= maximoMultiplicador){
		
			double produto = multiplicando * minimoMultiplicador;
			System.out.printf("%s x %s = %s", multiplicando, minimoMultiplicador,produto);
			System.out.println();
			minimoMultiplicador++;
		}
			System.out.println("\nFIM!");
	
	}
	
	
	
}

