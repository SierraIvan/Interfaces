package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


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
        this.setVisible(true);
        contentPanel = new JPanel(new BorderLayout());
        displayPanel = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        display = new JTextField(20);
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
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public void operation() {
       

    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        return button;
    }

}
