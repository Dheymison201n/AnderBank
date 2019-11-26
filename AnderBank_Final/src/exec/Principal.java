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
import model.funcionarios.Diretor;


/**
 *
 * @author Alysson
 */
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws Exception{
		System.out.println(" *** AnderBank ***");
		Scanner in = new Scanner(System.in);
		//String aux;
		int opcao;
		double valor;
		List<ContaCorrente> lc = new ArrayList<>();
		List<ContaPoupanca> lc2 = new ArrayList<>();
                List<Funcionario>   lc3 = new ArrayList<>();
                List<Diretor>       lc4 = new ArrayList<>();
                List<Gerente>       lc5 = new ArrayList<>();
                
                Banco AnderBank = new Banco();
                AnderBank.setCnpj("42864349129-10");
                AnderBank.setContaCorrente(lc);
                AnderBank.setContaPoupanca(lc2);
                AnderBank.setFuncionarios(lc3);
                AnderBank.setDiretores(lc4);
                AnderBank.setGerentes(lc5);
                
		Conta c1 = new Conta();
		
                Funcionario funcionarioT = new Funcionario();
                
                Diretor diretorT = new Diretor();
                Gerente gerenteT = new Gerente();
                ContaCorrente contaCorrenteT = new ContaCorrente();
                ContaPoupanca contaPoupancaT = new ContaPoupanca();
                
                
                
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
                        System.out.println("8) Imprimir todos os clientes.");
                        System.out.println("9) Imprimir todos o(s) diretor(diretores).");
                        System.out.println("10) Imprimir todos os Funcionarios.");
                        System.out.println("11) Imprimir todos os Funcionarios.");
                        
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
                                        
                                        System.out.println("Número da conta:");
                                        int numeroConta = Integer.parseInt(in.nextLine());   
                                     
                                        System.out.println("Limite inicial é de 500");
                                        System.out.println("Saldo Inicial: ");
                                        double saldoInicial = Double.parseDouble(in.nextLine());
                                        
                                        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, titular, saldoInicial);
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
                                        
                                        System.out.println("Número da conta:");
                                        int numeroConta = Integer.parseInt(in.nextLine()); 
                                        
                                        System.out.println("Limite inicial é de 500");        
                                        
                                        System.out.println("Saldo Inicial: ");
                                        double saldoInicial = Double.parseDouble(in.nextLine());
                                        
                                        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta,titular, saldoInicial);
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
                                        
                                        
                                        Diretor diretorNovo = new Diretor(diretor, departamento, salarioInicial, RG);
                                        lc4.add(diretorNovo);
                                        AnderBank.setDiretores(lc4);
                                        }
                                    catch(NumberFormatException e){System.out.println("Valores Errados. Por favor, escreva aquilo que está sendo pedido no formato correto!" + " \n Voltando para o menu...");}
                                    break;
                                    
                                    
				default:
					if(opcao != 0)
						System.out.println("Opção invalida: ");
					break;
						
			}
			System.out.println("");
		}while(opcao != 0);
	}
}