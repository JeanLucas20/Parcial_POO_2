package modelo;

public class CuentaCorriente extends RetirarDepositar {


    private double saldo;
    private double retirar;

    // Constructor

    public CuentaCorriente (double sal, double ret, double Depositar){
        this.saldo = sal;
        this.retirar = ret;
    }

    // Métodos
    public double RetirarFondosCorriente(){
        RetirarFondos = (saldo - retirar)*0.2;
        RetirarFondos = saldo - RetirarFondos;
        return RetirarFondos;
    }

    public double DepositarCorriente(){
        Depositar = saldo + Depositar;
        return Depositar;
    }

}
