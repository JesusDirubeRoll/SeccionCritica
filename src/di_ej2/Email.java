/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_ej2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Diru
 */
public class Email extends JFrame {

    JPanel panel = new JPanel();
    JLabel jlPara = new JLabel("Para:  ");
    JLabel jlError = new JLabel("");
    JLabel jlAsunto = new JLabel("Asunto: ");
    JLabel jlMensaje = new JLabel("Mensaje: ");

    JTextField txtPara = new JTextField(20);
    JTextField txtAsunto = new JTextField(20);
    JTextArea txtMensaje = new JTextArea(3, 20);
    //JTextField txtMensaje = new JTextField(20);

    JScrollPane scroll = new JScrollPane(txtMensaje);

    JButton btnEnviar = new JButton("Enviar");

    public Email() {
        super("Escribe un correo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
         this.getContentPane().setLayout(new GridLayout(5,1));
        
        //this.getContentPane().setPreferredSize(new Dimension(300,200));
        //scroll.setHorizontalScrollBarPolicy(0);

        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBar(null);

        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (!txtPara.getText().contains("@")) {
                    jlError.setForeground(Color.red);
                    jlError.setText("El email proporcinado no es válido");
                } else {
                    jlError.setText("");
                }
            }
        });
        JPanel paneli = new JPanel();
        JPanel panelerror = new JPanel();
        JPanel panelasunt = new JPanel();
        paneli.add(jlPara);
        paneli.add(txtPara);
        panelerror.add(jlError);
        panelasunt.add(jlAsunto);
        panelasunt.add(txtAsunto);
        panel.add(jlMensaje);
        add(paneli);
        
        add(panelasunt);
        add(panel);
        panel.add(scroll);
        JPanel panelf = new JPanel();
        panelf.add(btnEnviar);
        add(panelf);
        add(panelerror);
        pack();
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Email arranque = new Email();
    }

}
