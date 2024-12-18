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
    private int num1, num2, result;
    private char operation;
    public Engine() {
        setSettings();
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

        n0 = createButton("0");
        n1 = createButton("1");
        n2 = createButton("2");
        n3 = createButton("3");
        n4 = createButton("4");
        n5 = createButton("5");
        n6 = createButton("6");
        n7 = createButton("7");
        n8 = createButton("8");
        n9 = createButton("9");
        divide = createButton("/");
        multiply = createButton("x");
        subtract = createButton("-");
        add = createButton("+");
        equal = createButton("=");
        reset = createButton("C");

        JButton[] buttons = {n7, n8, n9, divide, n4, n5, n6, multiply, n1, n2, n3, subtract, reset, n0, equal, add};
        for (JButton button : buttons) {
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

        if(source == equal) {
        	String[] partes = display.getText().split(" ");
        	
        	num1 = Integer.parseInt(partes[0]);
            operation = partes[1].charAt(0);
            num2 = Integer.parseInt(partes[2]);
            operation();
            display.setText(String.valueOf(result) + " ");
        }
        else
        	
        	display.setText(display.getText() + input_text + " ");
    }

    public void operation() {
    	switch(operation) {
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

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        return button;
    }

}
