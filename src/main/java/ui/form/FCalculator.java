/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import calculator.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nemanja
 */
public class FCalculator extends JFrame{

    JLabel jLabA; 
    JLabel jLabB;
    JLabel jLabC;
    JTextField jTxtA;
    JTextField jTxtB;
    JTextField jTxtC;
    JButton jBtnAdd;
    JButton jBtnSubtract;
    
    public FCalculator(String name) {
        super(name);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 500, 550, 310);
        setLocationRelativeTo(null);
        
    }
   
    public void initComponents() {
        
        
        
        jLabA = new JLabel();
        jLabB = new JLabel();
        jLabC = new JLabel();
        jTxtA = new JTextField();
        jTxtB = new JTextField();
        jTxtC = new JTextField();
        jBtnAdd = new JButton();
        jBtnSubtract = new JButton();
        
        jLabA.setText("a:");
        jLabB.setText("b:");
        jLabC.setText("c:");
        jBtnAdd.setText("Add");
        jBtnSubtract.setText("Subtract");
        jTxtC.setEditable(false);
        
        jLabA.setBounds(1, 1, 100, 20);
        jLabB.setBounds(1, 25, 100, 20);
        jLabC.setBounds(1, 50, 100, 20);
        jTxtA.setBounds(105, 1, 100, 20);
        jTxtB.setBounds(105, 25, 100, 20);
        jTxtC.setBounds(105, 50, 100, 20);
        jBtnAdd.setBounds(210, 1, 100, 20);
        jBtnSubtract.setBounds(210, 25, 100, 20);
        
        
        
        Container container = getContentPane();
        container.setLayout(null);
        container.add(jLabA);
        container.add(jLabB);
        container.add(jTxtA);
        container.add(jTxtB);
        container.add(jTxtC);
        container.add(jBtnAdd);
        container.add(jBtnSubtract);
        
        
        
        jBtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBtnAddActionPerformed(e);
            }
        });
        
        jBtnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBtnSubtractActionPerformed(e);
            }
        });
        
        
    }
    
    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double firstNumber = Double.parseDouble(jTxtA.getText());
        double secondNumber = Double.parseDouble(jTxtB.getText());
        
        Calculator c = new Calculator();
        
        double result = c.add(firstNumber, secondNumber);
        jTxtC.setText("" + result);
    }      
    
    private void jBtnSubtractActionPerformed(ActionEvent evt){
        double firstNumber = Double.parseDouble(jTxtA.getText());
        double secondNumber = Double.parseDouble(jTxtB.getText());
        
        Calculator c = new Calculator();
        
        double result = c.subtract(firstNumber, secondNumber);
        jTxtC.setText("" + result);
    }
    
    
    
}
