/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.funcionarios;

/**
 *
 * @author Alysson
 */

import java.util.Date;
import model.Autentica;
import model.tiposfuncionarios.Funcionario;
public class Diretor extends Funcionario implements Autentica{

	public Diretor() {
		super();
	}

	public Diretor(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
		super(nome, departamento, salario, dataAdmissao, rg);
	}
	
	public double getBonificacao() {
		return this.salario * 0.20;
	}

    @Override
    public boolean autentica(int senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}