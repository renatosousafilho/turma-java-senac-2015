/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oitavaaula;

/**
 *
 * @author renato
 */
public class Conta {
    int numero;
    String titular;
    double saldo;
    
    public Conta(){
        this.numero = 1;
        this.saldo = 0.0;
    }
    
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
    public void depositar(double deposito){
        this.saldo += deposito;
    } // fim do metodo depositar
    
    public boolean sacar(double saque){
        if (this.saldo>=saque){
           this.saldo -= saque;
           return true;
        }
        return false;
    }
    
    public boolean emprestar(Conta contaDestino, double valor){
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
} // fim da classe Conta
