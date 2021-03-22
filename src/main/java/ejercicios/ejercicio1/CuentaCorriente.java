package ejercicios.ejercicio1;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente() { }

    public CuentaCorriente(double valor) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.saldo = cuentaCorriente.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double monto) {
        saldo += monto;
    }

    public void egreso(double monto) {
        saldo -= monto;
    }

    public void reintegro(double monto) {
        saldo += monto;
    }

    public void tranferencia(double monto) {
        saldo -= monto;
    }


}
