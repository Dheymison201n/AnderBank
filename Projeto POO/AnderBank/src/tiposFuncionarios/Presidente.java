package tiposFuncionarios;
import java.util.Date;

import base.Funcionario;

public class Presidente extends Funcionario{

	public Presidente() {
		super();
	}

	public Presidente(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
		super(nome, departamento, salario, dataAdmissao, rg);
	}
	
}
