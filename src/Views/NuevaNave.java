package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NuevaNave extends JFrame implements ActionListener {

    protected JLabel seleccionarNave;
    protected JButton btnLanzadera, btnTripulada, btnNoTripulada, btnRetornar;

    public NuevaNave() {
        JFrame f = new JFrame();

        seleccionarNave = new JLabel("¿Qué tipo de Nave desea registrar?");
        seleccionarNave.setFont(new Font("Arial", Font.PLAIN, 16));
        seleccionarNave.setSize(300, 25);
        seleccionarNave.setLocation(100, 50);
        f.add(seleccionarNave);

        btnLanzadera = new JButton("Lanzadera");
        btnLanzadera.setFont(new Font("Arial", Font.PLAIN, 16));
        btnLanzadera.setSize(125, 25);
        btnLanzadera.setLocation(30, 85);
        f.add(btnLanzadera);

        btnTripulada = new JButton("Tripulada");
        btnTripulada.setFont(new Font("Arial", Font.PLAIN, 16));
        btnTripulada.setSize(125, 25);
        btnTripulada.setLocation(165, 85);
        f.add(btnTripulada);

        btnNoTripulada = new JButton("No Tripulada");
        btnNoTripulada.setFont(new Font("Arial", Font.PLAIN, 16));
        btnNoTripulada.setSize(125, 25);
        btnNoTripulada.setLocation(300, 85);
        f.add(btnNoTripulada);

        btnRetornar = new JButton("Retornar");
        btnRetornar.setFont(new Font("Arial", Font.PLAIN, 16));
        btnRetornar.setSize(100, 25);
        btnRetornar.setLocation(180, 125);
        f.add(btnRetornar);

        // Función de Nueva Lanzadera
        btnLanzadera.addActionListener(e -> {
            f.dispose();
            new NuevaLanzadera();
        });

        // Función de Nueva Tripulada
        btnTripulada.addActionListener(e -> {
            f.dispose();
            new NuevaTripulada();
        });

        // Función de Nueva No Tripulada
        btnNoTripulada.addActionListener(e -> {
            f.dispose();
            new NuevaNoTripulada();
        });

        // Función Retornar
        btnRetornar.addActionListener(e -> {
            f.dispose();
            new Menu();
        });

        // Definir los atributos del Frame
        f.setSize(480, 225);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Nueva Nave");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
