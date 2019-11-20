/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alysson
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Conta {
	protected int contasCriadas;
	protected int numero;
	protected double saldo;
	protected double limite;
	protected int saques;
	protected String titular;
	
	protected Date hoje = new Date();
	String formato = "dd/MM/yyyy";
	SimpleDateFormat formatter = new SimpleDateFormat(formato);
	protected String data = formatter.format(hoje);
	
	public Conta(int numero, String titular, String data){ 
		this.numero = numero;
		this.saldo = 0;
		this.titular = titular;
        saques = 0;
		this.data = data;
	}
	
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
			saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
    
    void transfere(Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
	
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
	
	public int getContasCriadas() {
		return 0;
	}
	
}