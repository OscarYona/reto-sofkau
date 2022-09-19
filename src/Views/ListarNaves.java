package Views;

import Classes.Nave;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class ListarNaves extends JFrame implements ActionListener {

    protected JLabel lModelo, lAgencia, lfiltrar;
    protected JButton btnRetornar, btnFiltrar;
    protected JTextField tFiltrar;
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
        p.setLocation(50, 80);

        listModelo.setFont(new Font("Arial", Font.PLAIN, 16));
        listModelo.setSize(200, 400);
        listModelo.setLocation(50, 80);

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

        // Filtro
        lfiltrar = new JLabel("Filtrar: ");
        lfiltrar.setFont(new Font("Arial", Font.PLAIN, 16));
        lfiltrar.setSize(60, 20);
        lfiltrar.setLocation(180, 500);
        f.add(lfiltrar);
        tFiltrar = new JTextField();
        tFiltrar.setFont(new Font("Arial", Font.PLAIN, 16));
        tFiltrar.setSize(100, 20);
        tFiltrar.setLocation(250, 500);
        f.add(tFiltrar);
        btnFiltrar = new JButton("Filtrar");
        btnFiltrar.setFont(new Font("Arial", Font.PLAIN, 16));
        btnFiltrar.setSize(100, 20);
        btnFiltrar.setLocation(360, 500);
        f.add(btnFiltrar);

        // Funcion de filtrar
        btnFiltrar.addActionListener(e -> {
            String filtro = tFiltrar.getText();
            List<Nave> navesFiltradas = Nave.filtrarNaves(filtro);
            String[] modeloNavesFiltradas = new String[navesFiltradas.size()];
            String[] agenciaNavesFiltradas = new String[navesFiltradas.size()];
            for(Nave nave : navesFiltradas) {
                modeloNavesFiltradas[navesFiltradas.indexOf(nave)] = nave.getModelo();
                agenciaNavesFiltradas[navesFiltradas.indexOf(nave)] = nave.getAgenciaEspacial();
            }
            listModelo.setListData(modeloNavesFiltradas);
            listAgencia.setListData(agenciaNavesFiltradas);
        });

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
