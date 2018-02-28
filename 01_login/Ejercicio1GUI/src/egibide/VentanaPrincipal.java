package egibide;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel panel;
    private JLabel labelusu;
    private JTextField fieldusu;
    private JTextField fieldcontra;
    private JLabel labelcon;
    private JButton boton;
    JFrame frame = new JFrame("VentanaPrincipal");

    String usuario1 = "Pipo";
    String pass1 = "Pipo";

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public VentanaPrincipal() {
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fieldusu.equals(usuario1) && fieldcontra.equals(pass1)){

                    JOptionPane.showMessageDialog(frame,
                            "OK",
                            "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);


                } else {

                    JOptionPane.showMessageDialog(frame,
                            "ERROR",
                            "Resultado",
                            JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }
}
