package Classes;

public class Tripulada extends Nave {

    public int CapacidadTripulantes;
    public double CapacidadOxigeno;

    public int getCapacidadTripulantes() {
        return CapacidadTripulantes;
    }

    public void setCapacidadTripulantes(int capacidadTripulantes) {
        CapacidadTripulantes = capacidadTripulantes;
    }

    public double getCapacidadOxigeno() {
        return CapacidadOxigeno;
    }

    public void setCapacidadOxigeno(double capacidadOxigeno) {
        CapacidadOxigeno = capacidadOxigeno;
    }


    // Constructor
    public Tripulada (String Modelo, Double Peso, Double Potencia, int CantMotores, Double Empuje, Double CapCombustible, int CapacidadTripulantes, Double CapacidadOxigeno, String Agencia, String TipoCombustible) {
        super.setModelo(Modelo);
        super.setPeso(Peso);
        super.setPotencia(Potencia);
        super.setCantMotores(CantMotores);
        super.setEmpuje(Empuje);
        super.setCantCombustible(CapCombustible);
        this.setCapacidadTripulantes(CapacidadTripulantes);
        this.setCapacidadOxigeno(CapacidadOxigeno);
        super.setAgenciaEspacial(Agencia);
        super.setTipoCombustible(TipoCombustible);
    }
}
