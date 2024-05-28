package banco;

import java.util.ArrayList;
import java.util.List;
import banco.cliente.Cliente;
import banco.cliente.conta.Conta;
import java.rmi.UnexpectedException;

public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(String nomeCliente) {
        Cliente cliente = new Cliente(nomeCliente);
        this.clientes.add(cliente);
        this.contas.add(cliente.getContaCorrente());
        this.contas.add(cliente.getContaPoupanca());
    }

    public Cliente procuraCliente(String nomeCliente) throws UnexpectedException {

        for (Cliente cliente : clientes) {
            if(cliente.getNome().equals(nomeCliente)) {
                return cliente;
            }
        }
        throw new UnexpectedException("Cliente não encontrado!");
    }
}
