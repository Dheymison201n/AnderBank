
public class PrincipalTeste {
	public static void main(String[] args){
		System.out.println(" *** Conta Bancaria ***"); //  teste
		
		Conta contaSimples = new Conta();
		contaSimples.setTitular("titular");
		contaSimples.setNumero("1111");
		
		System.out.println(contaSimples);
	}
}
