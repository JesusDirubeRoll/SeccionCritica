/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diru
 */
public class Calculadora extends JFrame implements ActionListener {

    JButton jbSuma = new JButton(" + ");

    JButton jbResta = new JButton(" - ");
    JButton jbMultiplicacion = new JButton(" * ");
    JButton jbDivision = new JButton(" / ");
    JButton jbLimpiar = new JButton("Limpiar");

    JLabel jlOperador1 = new JLabel("Operador 1:");
    JLabel jlOperador2 = new JLabel("Operador 2:");
    JLabel jlResultado = new JLabel("Resultado:");
    JLabel jlError = new JLabel("");

    JTextField txtOperador1 = new JTextField(10);
    JTextField txtOperador2 = new JTextField(10);
    JTextField txtResultado = new JTextField(20);

    public Calculadora() {
        super("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        //this.getContentPane().setPreferredSize(new Dimension(200,170));
        Image calc = new ImageIcon(getClass().getResource("/resources/calc.png")).getImage();
        setIconImage(calc);
        GridLayout panel = new GridLayout(4, 1);
        this.getContentPane().setLayout(panel);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        // this.setIconImage(icono.getimage);
        txtOperador1.setSize(new Dimension(50, 30));

        jbSuma.addActionListener(this);

        //----
        jbResta.addActionListener(this);

        //--
        jbDivision.addActionListener(this);
        //--
        jbMultiplicacion.addActionListener(this);
        //--

        jbLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtOperador1.setText("");
                txtOperador2.setText("");
                txtResultado.setText("");
                limpiar();
            }
        });

        p1.add(jlOperador1);
        p1.add(txtOperador1);

        p1.add(jlOperador2);
        p1.add(txtOperador2);

        p2.add(jbSuma);
        p2.add(jbResta);
        p2.add(jbMultiplicacion);
        p2.add(jbDivision);
        p2.add(jbLimpiar);
        p3.add(jlResultado);
        p3.add(txtResultado);
        p4.add(jlError);

        this.getContentPane().add(p1);
        this.getContentPane().add(p2);
        this.getContentPane().add(p3);
        this.getContentPane().add(p4);

        pack();
        setVisible(true);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculadora arranque = new Calculadora();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            //--Suma
            if (ae.getSource() == jbSuma) {
                int resultado = Integer.parseInt(txtOperador1.getText()) + Integer.parseInt(txtOperador2.getText());
                txtResultado.setText("" + resultado);
            }
            //Resta
            if (ae.getSource() == jbResta) {
                int resultado = Integer.parseInt(txtOperador1.getText()) - Integer.parseInt(txtOperador2.getText());
                txtResultado.setText("" + resultado);
            }
            //Multiplicacion
            if (ae.getSource() == jbMultiplicacion) {
                int resultado = Integer.parseInt(txtOperador1.getText()) * Integer.parseInt(txtOperador2.getText());
                txtResultado.setText("" + resultado);
            }
            //DIvision
            if (ae.getSource() == jbDivision) {
                if (txtOperador2.getText().equals("0")) {
                    jlError.setForeground(Color.red);
                   
                    jlError.setText("No se divide entre 0");
                } else {
                    int resultado = Integer.parseInt(txtOperador1.getText()) / Integer.parseInt(txtOperador2.getText());
                    txtResultado.setText("" + resultado);
                    limpiar();
                }
            }
            

        } catch (java.lang.NumberFormatException error) {
            jlError.setForeground(Color.red);
            if ((txtOperador1.getText().equals("")) || (txtOperador2.getText().equals(""))) {
                jlError.setText("Datos incompletos");
            } else {
                jlError.setText("Operador inválido");
            }
        }

    }

    public void limpiar() {
        jlError.setText("");
    }

}
