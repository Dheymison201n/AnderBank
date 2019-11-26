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
        
	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero,titular, saldo);
            try{
            super.setTitular(titular);
            }
            
            catch(RuntimeException e){
                System.out.println("Erro ao passar o nome do Titular.");
            }
            finally{
                super.setTitular(titular);
            }
	}

    public ContaPoupanca(){
    }
	
	public void gerarTaxa() {
	     double novo_saldo = getSaldo()+ (getSaldo()* 0.03153);
             setSaldo(novo_saldo);
	}
}