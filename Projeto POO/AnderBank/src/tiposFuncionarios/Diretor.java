package tiposFuncionarios;

import java.util.Date;

public class Diretor extends Gerente implements Autentica{

	public Diretor() {
		super();
	}

	public Diretor(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
		super(nome, departamento, salario, dataAdmissao, rg);
	}
	
	public double getBonificacao() {
		return this.salario * 0.20;
	}
}
