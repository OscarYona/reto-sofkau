package Classes;

import java.util.ArrayList;
import java.util.List;

public class Nave {
    private String Modelo, AgenciaEspacial, TipoCombustible;
    private int IdNave, CantMotores;
    private double Peso, Potencia, Empuje, CantCombustible;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getAgenciaEspacial() {
        return AgenciaEspacial;
    }

    public void setAgenciaEspacial(String agenciaEspacial) {
        AgenciaEspacial = agenciaEspacial;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }

    public int getIdNave() {
        return IdNave;
    }

    public void setIdNave(int idNave) {
        IdNave = idNave;
    }

    public int getCantMotores() {
        return CantMotores;
    }

    public void setCantMotores(int cantMotores) {
        CantMotores = cantMotores;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }

    public double getEmpuje() {
        return Empuje;
    }

    public void setEmpuje(double empuje) {
        Empuje = empuje;
    }

    public double getCantCombustible() {
        return CantCombustible;
    }

    public void setCantCombustible(double cantCombustible) {
        CantCombustible = cantCombustible;
    }

    public static List<Nave> naves = new ArrayList<>();

    public static List<Nave> filtrarNaves(String filtro) {
        List<Nave> navesFiltradas = new ArrayList<>();
        for(Nave nave : naves) {
            if(nave.getModelo().contains(filtro)) {
                navesFiltradas.add(nave);
            }
        }
        return navesFiltradas;
    }

}
