package tiposContas;
import contaCenter.Contas;

public class ContaPoupanca extends Contas{

	public ContaPoupanca(int numero, String titular, String data) {
		super(numero, titular, data);
	}
	
	public void gerarTaxa() {
	     saldo += saldo * .006;
	}
}
