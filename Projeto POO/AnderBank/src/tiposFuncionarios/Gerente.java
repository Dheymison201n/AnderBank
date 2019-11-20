package tiposFuncionarios;
import java.util.Date;

import base.Funcionario;

public class Gerente extends Funcionario implements Autentica{

	private int senha;

	public Gerente() {
		super();
	}

	public Gerente(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
		super(nome, departamento, salario, dataAdmissao, rg);
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return this.salario * 0.15;
	}

	@Override
	public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
	
}
