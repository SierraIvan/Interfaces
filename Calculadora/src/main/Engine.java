package main;

import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

 // Marco de la ventana



public class Engine extends JFrame {
	
	 private JFrame frame ;
	 // Panel general que ocupa toda la ventana
	 private JPanel contentPanel ;
	 private Container panelPrincipal;
	 // Panel norte que contiene el display
	 private JPanel displayPanel ;
	 // Panel sur que contiene los botones
	 private JPanel buttonPanel ;
	 // Display
	 private JTextField display ;
	 // Botones
	 private JButton n0 ;
	 private JButton n1 ;
	 private JButton n2 ;
	 private JButton n3 ;
	 private JButton n4 ;
	 private JButton n5 ;
	 private JButton n6 ;
	 private JButton n7 ;
	 private JButton n8 ;
	 private JButton n9 ;
	 private JButton divide ;
	 private JButton multiply ;
	 private JButton subtract ;
	 private JButton add ;
	 private JButton equal ;
	 private JButton reset ;
	 // Tipos de boton
	 private enum ButtonType { REGULAR , OPERATOR }
	 // Almacenar temporalmente ciertos valores
	 private int num1 , num2 , result ;
	 private char operation ;
	
	
	public Engine() {
		
		setSettings();
	}
	
	public void setSettings() {
		
		this.panelPrincipal = this.getContentPane();
		this.setLocation(50, 100);
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setFeaturesButton(JButton _button, ButtonType _type) {
		
	}

	
	public void addActionEvent() {
		
	}
	
	public void operation() {
		result = num1 + num2;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e . getSource () ;
		String input_text = e . getActionCommand () ;
	}
}
