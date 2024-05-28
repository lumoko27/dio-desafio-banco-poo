import banco.Banco;
import banco.cliente.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Instancia um novo objeto banco
        Banco banco = new Banco("Teste");

        //Cria novos clientes
        banco.adicionarCliente("Arthur");
        banco.adicionarCliente("Sophia");

        Cliente cliente1 = banco.procuraCliente("Arthur");
        Cliente cliente2 = banco.procuraCliente("Sophia");


        //Realiza Operações entre contas
        cliente1.getContaCorrente().depositar(500);
        cliente2.getContaCorrente().sacar(800);
        cliente1.getContaCorrente().transferir(100, cliente2.getContaCorrente());

        cliente2.getContaCorrente().imprimirExtrato();
        cliente2.getContaPoupanca().imprimirExtrato();
        

        System.out.println(banco.getClientes());
        System.out.println(banco.getContas());


    }
}
