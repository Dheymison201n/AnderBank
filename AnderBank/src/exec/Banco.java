/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alysson
 */

package exec;
import model.funcionarios.Diretor;
import model.funcionarios.Gerente;
import model.funcionarios.Presidente;
import model.geralconta.Conta;
import model.Autentica;
import model.tiposContas.ContaCorrente;
import model.tiposContas.ContaPoupanca;
import model.tiposclientes.Cliente;
import model.tiposfuncionarios.Funcionario;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Banco {
	ArrayList<Funcionario> Funcionarios;
	ArrayList<Cliente> Clientes;
        ArrayList<Gerente> Gerentes;
        ArrayList<Presidente> Presidentes;
        ArrayList<Diretor> Diretores;
        
        protected String cnpj;
	
	public Banco() {
		Funcionarios = new ArrayList<Funcionario>();
                Clientes = new ArrayList<Cliente>();
                Gerentes = new ArrayList<Gerente>();
                Presidentes = new ArrayList<Presidente>();
                Diretores = new ArrayList<Diretor>();
        }
	
	public Banco(ArrayList<Funcionario> funcionarios, ArrayList<Cliente> clientes
                ,ArrayList<Gerente> gerentes, ArrayList<Presidente> presidentes, 
                ArrayList<Diretor> diretores, String cnpj){
		super();
		Funcionarios = funcionarios;
		Clientes = clientes;
                Diretores = diretores;
                Gerentes = gerentes;
                Presidentes = presidentes;
                this.cnpj = cnpj;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return Funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		Funcionarios = funcionarios;
	}
	
        public ArrayList<Cliente> getClientes() {
		return Clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		Clientes = clientes;
	}
        
        public ArrayList<Diretor> getDiretores() {
		return Diretores;
	}
	public void setDiretores(ArrayList<Diretor> diretores) {
		Diretores = diretores;
	}
        
        public ArrayList<Gerente> getGerentes() {
		return Gerentes;
	}
	public void setGerentes(ArrayList<Gerente> gerentes) {
		Gerentes = gerentes;
	}
        
        public ArrayList<Presidente> getPresidentes() {
		return Presidentes;
	}
	public void setPresidentes(ArrayList<Presidente> presidentes) {
		Presidentes = presidentes;
	}
        
        public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}