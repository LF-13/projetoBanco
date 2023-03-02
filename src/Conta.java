public class Conta {
    double saldo;
    int numero;
    int agencia;
    String titula;


    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta conta){
        if (this.saldo >= valor){
            this.saldo -= valor;
            conta.saldo += valor;
            return true;
        }
        return false;
    }
}

/**
 * // Atributos
 * double saldo;
 * int agencia;
 * int numero;
 * String titular;
 * <p>
 * // Métodos            //parâmetro
 * public void deposita(double valor) {
 * this.saldo += valor;
 * }
 * <p>
 * public boolean saca(double valor) {
 * if (this.saldo >= valor) {
 * this.saldo -= valor;
 * return true;
 * } else {
 * return false;
 * }
 * }
 * <p>
 * public boolean transfere(double valor, Conta destino) {
 * if (this.saldo >= valor) {
 * this.saldo -= valor;
 * destino.saca(-valor);
 * return true;
 * }
 * return false;
 * }
 **/