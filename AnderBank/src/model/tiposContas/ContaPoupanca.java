/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tiposContas;

import model.geralconta.Conta;

/**
 *
 * @author Alysson
 */


public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, String titular, String data) {
		super(numero, titular, data);
	}
	
	public void gerarTaxa() {
	     double novo_saldo = getSaldo() * .006;
             setSaldo(novo_saldo);
	}
}