/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tiposclientes;

/**
 *
 * @author Alysson
 */

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
        
	public Cliente() {
		
	}
	
	public Cliente(String nome, String sobrenome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
                this.idade = idade;
        }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}
	
        public int getIdade(){
            return idade;
        }
        
        public void setIdade(int idade){
            this.idade = idade;
        }
}