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
import model.funcionarios.Diretor;


/**
 *
 * @author Alysson
 */
import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		System.out.println(" *** AnderBank ***");
		Scanner in = new Scanner(System.in);
		String aux;
		int opcao;
		double valor;
		List<ContaCorrente> lc = new ArrayList<>();
		List<ContaPoupanca> lc2 = new ArrayList<>();
                List<Funcionario>   lc3 = new ArrayList<>();
                List<Diretor>       lc4 = new ArrayList<>();
                List<Gerente>       lc5 = new ArrayList<>();
                
                
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
                        System.out.println("7) Adicionar Diretor");
                        System.out.println("8) Adicionar Gerente");
                        
                        System.out.println("9) Sair");
			
			System.out.println("Opções: ");
			opcao = Integer.parseInt(in.nextLine());
			
			switch(opcao) {
				case 1:
                                    System.out.println("Digite 1 para Conta Poupança. ");
                                    System.out.println("Digite 2 para Conta Corrente. ");
                                    int num = Integer.parseInt(in.nextLine());
                                    
                                    if(num==1){
                                        System.out.println("Nome:");
                                        String titular = in.nextLine();
                                        
                                        System.out.println("Número da conta:");
                                        int numeroConta = Integer.parseInt(in.nextLine());
                                        
                                        System.out.println("Limite inicial é de 500");        
                                        
                                        System.out.println("Saldo Inicial: ");
                                        double saldoInicial = Double.parseDouble(in.nextLine());
                                        
                                        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, titular, saldoInicial);
                                        contaCorrente.gerarTaxa();
                                        
                                        lc.add(contaCorrente);
                                    }
                                    if(num==2){
                                        System.out.println("Nome:");
                                        String titular = in.next();
                                       
                                        System.out.println("Número da conta:");
                                        int numeroConta = Integer.parseInt(in.nextLine()); 
                                        
                                        System.out.println("Limite inicial é de 500");        
                                        
                                        System.out.println("Saldo Inicial: ");
                                        double saldoInicial = Double.parseDouble(in.nextLine());
                                        
                                        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta,titular, saldoInicial);
                                        contaPoupanca.gerarTaxa();
                                        
                                        lc2.add(contaPoupanca);
                                    }
					break;
					
				case 2:
					System.out.println("Digite o numero da conta para ver os DadosBancarios:");
					int numero1 = Integer.parseInt(in.nextLine());
					
                                        for(Conta conta : lc2){
                                            if(conta.getNumero()== numero1){
                                                c1 = conta;
                                            }
                                        }
                                        
                                        
                                        for(Conta conta : lc){
                                            if(conta.getNumero()== numero1){
                                                c1 = conta;
                                            }
                                        }
                                        
					c1.DadosBancarios();
					
					break;
					
				case 3:
					System.out.println("Digite o numero da conta: ");
					int numeroConta = Integer.parseInt(in.nextLine());
					c1 = lc.get(numeroConta);
					c1 = lc2.get(numeroConta);
                                        System.out.println("Digite o valor do deposito: ");
					valor = Double.parseDouble(in.nextLine());
                                        
					c1.depositar(valor);
				
					break;
				
				case 4:
					System.out.println("Digite o numero da conta: ");
					int numeroDaConta = Integer.parseInt(in.nextLine());
				
					c1 = lc.get(numeroDaConta - 1);
					
					System.out.println("Digite o valor do deposito: ");
					valor = Double.parseDouble(in.nextLine());
					
					c1.sacar(valor);
					break;
                                
                                case 5:
                                    /*System.out.println("Nome:");
                                    String nomeFuncionario = in.nextLine();
                                    System.out.println("Departamento:");
                                    String departamento = in.nextLine(); 
                                    System.out.println("Salário inicial:");        
                                    double salarioInicial = Double.parseDouble(in.nextLine());
                                    System.out.println("Saldo Inicial: ");
                                    double saldoInicial = Double.parseDouble(in.nextLine());
                                    
                                    fun
                                    c1.setNumero(numeroConta);
                                    c1.setSaldo(saldoInicial);
                                    c1.setTitular(titular);
                                    lc.add((ContaCorrente) c1);
                                    
                                    */
				default:
					if(opcao != 0)
						System.out.println("Opção invalida: ");
					break;
						
			}
			System.out.println("");
		}while(opcao != 0);
	}
}