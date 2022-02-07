public class Hotel {
    int numeroQuartos;
    double valorDiaria;

    public Hotel() {
    }

    public Hotel(int numeroQuartos, double valorDiaria) {
        this.numeroQuartos = numeroQuartos;
        this.valorDiaria = valorDiaria;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
  
    public double calculaDiarias(int numeroDiarias){
        return numeroDiarias * valorDiaria;
    }    
}
