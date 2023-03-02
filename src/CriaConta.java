public class CriaConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.saldo = 40;
        conta1.saldo += 5;
        System.out.println(conta1.saldo);


        Conta conta2 = new Conta();
        conta2.saldo = 70;
        System.out.println(conta2.saldo);

        if (conta1 == conta2) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("São contas diferentes");
        }
    }
}


/**
 * Conta primeiraConta = new Conta();
 * primeiraConta.saldo = 200;
 * System.out.println(primeiraConta.saldo);
 * <p>
 * primeiraConta.saldo += 100;
 * System.out.println(primeiraConta.saldo);
 * <p>
 * Conta segundaConta = new Conta();
 * segundaConta.saldo = 20;
 * System.out.println(segundaConta.saldo);
 * <p>
 * System.out.println("Primeiro saldo da primeiraConta é: " + primeiraConta.saldo);
 * System.out.println("Segundo saldo da segundaConta é: " + segundaConta.saldo);
 * <p>
 * if (primeiraConta == segundaConta) {
 * System.out.println("São a mesma conta");
 * } else {
 * System.out.println("São contas diferentes," +
 * " pois cada uma tem seu objeto. ex: Conta primeiraConta = new Conta(); e Conta segundaConta = new Conta();");
 * }
 **/