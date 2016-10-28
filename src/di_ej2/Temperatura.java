/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Diru
 */
public class Temperatura extends JFrame implements ChangeListener {

    JSlider jsCel = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
    JSlider jsFar = new JSlider(JSlider.HORIZONTAL, 32, 212, 32);
    //JTextField txtTerm = new JTextField("Modo");
    JLabel jlCel = new JLabel("Temperatura(Cº): 0");
    JLabel espacio = new JLabel("                           ");
    JLabel jlFar = new JLabel("Temperatura(Cº): 32");
    JMenuBar menuBar = new JMenuBar();
    JMenu modo = new JMenu("Modo");
    JMenuItem menuCaF = new JMenuItem("Celsius a Farengheit");
    JMenuItem menuFaC = new JMenuItem("Farengheit a Celsius");

    public Temperatura() {
        super("Convertidor de temperaturas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLayout(new FlowLayout());
        this.getContentPane().setPreferredSize(new Dimension(390, 190));

        modo.add(menuCaF);
        modo.add(menuFaC);

        menuBar.add(modo);
        setJMenuBar(menuBar);
        menuCaF.setEnabled(false);
        jsCel.setPaintTicks(true);
        jsFar.setPaintTicks(true);
        jsCel.setMajorTickSpacing(20);
        jsFar.setMajorTickSpacing(36);
        jsCel.setPaintLabels(true);
        jsFar.setPaintLabels(true);
        jsFar.setEnabled(false);
        // add(miNuevo);
        // add(txtTerm);
        this.getContentPane().setLayout(new GridLayout(2, 1));
        // this.getContentPane().setPreferredSize(new Dimension(180, 170));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        menuFaC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                FaC();
            }
        });

        menuCaF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CaF();
            }
        });

        jsCel.addChangeListener(this);
        //add(espacio);

        p1.add(jlCel);
        p1.add(jsCel);
        p2.add(jlFar);
        p2.add(jsFar);
        add(p1);
        add(p2);
        pack();
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Temperatura inicio = new Temperatura();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        double resultado;

        if (source == jsCel) {
            jsFar.removeChangeListener(this);
            int valor = (int) source.getValue();
            resultado = valor * 1.8 + 32;
            jsFar.setValue((int) resultado);
            //System.out.println("" + resultado);
        } else {
            int valor = (int) source.getValue();
            jsCel.removeChangeListener(this);
            resultado = (valor - 32) * 0.55;
            jsCel.setValue((int) resultado);
        }
    }

    public void FaC() {
        menuCaF.setEnabled(true);
        menuFaC.setEnabled(false);
        jsFar.setEnabled(true);
        jsCel.setEnabled(false);
        jsCel.removeChangeListener(this);
        jsFar.addChangeListener(this);
    }

    public void CaF() {
        menuCaF.setEnabled(false);
        menuFaC.setEnabled(true);
        jsFar.setEnabled(false);
        jsCel.setEnabled(true);
        jsFar.removeChangeListener(this);
        jsCel.addChangeListener(this);
    }
}
