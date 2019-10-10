/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ui.form.FCalculator;

/**
 *
 * @author Nemanja
 */
public class Main {
    public static void main(String[] args) {
        FCalculator c = new FCalculator("Kalkulator");
        c.setVisible(true);
        c.initComponents();
    }
}
