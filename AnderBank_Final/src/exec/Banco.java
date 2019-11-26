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

import model.funcionarios.Gerente;
import model.geralconta.Conta;
import model.Autentica;
import model.tiposContas.ContaCorrente;
import model.tiposContas.ContaPoupanca;
import model.tiposclientes.Cliente;
import model.tiposfuncionarios.Funcionario;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import model.funcionarios.Diretor;


public class Banco {
	private List<Funcionario> Funcionarios = new ArrayList<Funcionario>();
	private List<Cliente> Clientes= new ArrayList<Cliente>();
        private List<Gerente> Gerentes = new ArrayList<Gerente>();
        private List<ContaPoupanca> ContaPoupanca = new ArrayList<ContaPoupanca>(); 
        private List<Diretor> diretores = new ArrayList<Diretor>();
        private List<ContaCorrente> contaCorrente = new ArrayList<ContaCorrente>();
        
        protected String cnpj;
	
	public Banco() {      
        }
	
	public Banco(List<Funcionario> funcionarios, List<Cliente> clientes
                ,List<Gerente> gerentes, String cnpj){
		super();
		Funcionarios = funcionarios;
		Clientes = clientes;
                
                Gerentes = gerentes;
                this.cnpj = cnpj;
	}
	
	public List<Funcionario> getFuncionarios() {
		return Funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		Funcionarios = funcionarios;
	}
	
        public List<Cliente> getClientes() {
		return Clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		Clientes = clientes;
	}
        
        public List<Gerente> getGerentes() {
		return Gerentes;
	}
	public void setGerentes(List<Gerente> gerentes) {
		Gerentes = gerentes;
	}
        
    public List<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<Diretor> diretores) {
        this.diretores = diretores;
    }       
        
        public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

    /**
     * @return the ContaPoupanca
     */
    public List<ContaPoupanca> getContaPoupanca() {
        return ContaPoupanca;
    }

    /**
     * @param ContaPoupanca the ContaPoupanca to set
     */
    public void setContaPoupanca(List<ContaPoupanca> ContaPoupanca) {
        this.ContaPoupanca = ContaPoupanca;
    }

    /**
     * @return the contaCorrente
     */
    public List<ContaCorrente> getContaCorrente() {
        return contaCorrente;
    }

    /**
     * @param contaCorrente the contaCorrente to set
     */
    public void setContaCorrente(List<ContaCorrente> contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
