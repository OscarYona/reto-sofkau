package Classes;

public class NoTripulada extends Nave {

    public int CeldasFotovoltaicas, BolsasAire;
    public String Finalidad;

    public int getCeldasFotovoltaicas() {
        return CeldasFotovoltaicas;
    }

    public void setCeldasFotovoltaicas(int celdasFotovoltaicas) {
        CeldasFotovoltaicas = celdasFotovoltaicas;
    }

    public int getBolsasAire() {
        return BolsasAire;
    }

    public void setBolsasAire(int bolsasAire) {
        BolsasAire = bolsasAire;
    }

    public String getFinalidad() {
        return Finalidad;
    }

    public void setFinalidad(String finalidad) {
        Finalidad = finalidad;
    }

    //Constructor
    public NoTripulada (String Modelo, Double Peso, Double Potencia, int CantMotores, Double Empuje, Double CapCombustible, int CeldasFotovoltaicas, String Finalidad, String Agencia, String TipoCombustible) {
        super.setModelo(Modelo);
        super.setPeso(Peso);
        super.setPotencia(Potencia);
        super.setCantMotores(CantMotores);
        super.setEmpuje(Empuje);
        super.setCantCombustible(CapCombustible);
        //this.setBolsasAire(BolsasAire);
        this.setCeldasFotovoltaicas(CeldasFotovoltaicas);
        this.setFinalidad(Finalidad);
        super.setAgenciaEspacial(Agencia);
        super.setTipoCombustible(TipoCombustible);
    }
}
