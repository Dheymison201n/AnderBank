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
 * 
 */


public class ContaPoupanca extends Conta{
        
	
        public ContaPoupanca(int numero, String titular, double saldo,String tipoConta) {
		super(numero,titular, saldo, tipoConta);        
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
            int cem = 100;
            double novo_saldo = (double)((int)( (getSaldo() + (getSaldo()* 0.03153)) * cem) )/cem;
             
            setSaldo(novo_saldo);
	}
}