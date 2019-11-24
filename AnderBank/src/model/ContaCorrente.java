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


public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int numero, String titular, String data) {
		super(numero, titular, data);
	}
	
	public void gerarTaxa() {
		saldo -= 10.00;
	}
	
	public double getValorImposto(){
		return this.getSaldo() * 0.01;
	}
}
