/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diru
 */
public class Zoo extends JFrame {

    String[] arrayZoo = new String[]{
        "Pájaro", "Cerdo", "Perro", "Gato", "Conejo"
    };
    
    
    ImageIcon iGato = new ImageIcon(getClass().getResource("/resources/zoo/Gato.gif"));
    ImageIcon iCerdo = new ImageIcon(getClass().getResource("/resources/zoo/Cerdo.gif"));
    ImageIcon iPajaro = new ImageIcon(getClass().getResource("/resources/zoo/Pajaro.gif"));
    ImageIcon iPerro = new ImageIcon(getClass().getResource("/resources/zoo/Perro.gif"));
    ImageIcon iConejo = new ImageIcon(getClass().getResource("/resources/zoo/Conejo.gif"));

    ImageIcon[] arrayImg = new ImageIcon[]{
        iPajaro,iCerdo,iPerro,iGato,iConejo
    };
    
    JComboBox cbZoo = new JComboBox();
    JLabel jlImagen = new JLabel(iPajaro);

    public Zoo() {
        super("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
        this.getContentPane().setLayout(new GridLayout(2, 1));
       // this.getContentPane().setPreferredSize(new Dimension(180, 170));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setPreferredSize(new Dimension(80, 50));
        for (int i = 0; i < arrayZoo.length; i++) {
            cbZoo.addItem(arrayZoo[i]);
        }

        cbZoo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comprobacion(cbZoo.getSelectedIndex());

            }
        });
        p1.add(cbZoo);
        p2.add(jlImagen);
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
        Zoo inicio = new Zoo();
    }

    public void comprobacion(Integer num) {

             jlImagen.setIcon((Icon) arrayImg[num]); 
             jlImagen.setToolTipText(arrayZoo[num]);
            
        }
       /* if (cbZoo.getSelectedItem().equals("Pájaro")) {
            jlImagen.setIcon((Icon) iPajaro);
            jlImagen.setToolTipText("Pájaro");
        }
        if (cbZoo.getSelectedItem().equals("Gato")) {
            jlImagen.setIcon((Icon) iGato);
            jlImagen.setToolTipText("Gato");
        }
        if (cbZoo.getSelectedItem().equals("Perro")) {
            jlImagen.setIcon((Icon) iPerro);
            jlImagen.setToolTipText("Perro");
        }
        if (cbZoo.getSelectedItem().equals("Cerdo")) {
            jlImagen.setIcon((Icon) iCerdo);
            jlImagen.setToolTipText("Cerdo");
        }
        if (cbZoo.getSelectedItem().equals("Conejo")) {
            jlImagen.setIcon((Icon) iConejo);
            jlImagen.setToolTipText("Conejo");
        }
*/
    }

