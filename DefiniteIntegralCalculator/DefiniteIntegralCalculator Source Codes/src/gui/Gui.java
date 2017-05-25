package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import Model.CalculusDefiniteIntegration;

//JFrame
public class Gui extends JFrame implements ActionListener {
    
    public static void main(String[] args) {
        Gui f = new Gui();
        f.setVisible(true);
    }

    private JTextField lowerboundField;
    private JTextField upperboundField;
    private JTextField degreeField;
    private JTextField equationField;
    private JLabel answer;
    
    public Gui() {

        //JFrame Size
        setPreferredSize(new Dimension(400, 550));
        //JFrame Title
        setTitle("Integration");
        setLayout(null);

        //Components
        lowerboundField = new JTextField(5);
        upperboundField = new JTextField(5);
        degreeField = new JTextField(5);
        equationField = new JTextField(50);

        JLabel intro = new JLabel("Integral Calculator");

        JLabel limitsLabel = new JLabel("LIMITS:");
        JLabel lowerboundLabel = new JLabel("LOWER   =");
        JLabel upperboundLabel = new JLabel("UPPER     =");

        JLabel functionLabel = new JLabel("FUNCTION:");
        JLabel degreeofFunctionLabel = new JLabel("DEGREE  =");
        JLabel inputLabel = new JLabel("INPUT       =");
        
        JLabel reminderLabel1 = new JLabel("Format: Ax^2 + Bx + C");
        JLabel reminderLabel2 = new JLabel("Input Coefficients of A, B and C.");
        JLabel reminderLabel3 = new JLabel("Separate the numbers with a single space.");
        JLabel reminderLabel4 = new JLabel("Enter the hightest degree of equation");

        JButton integrateBtn = new JButton("Integrate!");
        integrateBtn.addActionListener(this);
        
        JLabel outputLabel = new JLabel("RESULT:");
        answer = new JLabel("Output will show here.");

        //Layout
        intro.setBounds(95, 10, 300, 27);
        intro.setFont(new Font("Century Gothic", Font.BOLD, 20));
        intro.setForeground(Color.DARK_GRAY);

        limitsLabel.setBounds(10, 50, 150, 27);
        limitsLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        limitsLabel.setForeground(Color.DARK_GRAY);

        lowerboundLabel.setBounds(70, 80, 150, 27);
        lowerboundLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        lowerboundLabel.setForeground(Color.DARK_GRAY);

        lowerboundField.setBounds(150, 80, 50, 25);

        upperboundLabel.setBounds(70, 110, 150, 27);
        upperboundLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        upperboundLabel.setForeground(Color.DARK_GRAY);

        upperboundField.setBounds(150, 110, 50, 25);

        functionLabel.setBounds(10, 150, 150, 27);
        functionLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        functionLabel.setForeground(Color.DARK_GRAY);
        
        reminderLabel1.setBounds(125, 180, 300, 27);
        reminderLabel1.setFont(new Font("Century Gothic", Font.BOLD, 12));
        reminderLabel1.setForeground(Color.DARK_GRAY);
        
        reminderLabel4.setBounds(80, 195, 400, 27);
        reminderLabel4.setFont(new Font("Century Gothic", Font.BOLD, 12));
        reminderLabel4.setForeground(Color.DARK_GRAY);
        
        degreeofFunctionLabel.setBounds(70, 230, 250, 25);
        degreeofFunctionLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        degreeofFunctionLabel.setForeground(Color.DARK_GRAY);
        
        degreeField.setBounds(150, 230, 100, 25);
        
        reminderLabel2.setBounds(105, 270, 400, 27);
        reminderLabel2.setFont(new Font("Century Gothic", Font.BOLD, 12));
        reminderLabel2.setForeground(Color.DARK_GRAY);
        
        reminderLabel3.setBounds(80, 285, 300, 27);
        reminderLabel3.setFont(new Font("Century Gothic", Font.BOLD, 12));
        reminderLabel3.setForeground(Color.DARK_GRAY);
        
        inputLabel.setBounds(70, 315, 150, 27);
        inputLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        inputLabel.setForeground(Color.DARK_GRAY);

        equationField.setBounds(150, 315, 200, 25);

        integrateBtn.setBounds(130, 360, 100, 30);
        integrateBtn.setFont(new Font("Century Gothic", Font.BOLD, 12));
        integrateBtn.setBackground(Color.LIGHT_GRAY);
        integrateBtn.setForeground(Color.DARK_GRAY);
        
        outputLabel.setBounds(10, 400, 150, 27);
        outputLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        outputLabel.setForeground(Color.DARK_GRAY);
        
        answer.setBounds(115, 440, 400, 27);
        answer.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        answer.setForeground(Color.DARK_GRAY);

        add(intro);
        add(limitsLabel);
        add(lowerboundLabel);
        add(lowerboundField);
        add(upperboundLabel);
        add(upperboundField);
        add(degreeField);
        add(degreeofFunctionLabel);
        add(functionLabel);
        add(inputLabel);
        add(equationField);
        add(reminderLabel1);
        add(reminderLabel2);
        add(reminderLabel3);
        add(reminderLabel4);
        add(integrateBtn);
        add(outputLabel);
        add(answer);

        pack();
        
        integrateBtn.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String lowerLimit = lowerboundField.getText();
                String upperLimit = upperboundField.getText();
                String degree = degreeField.getText();
                String equation = equationField.getText();
                
                CalculusDefiniteIntegration integrate = new CalculusDefiniteIntegration();
                Double result = integrate.solve(upperLimit, lowerLimit, equation, degree);
                answer.setText("Answer: " + result);
            }
        });
    }

     @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
