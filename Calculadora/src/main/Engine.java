package main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
		
		this.contentPanel = new JPanel();
		this.contentPanel.setLayout(new BorderLayout());
		this.displayPanel = new JPanel();
		this.displayPanel.setLayout(new FlowLayout());
		this.buttonPanel = new JPanel();
		this.buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
		
		
		
		
		this.display = new JTextField(20);
		this.displayPanel.add(display);
		
		
		
		
		
		n0 = new JButton("0");
		n1 = new JButton("1");
		n2 = new JButton("2");
		n3 = new JButton("3");
		n4 = new JButton("4");
		n5 = new JButton("5");
		n6 = new JButton("6");
		n7 = new JButton("7");
		n8 = new JButton("8");
		n9 = new JButton("9");
		divide = new JButton("/");
		multiply = new JButton("x");
		subtract = new JButton("-");
		add = new JButton("+");
		equal = new JButton("=");
		reset = new JButton("C");

		this.buttonPanel.add(n7);
		this.buttonPanel.add(n8);
		this.buttonPanel.add(n9);
		this.buttonPanel.add(divide);
		this.buttonPanel.add(n4);
		this.buttonPanel.add(n5);
		this.buttonPanel.add(n6);
		this.buttonPanel.add(multiply);
		this.buttonPanel.add(n1);
		this.buttonPanel.add(n2);
		this.buttonPanel.add(n3);
		this.buttonPanel.add(subtract);
		this.buttonPanel.add(reset);
		this.buttonPanel.add(n0);
		this.buttonPanel.add(equal);
		this.buttonPanel.add(add);

		this.contentPanel.add(this.displayPanel, BorderLayout.NORTH);
		this.contentPanel.add(this.buttonPanel, BorderLayout.SOUTH);
		
		
		this.panelPrincipal.add(this.contentPanel, BorderLayout.CENTER);
		
		
		//this.panelPrincipal.add(contentPanel);
		
		
		
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
