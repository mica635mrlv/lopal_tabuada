package br.sp.senai.jandira.calculdora_tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {

	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 700);
		tela.setDefaultCloseOperation(3);
		tela.setTitle("Calculadora Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		// Criar um Label para Inserir no JFrame
		
		// Multiplicando
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 10, 100, 20);
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(160, 12, 50, 20);
		
		// Mínimo Multiplicador
		
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(20, 40, 130, 20);
		JTextField txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(160, 42, 50, 20);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		
		// Máxico Multiplicador
		
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(20, 70, 130, 20);
		JTextField txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(160, 72, 50, 20);		
	    
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(labelMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicador);
		
		
		tela.getContentPane().add(buttonCalcular);
		
		
		
		tela.setVisible(true);
		
	}
	
}
