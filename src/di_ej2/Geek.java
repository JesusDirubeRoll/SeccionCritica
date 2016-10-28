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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diru
 */
public class Geek extends JFrame {

    String texto = "/resources/geek/";
    String txtCambia = "geek-----.gif";
    JCheckBox chkBarbilla = new JCheckBox("Barbilla");
    JCheckBox chkGafas = new JCheckBox("Gafas");
    JCheckBox chkPelo = new JCheckBox("Pelo");
    JCheckBox chkDientes = new JCheckBox("Dientes");
    JPanel p1 = new JPanel(new GridLayout(4,1));
        JPanel p2 = new JPanel();
         

    ImageIcon iGeek = new ImageIcon(getClass().getResource(texto + txtCambia));

    JLabel jImagen = new JLabel();

    public Geek() {
        super("Viste Greek");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setLayout(new FlowLayout());
       this.getContentPane().setLayout(new GridLayout(1,2));
        this.getContentPane().setPreferredSize(new Dimension(300, 200));

        Image nuevogeek = iGeek.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        iGeek = new ImageIcon(nuevogeek);
//jImagen.setPreferredSize(new Dimension(100,100));
//jImagen.setMinimumSize(new Dimension(100,100);
        jImagen.setIcon(iGeek);

//--------------------------------------
        chkBarbilla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comprobacion();
            }
             });
        chkGafas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comprobacion();
            }
             });
         chkPelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comprobacion();
            }
             });
         chkDientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comprobacion();
            }
        });

//---------------------------------------------------
        p1.add(chkBarbilla);
        p1.add(chkGafas);
        p1.add(chkPelo);
        p1.add(chkDientes);
        p2.add(jImagen);
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
        Geek inicio = new Geek();

    }
public void comprobacion() {
    //txtCambia=geek-----.gif;
   /* public void comprobacion() {
       String aux = "geek-";
       
        if (chkBarbilla.isSelected()) {
            aux = aux + "c";
           
        } else {
            aux = aux + "-";
        }
if (chkGafas.isSelected()) {
            aux = aux + "g";
        } else {
            aux = aux + "-";
        }
if (chkPelo.isSelected()) {
            aux = aux + "h";
        } else {
            aux = aux + "-";
        }
if (chkDientes.isSelected()) {
            aux = aux + "t";
        } else {
            aux = aux + "-";
        }
        
        aux = aux + ".gif";
        System.out.println(texto+aux);
        ImageIcon iAux = new ImageIcon(getClass().getResource(texto + aux));
         Image nuevogeek = iAux.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        iGeek = new ImageIcon(nuevogeek);
        jImagen.setIcon(iGeek);
    }
    */
texto="geek-----.gif";
 if (chkBarbilla.isSelected()) {
            texto=insertaCaracterEnCadena(texto, 6,'c');
           
        } else {
            texto=insertaCaracterEnCadena(texto, 6,'-');
        }
if (chkGafas.isSelected()) {
            texto=insertaCaracterEnCadena(texto, 7,'g');
        } else {
            texto=insertaCaracterEnCadena(texto, 7,'-');
        }
if (chkPelo.isSelected()) {
           texto=insertaCaracterEnCadena(texto,8,'h');
        } else {
           texto=insertaCaracterEnCadena(texto, 8,'-');
        }
if (chkDientes.isSelected()) {
            texto=insertaCaracterEnCadena(texto, 9,'t');
        } else {
            texto=insertaCaracterEnCadena(texto, 9,'-');
        }
        System.out.println(texto);
       ImageIcon iAux = new ImageIcon(getClass().getResource("/resources/geek/"+texto));
        Image nuevogeek = iAux.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        iGeek = new ImageIcon(nuevogeek);
        jImagen.setIcon(iGeek);

}
    private String insertaCaracterEnCadena(String cadena, int posicion,char caracter){
return (cadena.substring(0,posicion-1)+caracter+cadena.substring(posicion));
}
    
    
    }

