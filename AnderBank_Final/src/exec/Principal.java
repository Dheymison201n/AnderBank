/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import java.util.Date;
import java.util.Random;
import model.funcionarios.Diretor;


/**
 *
 * @author Alysson
 */
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws Exception{
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                // +++++++++++++++++++ Dados Iniciais do Banco ++++++++++++++++++++++

                System.out.println(" *** AnderBank ***");
		Scanner in = new Scanner(System.in);
		int opcao;
		double valor;
		List<ContaCorrente> lc = new ArrayList<>();
		List<ContaPoupanca> lc2 = new ArrayList<>();
                List<Funcionario>   lc3 = new ArrayList<>();
                List<Diretor>       lc4 = new ArrayList<>();
                List<Gerente>       lc5 = new ArrayList<>();
                
                Banco AnderBank = new Banco();
                AnderBank.setCnpj("42864349129-10");
                
                //Conta Auxiliar
		Conta c1 = new Conta();
		
                Funcionario funcionarioT1 = new Funcionario("Algusto Moura da Silva", "Caixa", 4000, "75413945245");
                Funcionario funcionarosT2 = new Funcionario("Renata Moura Araújo", "Caixa", 4000, "64357128435");
                lc3.add(funcionarioT1);
                lc3.add(funcionarosT2);
                AnderBank.setFuncionarios(lc3);
                
                Diretor diretorT = new Diretor("Anderson Lemos da Silva","Diretoria", 10000, "186437835484" ,"Diretor");
                lc4.add(diretorT);
                AnderBank.setDiretores(lc4);
                
                Gerente gerenteT = new Gerente("Alysson Alexandre de Oliveira Araújo","Gerencia Administratva ", 10000,"28492531745");
                Gerente gerenteT2 = new Gerente("Dheymison Nunes Alexandre","Gerencia Administratva ", 10000,"75431984683");
                lc5.add(gerenteT);
                lc5.add(gerenteT2);
                AnderBank.setGerentes(lc5);
                
                
                ContaCorrente contaCorrenteT1 = new ContaCorrente(7249375, "Henricky De Lima Monteiro", 560, "ContaCorrente");
                contaCorrenteT1.gerarTaxa();
                ContaCorrente contaCorrenteT2 = new ContaCorrente(7894561, "Jefferson do Nascimento Sousa", 80000, "ContaCorrente");
                contaCorrenteT2.gerarTaxa();
                ContaCorrente contaCorrenteT3 = new ContaCorrente(1818431, "Anderson Lemos da Silva", 10000, "ContaCorrente");
                contaCorrenteT3.gerarTaxa();
                
                lc.add(contaCorrenteT1);
                lc.add(contaCorrenteT2);
                lc.add(contaCorrenteT3);
                AnderBank.setContaCorrente(lc);
                
                ContaPoupanca contaPoupancaT1 = new ContaPoupanca(4249375, "Henricky De Lima Monteiro", 95000, "ContaPoupanca");
                contaPoupancaT1.gerarTaxa();
                ContaPoupanca contaPoupancaT2 = new ContaPoupanca(9291361, "Jefferson do Nascimento Sousa", 80000, "ContaPoupanca");
                contaPoupancaT2.gerarTaxa();
                ContaPoupanca contaPoupancaT3 = new ContaPoupanca(7518131, "Anderson Lemos da Silva", 20000000, "ContaPoupanca");
                contaPoupancaT3.gerarTaxa();
                
                lc2.add(contaPoupancaT1);
                lc2.add(contaPoupancaT2);
                lc2.add(contaPoupancaT3);
                
                AnderBank.setContaPoupanca(lc2);                
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


		do{
			System.out.println("");
			System.out.println("---------MENU---------");
			System.out.println("1) Criar Conta;");
			System.out.println("2) Dados Bancarios;");
                        System.out.println("3) Deposito;");
			System.out.println("4) Saque;");
			System.out.println("5) Adicionar funcionario;");
                        System.out.println("6) Adicionar Diretor");
                        System.out.println("7) Adicionar Gerente");
                        System.out.println("8) Imprimir todas as Contas Poupanças.");
                        System.out.println("9) Imprimir todas as Contas Corrente.");
                        System.out.println("10) Imprimir todos o(s) diretor(diretores).");
                        System.out.println("11) Imprimir todos os Funcionarios.");
                        System.out.println("12) Imprimir todos os Gerentes.");

                        System.out.println("0) Sair");
			
			System.out.println("Opções: ");
			
                        opcao = Integer.parseInt(in.nextLine());
			
			switch(opcao) {
				case 1:
                                    try{
                                    System.out.println("Digite 1 para Conta Corrente. ");
                                    System.out.println("Digite 2 para Conta Poupança. ");
                                    int num = Integer.parseInt(in.nextLine()); ;
                                    
                                    
                                    if(num==1){
                                        System.out.println("Nome:");
                                        String titular = in.nextLine();
                                        for(int i =0;i < titular.length();i++){
                                            Character caractere = titular.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        Random random = new Random();
                                        int numeroConta = random.nextInt(((99999999-10000000)+1))+10000000;
                                        System.out.println("Número da conta: "+ numeroConta);

                                        
                                        System.out.println("Limite inicial é de 500");
                                        System.out.println("Saldo Inicial: ");
                                        double saldoInicial = Double.parseDouble(in.nextLine());
                                        String tipoConta = "Conta Corrente.";
                                        
                                        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, titular, saldoInicial, tipoConta);
                                        contaCorrente.gerarTaxa();
                                        
                                        lc.add(contaCorrente);
                                        AnderBank.setContaCorrente(lc);
                                    }
                                    if(num==2){
                                        System.out.println("Nome:");
                                        String titular = in.nextLine();
                                        for(int i =0;i < titular.length();i++){
                                            Character caractere = titular.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        Random random = new Random();
                                        int numeroConta = random.nextInt(((99999999-10000000)+1))+10000000;
                                        System.out.println("Número da conta: "+ numeroConta);
                                        
                                        System.out.println("Limite inicial é de 500");        
                                        
                                        System.out.println("Saldo Inicial: ");
                                        double saldoInicial = Double.parseDouble(in.nextLine());
                                        
                                        String tipoConta = "Conta Poupança.";
                                        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta,titular, saldoInicial, tipoConta);
                                        contaPoupanca.gerarTaxa();
                                        
                                        lc2.add(contaPoupanca);
                                        AnderBank.setContaPoupanca(lc2);
                                    }
                                    }
                                    catch(NumberFormatException e){
                                        System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");
                                    }
                                    catch(Exception e){System.out.println("Não coloque números no nome do Titular da conta!");}
                                    break;
                                    
                                    
				case 2:
                                    try{
                                    System.out.println("Digite o numero da conta para ver os DadosBancarios:");
                                    int numero1 = Integer.parseInt(in.nextLine());
                                    boolean contaExixtente = false;
                                    for(Conta conta : lc2){
                                        if(conta.getNumero()== numero1){
                                            contaExixtente = true;
                                            conta.DadosBancarios();
                                            
                                        }
                                    }


                                    for(Conta conta : lc){
                                        if(conta.getNumero()== numero1){
                                            contaExixtente = true;
                                            conta.DadosBancarios();
                                        }
                                    }
                                    if(contaExixtente==false){
                                        System.out.println("A conta buscada não se encontra no sistema.");
                                    }    
                                    
                                    }
                                    catch(NumberFormatException e){System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");}
                                    break;
					
				case 3:
                                    try{
                                    System.out.println("Digite o numero da conta: ");
                                    int numeroConta = Integer.parseInt(in.nextLine());
                                    
                                    boolean test = true;
                                    
                                    while(test){
                                    for(Conta conta: lc){
                                        if(conta.getNumero() == numeroConta){
                                            test = false;
                                            System.out.println("Digite o valor do deposito: ");
                                            valor = Double.parseDouble(in.nextLine());
                                            conta.depositar(valor);
                                            
                                        }
                                    }
                                    if(test== false) break;
                                    for(Conta conta: lc2){
                                        if(conta.getNumero() == numeroConta){
                                            test = false;
                                            System.out.println("Digite o valor do deposito: ");
                                            valor = Double.parseDouble(in.nextLine());
                                            conta.depositar(valor);
                                            
                                        }
                                    }                                   
                                    if(test== false) break;   
                                    }
                                    }
                                    catch(NumberFormatException e){System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");}
                                    break;
				
				case 4:
                                    try{
                                    System.out.println("Digite o numero da conta: ");
                                    int numeroDaConta = Integer.parseInt(in.nextLine());
                                    
                                    boolean test = true;
                                    
                                    while(test){
                                    for(Conta conta: lc){
                                        if(conta.getNumero() == numeroDaConta){
                                            test = false;
                                            System.out.println("Digite o valor do deposito: ");
                                            valor = Double.parseDouble(in.nextLine());
                                            conta.sacar(valor);
                                           
                                        }
                                    }
                                    if(test== false) break;
                                    for(Conta conta: lc2){
                                        if(conta.getNumero() == numeroDaConta){
                                            test = false;
                                            System.out.println("Digite o valor do deposito: ");
                                            valor = Double.parseDouble(in.nextLine());
                                            conta.sacar(valor);
                                        }
                                    }                                   
                                    if(test== false) break;   
                                    }
                                    }
                                    catch(NumberFormatException e){System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");}
                                    
                                    break;
                                
                                case 5:
                                    try{
                                    System.out.println("Nome do Funcionário:");
                                        String funcionario = in.nextLine();
                                        for(int i =0;i < funcionario.length();i++){
                                            Character caractere = funcionario.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        System.out.println("Dpartamento: ");
                                        String departamento = in.nextLine();
                                        for(int i =0;i < funcionario.length();i++){
                                            Character caractere = funcionario.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        System.out.println("Salário Inicial: ");
                                        double salarioInicial = Double.parseDouble(in.nextLine());
                                        
                                        System.out.println("RG do funcionario: ");
                                        String RG = in.nextLine(); 
                                        
                                        
                                        Funcionario funcionarioNovo = new Funcionario(funcionario, departamento, salarioInicial, RG);
                                        lc3.add(funcionarioNovo);
                                        AnderBank.setFuncionarios(lc3);
                                        }
                                    catch(NumberFormatException e){System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");}
                                    break;
                                case 6:
                                    try{
                                    System.out.println("Nome do Diretor:");
                                        String diretor = in.nextLine();
                                        for(int i =0;i < diretor.length();i++){
                                            Character caractere = diretor.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        System.out.println("Dpartamento: ");
                                        String departamento = in.nextLine();
                                        for(int i =0;i < departamento.length();i++){
                                            Character caractere = departamento.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        System.out.println("Salário Inicial: ");
                                        double salarioInicial = Double.parseDouble(in.nextLine());
                                        
                                        System.out.println("RG do Diretor: ");
                                        String RG = in.nextLine(); 
                                        String tipoFuncionario = "Diretor.";

                                        
                                        Diretor diretorNovo = new Diretor(diretor, departamento, salarioInicial, RG, tipoFuncionario);
                                        lc4.add(diretorNovo);
                                        AnderBank.setDiretores(lc4);
                                        }
                                    catch(NumberFormatException e){System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");}
                                    break;
                                case 7:
                                    try{
                                    System.out.println("Nome do Gerente:");
                                        String diretor = in.nextLine();
                                        for(int i =0;i < diretor.length();i++){
                                            Character caractere = diretor.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        System.out.println("Dpartamento: ");
                                        String departamento = in.nextLine();
                                        for(int i =0;i < departamento.length();i++){
                                            Character caractere = departamento.charAt(i);
                                            if(Character.isDigit(caractere)){
                                                throw new Exception();
                                            }
                                        }
                                        
                                        System.out.println("Salário Inicial: ");
                                        double salarioInicial = Double.parseDouble(in.nextLine());
                                        
                                        System.out.println("RG do Gerente: ");
                                        String RG = in.nextLine(); 
                                        
                                        
                                        Diretor diretorNovo = new Diretor(diretor, departamento, salarioInicial, RG, "Diretor");
                                        lc4.add(diretorNovo);
                                        AnderBank.setDiretores(lc4);
                                        }
                                    catch(NumberFormatException e){System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");}
                                    break;
                                case 8:
                                    for(ContaPoupanca contasP : AnderBank.getContaPoupanca()){
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                        contasP.DadosBancarios();
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    }
                                    break;
                                case 9:
                                    for(ContaCorrente contasC : AnderBank.getContaCorrente()){
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                        contasC.DadosBancarios();
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    }
                                    break;
                                case 10:
                                    for(Diretor diretors : AnderBank.getDiretores()){
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                        diretors.DadosBancarios();
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    }
                                        break;
                                
                                case 11:
                                   for(Funcionario funcionarios : AnderBank.getFuncionarios()){
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                        funcionarios.DadosBancarios();
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    }
                                break;
                                case 12:
                                    for(Gerente gerentes : AnderBank.getGerentes()){
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                        gerentes.DadosBancarios();
                                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    }
                                    break;
                                default:
					if(opcao == 0)
						System.out.println("Obrigado por usar o Sistema AnderBank");
					break;
						
			}
			System.out.println("");
		}while(opcao != 0);
	}
}