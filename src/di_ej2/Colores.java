/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Diru
 */
public class Colores extends JFrame {

    JButton btnRojo = new JButton("Rojo");
    JButton btnVerde = new JButton("Verde");
    JButton btnAzul = new JButton("Azul");
    JPanel jpColor = new JPanel();
    JPanel jpColor2 = new JPanel();

    public Colores() {
        super("Colores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//setLayout(new FlowLayout());

        JFrame frame = new JFrame();
        frame.setTitle("Colores");
        frame.setLayout(new BorderLayout());
        
        frame.getContentPane().setPreferredSize(new Dimension(300, 200));
       // jpColor.setPreferredSize(new Dimension(100, 100));
        jpColor2.setPreferredSize(new Dimension(200, 200));
        btnRojo.setBackground(Color.red);
        btnRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jpColor2.setBackground(Color.red);
            }
        });
        btnVerde.setBackground(Color.green);
        btnVerde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jpColor2.setBackground(Color.green);
            }
        });
        btnAzul.setBackground(Color.blue);
        btnAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jpColor2.setBackground(Color.blue);
            }
        });

        this.getContentPane().add(jpColor);
         frame.add(jpColor, BorderLayout.NORTH);
          frame.add(jpColor2, BorderLayout.CENTER);
        // this.getContentPane().add(jpColor2);
        
        
        jpColor.add(btnRojo);
        jpColor.add(btnVerde);
        jpColor.add(btnAzul);

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colores arranque = new Colores();

    }

    //-----------------------EVENTOS---------------------
    //---------------------------METODOS
}
