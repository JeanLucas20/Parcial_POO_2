package modelo;

public class RetirarDepositar {
    
    // Atributos
    protected double RetirarFondos;
    protected double Depositar;

    // Constructor
    public RetirarDepositar(){
        this.RetirarFondos = 0;
        this.Depositar = 0;
    }

    // Métodos
    public double mostrarResultadoP(){
        return this.RetirarFondos;
    }

    public double mostrarResultadoA(){
        return this.Depositar;
    }
}
