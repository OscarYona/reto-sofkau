package Classes;

public class Lanzadera extends Nave {
    public double CargaMaxima, Altura;

    public double getCargaMaxima() {
        return CargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        CargaMaxima = cargaMaxima;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    //Constructor
    public Lanzadera (String Modelo, Double Peso, Double Potencia, int CantMotores, Double Empuje, Double CapCombustible, Double CargaMax, Double Altura, String Agencia, String TipoCombustible) {
        super.setModelo(Modelo);
        super.setPeso(Peso);
        super.setPotencia(Potencia);
        super.setCantMotores(CantMotores);
        super.setEmpuje(Empuje);
        super.setCantCombustible(CapCombustible);
        this.setCargaMaxima(CargaMax);
        this.setAltura(Altura);
        super.setAgenciaEspacial(Agencia);
        super.setTipoCombustible(TipoCombustible);
    }


}
