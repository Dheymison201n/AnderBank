package base;
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
