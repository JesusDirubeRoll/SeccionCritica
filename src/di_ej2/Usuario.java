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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Diru
 */
public class Usuario extends JFrame{
        JLabel jlUsuario = new JLabel("Usuario:      ");
        JLabel jlPassword = new JLabel("Password: ");
        JTextField txtUsuario = new JTextField(20);
        JPasswordField txtPassword = new JPasswordField(20);
        JButton btnAceptar = new JButton("Aceptar"); 
        
    public Usuario(){
        super("Introduce Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(350,150));
       // setLayout(new FlowLayout());
       // this.getContentPane().add(btnAceptar);
        this.getContentPane().setLayout(new GridLayout(3,1));
        JPanel p1 = new JPanel();
        p1.add(jlUsuario);
        p1.add(txtUsuario);
       
        JPanel p2 = new JPanel();
        p2.add(jlPassword);
        p2.add(txtPassword);
        JPanel p3 = new JPanel();
        p3. add(btnAceptar);
        this.getContentPane().add(p1);
        this.getContentPane().add(p2);
        this.getContentPane().add(p3);
        
        
        
       
        
        accionador();
        pack();
        setVisible(true);
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario arranque = new Usuario();
        
    
    }
    
    public void accionador(){
         btnAceptar.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent evt){
         btnAceptarAction(evt);
     }      
     });
    }
    
    public void btnAceptarAction(ActionEvent evt){
        String varTemporal="";
        varTemporal=varTemporal+this.txtUsuario.getText()+this.txtPassword.getPassword();
        this.setTitle(varTemporal);
    }
}
