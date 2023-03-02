public class TesteDeReferencias {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.saldo = 50;

        Conta conta2 = conta1;
        conta2.saldo = 100;

        System.out.println(conta1.saldo);

        if (conta1 == conta2) {
            System.out.println("Sim");
        } else {
            System.out.println("não");
        }

    }
}


/**
 * Conta primeiraConta = new Conta();
 * primeiraConta.saldo = 300;
 * System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
 * <p>
 * Conta segundaConta = primeiraConta;
 * System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
 * <p>
 * segundaConta.saldo += 100;
 * System.out.println("Saldo da segunda conta com alteração: " + segundaConta.saldo);
 * <p>
 * System.out.println("Saldo da primeira conta com alteração: " + primeiraConta.saldo);
 * <p>
 * if (primeiraConta == segundaConta) {
 * System.out.println("Elas estão em uma única conta e na mesma referência ex: Conta primeiraConta = new Conta();" +
 * ", por  tanto a primeiraConta quanto segundaConta, se alterar em uma, também altera na outra.");
 * }
 **/