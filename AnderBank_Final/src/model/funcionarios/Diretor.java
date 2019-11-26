/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.funcionarios;
import model.Autentica;




/**
 *
 * @author Alysson
 */

import java.util.Date;

public class Diretor extends Gerente implements Autentica{
        protected String tipoFuncionario;

	public Diretor() {
		super();
	}

	public Diretor(String nome, String departamento, double salario, String rg, String tipoFuncionario) {
		super(nome, departamento, salario, rg);
                this.tipoFuncionario = tipoFuncionario;
        }
	
	public double getBonificacao() {
		return this.salario * 0.20;
	}

    public void DadosBancarios() {
        System.out.println("");
        System.out.println("---Dados bancários do Diretor---");
        System.out.println(" Nome " + this.nome);
        System.out.println(" Departamento: " +this.departamento);
        System.out.println(" Saldo: " + this.salario);
         System.out.println(" Tipo de Conta: " + this.tipoFuncionario);
        System.out.println(" Fim dados bancários");
        
        System.out.println("");
        
    }
}