package Views;

import Classes.Nave;
import Classes.Tripulada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class NuevaTripulada extends JFrame implements ActionListener {

    protected JLabel lModelo, lPeso, lPotencia, lMotores, lEmpuje, lCapCombustible, lCapTripulantes, lCapOxigeno, lAgenciaEspacial, lCombustible;
    protected JTextField tModelo, tPeso, tPotencia, tMotores, tEmpuje, tCapCombustible, tCapTripulantes, tCapOxigeno;
    protected JButton aceptar, cancelar;
    protected JComboBox cAgenciaEspacial, cTipoCombustible;
    protected String[] listAgencias = {"NASA", "AEFR", "AJEE", "CSA", "ESA"}, listCombustibles = {"Auto sustentable", "Liquido", "Solido", "Liquido/Solido"};

    protected Tripulada tripulada;

    public NuevaTripulada() {

        JFrame f = new JFrame();

        // Campo Modelo
        lModelo = new JLabel("Modelo: ");
        lModelo.setFont(new Font("Arial", Font.PLAIN, 14));
        lModelo.setSize(100, 20);
        lModelo.setLocation(50, 50);
        f.add(lModelo);
        tModelo = new JTextField();
        tModelo.setFont(new Font("Arial", Font.PLAIN, 14));
        tModelo.setSize(100, 20);
        tModelo.setLocation(160, 50);
        f.add(tModelo);

        // Campo Peso
        lPeso = new JLabel("Peso: ");
        lPeso.setFont(new Font("Arial", Font.PLAIN, 14));
        lPeso.setSize(100, 20);
        lPeso.setLocation(50, 80);
        f.add(lPeso);
        tPeso = new JTextField();
        tPeso.setFont(new Font("Arial", Font.PLAIN, 14));
        tPeso.setSize(100, 20);
        tPeso.setLocation(160, 80);
        f.add(tPeso);

        // Campo Potencia
        lPotencia = new JLabel("Potencia: ");
        lPotencia.setFont(new Font("Arial", Font.PLAIN, 14));
        lPotencia.setSize(100, 20);
        lPotencia.setLocation(50, 110);
        f.add(lPotencia);
        tPotencia = new JTextField();
        tPotencia.setFont(new Font("Arial", Font.PLAIN, 14));
        tPotencia.setSize(100, 20);
        tPotencia.setLocation(160, 110);
        f.add(tPotencia);

        // Campo Motores
        lMotores = new JLabel("Cant. Motores: ");
        lMotores.setFont(new Font("Arial", Font.PLAIN, 14));
        lMotores.setSize(100, 20);
        lMotores.setLocation(50, 140);
        f.add(lMotores);
        tMotores = new JTextField();
        tMotores.setFont(new Font("Arial", Font.PLAIN, 14));
        tMotores.setSize(100, 20);
        tMotores.setLocation(160, 140);
        f.add(tMotores);

        // Campo Empuje
        lEmpuje = new JLabel("Fuerza Empuje: ");
        lEmpuje.setFont(new Font("Arial", Font.PLAIN, 14));
        lEmpuje.setSize(100, 20);
        lEmpuje.setLocation(50, 170);
        f.add(lEmpuje);
        tEmpuje = new JTextField();
        tEmpuje.setFont(new Font("Arial", Font.PLAIN, 14));
        tEmpuje.setSize(100, 20);
        tEmpuje.setLocation(160, 170);
        f.add(tEmpuje);

        // Campo Capacidad de Combustible
        lCapCombustible = new JLabel("Combust. (l): ");
        lCapCombustible.setFont(new Font("Arial", Font.PLAIN, 14));
        lCapCombustible.setSize(100, 20);
        lCapCombustible.setLocation(310, 50);
        f.add(lCapCombustible);
        tCapCombustible = new JTextField();
        tCapCombustible.setFont(new Font("Arial", Font.PLAIN, 14));
        tCapCombustible.setSize(100, 20);
        tCapCombustible.setLocation(420, 50);
        f.add(tCapCombustible);

        // Campo Capacidad de Tripulantes
        lCapTripulantes = new JLabel("Carga Máx.: ");
        lCapTripulantes.setFont(new Font("Arial", Font.PLAIN, 14));
        lCapTripulantes.setSize(100, 20);
        lCapTripulantes.setLocation(310, 80);
        f.add(lCapTripulantes);
        tCapTripulantes = new JTextField();
        tCapTripulantes.setFont(new Font("Arial", Font.PLAIN, 14));
        tCapTripulantes.setSize(100, 20);
        tCapTripulantes.setLocation(420, 80);
        f.add(tCapTripulantes);

        // Campo Capacidad de Oxigeno
        lCapOxigeno = new JLabel("Altura: ");
        lCapOxigeno.setFont(new Font("Arial", Font.PLAIN, 14));
        lCapOxigeno.setSize(100, 20);
        lCapOxigeno.setLocation(310, 110);
        f.add(lCapOxigeno);
        tCapOxigeno = new JTextField();
        tCapOxigeno.setFont(new Font("Arial", Font.PLAIN, 14));
        tCapOxigeno.setSize(100, 20);
        tCapOxigeno.setLocation(420, 110);
        f.add(tCapOxigeno);

        // Campo Agencia Espacial
        lAgenciaEspacial = new JLabel("Agencia: ");
        lAgenciaEspacial.setFont(new Font("Arial", Font.PLAIN, 14));
        lAgenciaEspacial.setSize(100, 20);
        lAgenciaEspacial.setLocation(310, 140);
        f.add(lAgenciaEspacial);
        cAgenciaEspacial = new JComboBox<>(listAgencias);
        //cAgenciaEspacial.setSelectedIndex(0);
        cAgenciaEspacial.setFont(new Font("Arial", Font.PLAIN, 14));
        cAgenciaEspacial.setSize(100, 20);
        cAgenciaEspacial.setLocation(420, 140);
        f.add(cAgenciaEspacial);

        // Campo Tipo de Combustible
        lCombustible = new JLabel("Tipo Combust.: ");
        lCombustible.setFont(new Font("Arial", Font.PLAIN, 14));
        lCombustible.setSize(100, 20);
        lCombustible.setLocation(310, 170);
        f.add(lCombustible);
        cTipoCombustible = new JComboBox<>(listCombustibles);
        //cTipoCombustible.setSelectedIndex(0);
        cTipoCombustible.setFont(new Font("Arial", Font.PLAIN, 14));
        cTipoCombustible.setSize(100, 20);
        cTipoCombustible.setLocation(420, 170);
        f.add(cTipoCombustible);

        // Botón Aceptar
        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Arial", Font.PLAIN, 14));
        aceptar.setSize(100, 20);
        aceptar.setLocation(150, 200);
        f.add(aceptar);
        aceptar.addActionListener(e -> {
            tripulada = new Tripulada(tModelo.getText(), Double.parseDouble(tPeso.getText()), Double.parseDouble(tPotencia.getText()), Integer.parseInt(tMotores.getText()), Double.parseDouble(tEmpuje.getText()), Double.parseDouble(tCapCombustible.getText()), Integer.parseInt(tCapTripulantes.getText()), Double.parseDouble(tCapOxigeno.getText()), (String)cAgenciaEspacial.getSelectedItem(), (String)cTipoCombustible.getSelectedItem());
            Nave.naves.add(tripulada);
            confirmacion();
        });

        // Botón Cancelar
        cancelar = new JButton("Cancelar");
        cancelar.setFont(new Font("Arial", Font.PLAIN, 14));
        cancelar.setSize(100, 20);
        cancelar.setLocation(260, 200);
        f.add(cancelar);
        cancelar.addActionListener(e -> {
            f.dispose();
            new NuevaNave();
        });

        // Definir los atributos del Frame
        f.setSize(600, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Nueva Nave Tripulada");
    }
    public void confirmacion() {
        JOptionPane.showMessageDialog(null, "Nave registrada: "+ tripulada.getModelo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
