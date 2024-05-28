package banco.cliente;

import banco.cliente.conta.ContaCorrente;
import banco.cliente.conta.ContaPoupanca;

public class Cliente {

    
    private String nome;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;
    
    public Cliente(String nome) {
        this.nome = nome;
        this.contaCorrente = new ContaCorrente(this);
        this.contaPoupanca = new ContaPoupanca(this);
    }
    
    public String getNome() {
        return nome;
    }
    
    public ContaCorrente getContaCorrente() {
        return this.contaCorrente;
    }
    
    public ContaPoupanca getContaPoupanca() {
        return this.contaPoupanca;
    }
    
    @Override
    public String toString() {
        return "[nome=" + nome + ", contaCorrente=" + contaCorrente.getConta() + ", contaPoupanca=" + contaPoupanca.getConta() + ", saldoTotal=" + (contaCorrente.getSaldo()+contaPoupanca.getSaldo()) + "] ";
    }
}
