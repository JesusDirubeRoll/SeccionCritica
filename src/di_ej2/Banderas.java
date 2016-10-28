/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Diru
 */
public class Banderas extends JFrame {

    ButtonGroup grpColores = new ButtonGroup();
    JRadioButton[] rColor = new JRadioButton[5];

    /*
        JRadioButton rBrazil = new JRadioButton("Bazil");
        JRadioButton rFrance = new JRadioButton("France");
        JRadioButton rItaly= new JRadioButton("Italy");
        JRadioButton rJapan = new JRadioButton("Japan");
        JRadioButton rSpain = new JRadioButton("Spain");
     */
    JLabel jImagen = new JLabel();

    public Banderas() {
        super("Banderas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
        JPanel p1 = new JPanel(new GridLayout(5,1));
        JPanel p2 = new JPanel();
         this.getContentPane().setLayout(new GridLayout(1,2));
   
        
         
       
        
        this.getContentPane().setPreferredSize(new Dimension(350, 120));
        rColor[0] = new JRadioButton("Bazil");
        rColor[1] = new JRadioButton("France");
        rColor[2] = new JRadioButton("Italy");
        rColor[3] = new JRadioButton("Japan");
        rColor[4] = new JRadioButton("Spain");

        ImageIcon iBrazil = new ImageIcon(getClass().getResource("/resources/brazil.jpg"));
        ImageIcon iFrance = new ImageIcon(getClass().getResource("/resources/france.jpg"));
        ImageIcon iItaly = new ImageIcon(getClass().getResource("/resources/italy.jpg"));
        ImageIcon iJapan = new ImageIcon(getClass().getResource("/resources/japan.jpg"));
        ImageIcon iSpain = new ImageIcon(getClass().getResource("/resources/spain.jpg"));
        /*  add (rBrazil);
              add(rFrance);
              add(rItaly);
              add(rJapan);
              add(rSpain);
              add(jImagen);
         */
        for (JRadioButton rColores : rColor) {
            grpColores.add(rColores);
            p1.add(rColores);
        }
//---------------------------------------------------------------------
        rColor[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jImagen.setIcon((Icon) iBrazil);
                
        setIconImage(iBrazil.getImage());
                
            }
        });
        rColor[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jImagen.setIcon((Icon) iFrance);
                setIconImage(iFrance.getImage());
            }
        });
        rColor[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jImagen.setIcon((Icon) iItaly);
                setIconImage(iItaly.getImage());
            }
        });
        rColor[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jImagen.setIcon((Icon) iJapan);
                setIconImage(iJapan.getImage());
                
            }
        });
        rColor[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jImagen.setIcon((Icon) iSpain);
                setIconImage(iSpain.getImage());
            }
        });

        //----------------------------------------
 
        add(p1);
        
        p2.add(jImagen);
        add(p2);
        pack();
        setVisible(true);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banderas arranque = new Banderas();
    }

}
