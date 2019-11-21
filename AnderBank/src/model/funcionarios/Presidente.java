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
import model.tiposfuncionarios.Funcionario;


public class Presidente extends Funcionario{
	public Presidente() {
		super();
	}

	public Presidente(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
		super(nome, departamento, salario, dataAdmissao, rg);
	}
	
}