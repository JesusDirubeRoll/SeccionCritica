/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diru
 */
public class Lista extends JFrame {

    String[] colores = new String[]{
        "Rojo", "Verde", "Azul"
    };
    JTextField txtResultado = new JTextField(20);
    JButton jbAceptar = new JButton("Aceptar");
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JList lista = new JList(colores);

    public Lista() {
        super("Lista");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
//JFrame frame = new JFrame();
//this.getContentPane().setLayout(new BorderLayout());
        // getContentPane().setPreferredSize(new Dimension(300, 200));
    //    JPanel panel = new JPanel();
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        BoxLayout admin = new BoxLayout(panel4, BoxLayout.Y_AXIS);
        panel4.setLayout(admin);
        lista.setBorder(BorderFactory.createLineBorder(Color.black));

        //panel.setPreferredSize(new Dimension(50, 90));
        panel.add(lista);
        txtResultado.setBorder(BorderFactory.createLineBorder(Color.black));
        jbAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comprobacion();

            }
        });



        panel2.add(jbAceptar);
        panel3.add(txtResultado);
        panel4.add(panel);
        panel4.add(panel2);
        panel4.add(panel3);
        this.getContentPane().add(panel4);

        pack();
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista inicio = new Lista();
    }

    public void comprobacion() {

        if (lista.isSelectedIndex(0)) {
            txtResultado.setText("EL color seleccionado es: Rojo");
        } else if (lista.isSelectedIndex(1)) {
            txtResultado.setText("EL color seleccionado es: Verde");
        } else if (lista.isSelectedIndex(2)) {
            txtResultado.setText("EL color seleccionado es: Azul");
        } else {
            txtResultado.setText("No hay colores seleccionados");
        }

    }
}
