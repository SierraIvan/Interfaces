package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Engine extends JFrame implements ActionListener {
	private JPanel contentPanel, displayPanel, buttonPanel;
	private JTextField display;
	private JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, divide, multiply, subtract, add, equal, reset;

	private enum ButtonType {
		REGULAR, OPERATOR, RESULTADO
	}

	private int num1, num2, result;
	private char operation;

	public Engine() {
		setSettings();
		addActionEvent();
	}

	public void setSettings() {
	    this.setSize(350, 350);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    contentPanel = new JPanel(new BorderLayout());
	    displayPanel = new JPanel(new FlowLayout());
	    buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
	    display = new JTextField(20);
	    display.setEditable(false);
	    display.setFont(new Font("Arial", Font.PLAIN, 18));
	    displayPanel.add(display);

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

	    JButton[] buttons = { n7, n8, n9, divide, n4, n5, n6, multiply, n1, n2, n3, subtract, reset, n0, equal, add };
	    for (JButton button : buttons) {
	        if (button == divide || button == multiply || button == subtract || button == add || button == equal) {
	            setFeaturesButton(button, ButtonType.OPERATOR);
	        } else {
	            setFeaturesButton(button, ButtonType.REGULAR);
	        }
	        buttonPanel.add(button);
	    }

	    contentPanel.add(displayPanel, BorderLayout.NORTH);
	    contentPanel.add(buttonPanel, BorderLayout.CENTER);
	    this.add(contentPanel);
	    this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		String input_text = e.getActionCommand();

		if (source == reset) {
			display.setText("");

		} else if (source == equal) {
			try {
				String[] partes = display.getText().split(" ");
				num1 = Integer.parseInt(partes[0]);
				operation = partes[1].charAt(0);
				num2 = Integer.parseInt(partes[2]);
				if (operation == '/' && num2 == 0) {
					display.setText("Error");
				} else {
					operation();
					display.setText(String.valueOf(result));
				}
			} catch (Exception ex) {
				display.setText("Error");
			}
		} else if (source == add || source == divide || source == multiply) {
			display.setText(display.getText() + " " + input_text + " ");

		} else if (source == subtract) {
			if (display.getText().isEmpty() || display.getText().endsWith(" ")) {
				display.setText(display.getText() + "-");
			} else {
				display.setText(display.getText() + " " + input_text + " ");
			}
		} else {
			display.setText(display.getText() + input_text);
		}
	}

	public void operation() {
		switch (operation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
		}

	}

	public void addActionEvent() {
		JButton[] buttons = { n7, n8, n9, divide, n4, n5, n6, multiply, n1, n2, n3, subtract, reset, n0, equal, add };
		for (JButton button : buttons) {
			button.addActionListener(this);
		}

	}

	public void setFeaturesButton(JButton _button, ButtonType _type) {
	    switch (_type) {
	        case REGULAR:
	            _button.setBackground(Color.LIGHT_GRAY);
	            _button.setForeground(Color.BLACK);
	            break;
	        case OPERATOR:
	            _button.setBackground(Color.GRAY);
	            _button.setForeground(Color.WHITE);
	            break;
	    }
	    _button.setFont(new Font("Arial", Font.BOLD, 16));
	    _button.setOpaque(true);
	    _button.setBorderPainted(false);
	}

}
