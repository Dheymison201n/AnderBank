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

public class ContaCorrente extends Conta{
        
        
        
	public ContaCorrente(int numero, String titular, double saldo, String tipoConta){
		super(numero, titular, saldo, tipoConta);
                
        }

    public ContaCorrente() {
    }
	
	public void gerarTaxa() {
            
            
            double novo_saldo = getSaldo();
            
            
            novo_saldo -= 10.00;
            setSaldo(novo_saldo);
	}
	
}
