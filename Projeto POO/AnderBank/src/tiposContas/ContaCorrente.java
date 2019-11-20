package tiposContas;
import contaCenter.Contas;

public class ContaCorrente extends Contas{

	public ContaCorrente(int numero, String titular, String data) {
		super(numero, titular, data);
	}
	
	public void gerarTaxa() {
	     saldo -= 10.00;
	}
	
}
