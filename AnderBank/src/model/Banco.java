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
import java.util.ArrayList;

public class Banco {
	ArrayList<Funcionario> Funcionarios;
	protected int cnpj;
	
	public Banco() {
		Funcionarios = new ArrayList<Funcionario>();
	}
	
	public Banco(ArrayList<Funcionario> funcionarios, int cnpj) {
		super();
		Funcionarios = funcionarios;
		this.cnpj = cnpj;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return Funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		Funcionarios = funcionarios;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

}