/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diru
 */
public class Pares_Impares extends JFrame {

    JComboBox cmbBox = new JComboBox();
    DefaultComboBoxModel dCmbBoxPar = new DefaultComboBoxModel();
    DefaultComboBoxModel dCmbBoxImpar = new DefaultComboBoxModel();

    JButton jbPares = new JButton("Pares");
    JButton jbImpares = new JButton("Impares");
    JTextField txtResultado = new JTextField(20);
    

    public Pares_Impares() {
        super("Pares e Impares");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        BoxLayout admin = new BoxLayout(panel3, BoxLayout.Y_AXIS);
        panel3.setLayout(admin);
        this.getContentPane().setPreferredSize(new Dimension(300, 200));
        txtResultado.setBorder(BorderFactory.createLineBorder(Color.black));
        
        jbPares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmbBox.setModel(dCmbBoxPar);}});

        jbImpares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmbBox.setModel(dCmbBoxImpar);}});

      cmbBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtResultado.setText(""+cmbBox.getModel().getSelectedItem());}});
         rellenar();
        cmbBox.setModel(dCmbBoxImpar);
        
        panel.add(cmbBox);
        panel.add(jbPares);
        panel.add(jbImpares);
        panel2.add(txtResultado);
        panel3.add(panel);
        panel3.add(panel2);
        add(panel3);
        
        pack();
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pares_Impares inicio = new Pares_Impares();
    }

    public void rellenar() {
          
        for (int i = 0; i < 10; i++) {
            if (i%2==0) dCmbBoxPar.addElement("Nº"+i);
            else dCmbBoxImpar.addElement("Nº"+i);
            }
    }

}
