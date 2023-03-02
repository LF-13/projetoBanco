public class TastaMetodos {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 10;
        System.out.println(conta1.saldo);

        conta1.deposita(10);
        System.out.println(conta1.saldo);

        conta1.saca(5);
        System.out.println(conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo = 100;

        boolean transacao = conta2.transfere(50, conta1);
        if (transacao == transacao) {
            System.out.println("FOI");
        }else {
            System.out.println("NÃO FOI");
        }
        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);


    }
}


/**
 * //Objeto
 * Conta contaDaLarissa = new Conta();
 * // Atribuição
 * contaDaLarissa.saldo = 100;
 * //Invocando nomeDaReferencia.nomeDoMetodo();
 * contaDaLarissa.deposita(50);
 * <p>
 * System.out.println(contaDaLarissa.saldo);
 * <p>
 * //Invocando Método
 * boolean conseguiuRetirar = contaDaLarissa.saca(50);
 * System.out.println(contaDaLarissa.saldo);
 * System.out.println(conseguiuRetirar);
 * <p>
 * Conta contaDoMiguel = new Conta();
 * contaDoMiguel.deposita(200);
 * boolean tranzação = contaDoMiguel.transfere(10, contaDaLarissa);
 * if (tranzação) {
 * System.out.println("realizada com sucesso");
 * } else {
 * System.out.println("não tem dinheiro");
 * }
 * System.out.println(contaDaLarissa.saldo);
 * <p>
 * contaDaLarissa.titular = "Larissa Fernandes";
 * System.out.println(contaDaLarissa.titular);
 **/