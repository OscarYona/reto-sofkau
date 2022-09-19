package Views;

import Classes.Nave;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListarNaves extends JFrame implements ActionListener {

    protected JLabel lModelo, lAgencia;
    protected JButton btnRetornar;
    protected JList listModelo, listAgencia;

    public ListarNaves() {

        JFrame f = new JFrame();
        JPanel p = new JPanel();
        String[] modeloNaves = new String[Nave.naves.size()];
        String[] agenciaNaves = new String[Nave.naves.size()];

        for(Nave nave : Nave.naves) {
            modeloNaves[Nave.naves.indexOf(nave)] = nave.getModelo();
            agenciaNaves[Nave.naves.indexOf(nave)] = nave.getAgenciaEspacial();
        }

        listModelo = new JList(modeloNaves);
        listAgencia = new JList(agenciaNaves);

        //JScrollPane scrollingList = new JScrollPane(list);

        // Cabecera
        lModelo = new JLabel("Modelo: ");
        lModelo.setFont(new Font("Arial", Font.PLAIN, 16));
        lModelo.setSize(200, 20);
        lModelo.setLocation(50, 50);
        f.add(lModelo);
        lAgencia = new JLabel("Agencia Espacial: ");
        lAgencia.setFont(new Font("Arial", Font.PLAIN, 16));
        lAgencia.setSize(200, 20);
        lAgencia.setLocation(260, 50);
        f.add(lAgencia);

        // Lista de Naves
        p.setSize(400, 400);
        p.setLocation(-90, 100);

        listModelo.setFont(new Font("Arial", Font.PLAIN, 16));
        listModelo.setSize(200, 400);
        listModelo.setLocation(500, 800);

        listAgencia.setFont(new Font("Arial", Font.PLAIN, 16));
        listAgencia.setSize(200, 400);
        listAgencia.setLocation(260, 80);

        p.add(listModelo);
        p.add(listAgencia);
        f.add(p);

        btnRetornar = new JButton("Retornar");
        btnRetornar.setFont(new Font("Arial", Font.PLAIN, 16));
        btnRetornar.setSize(100, 20);
        btnRetornar.setLocation(50, 500);
        f.add(btnRetornar);

        // Definir los atributos del Frame
        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Listado de Naves");

        btnRetornar.addActionListener(e -> {
            f.dispose();
            new Menu();
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
