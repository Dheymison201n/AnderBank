/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.geralconta;

/**
 *
 * @author Alysson
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import model.tiposclientes.Cliente;

public class Conta {
    //Eu usei static no quantidadeDeContas pois quero guardar a quantidade de contas criadas e se não tivesse o static
    // toda vez que fosse criada uma nova conta, o valor iria se manter em 1.
    private static int quantidadeDeContas;
    protected int numero;
    private double saldo;
    protected double limite;
	//protected int saques;
    private String titular;
	
        
        
	protected Date hoje = new Date();
	String formato = "dd/MM/yyyy";
	SimpleDateFormat formatter = new SimpleDateFormat(formato);
	protected String data = formatter.format(hoje);
	
        //Isso foi criado com a intenção de avisar ao usuário que a conta foi criada com sucesso!
        public Conta(){
        System.out.println("Nova conta criada com sucesso!");
        Conta.quantidadeDeContas =+ 1;
        }
        
	public Conta(int numero, String titular, String data){ 
		this.numero = numero;
		this.saldo = 0;
		this.titular = titular;
                //saques = 0;
		this.data = data;
	}
	
    boolean sacar(double valor){
        
        if(valor<0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo. Por favor, digite valores que sejam positivos");
        }
        if(saldo >= valor){
           saldo -= valor;
            //saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    
    void depositar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo. Por favor, digite valores que sejam positivos");
        }
        else{
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
}
    void transfere(Conta destino, double valor) {
        if(valor<0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo. Por favor, digite valores que sejam positivos!");
        }    
        else{
        boolean retirou = this.sacar(valor);
        
        
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
}
    //Isso foi criado com a intenção de avisar ao usuário que a conta foi criada com sucesso!
    
    public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public int getQuantidadeDeContas() {
		return Conta.quantidadeDeContas;
	}
	
        public double getSaldo(){
            return saldo;
        }
        
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }
}
