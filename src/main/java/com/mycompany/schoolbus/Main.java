package com.mycompany.schoolbus;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Aplicacao (main)

Crie uma classe principal chamada Aplicacao que conterá o menu interativo que permita ao usuário realizar as seguintes ações:

Criar aluno, motorista, contrato, escola, veículo e ponto de parada

Criar uma nova rota, adicionando pontos de parada a ela.

Calcular a demanda de uma rota específica.

Exibir o número total de rotas criadas.

Exibir o número total de pontos de parada criados.

Sair do programa.

Utilize a biblioteca Scanner do Java para coletar informações do usuário e exibir resultados no console. Garanta que o programa seja capaz de lidar com entradas incorretas ou inválidas do usuário e forneça feedback apropriado.
 */
public class Main {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            ArrayList<Aluno> alunos = new ArrayList<>();
            ArrayList<Motorista> motoristas = new ArrayList<>();
            ArrayList<Contrato> contratos = new ArrayList<>();
            ArrayList<Escola> escolas = new ArrayList<>();
            ArrayList<Veiculo> veiculos = new ArrayList<>();
            ArrayList<PontoDeParada> pontosDeParada = new ArrayList<>();
            ArrayList<Rota> rotas = new ArrayList<>();
    
            while (true) {
                System.out.println("Menu de Opções:");
                System.out.println("1. Criar Aluno");
                System.out.println("2. Criar Motorista");
                System.out.println("3. Criar Contrato");
                System.out.println("4. Criar Escola");
                System.out.println("5. Criar Veículo");
                System.out.println("6. Criar Ponto de Parada");
                System.out.println("7. Criar Nova Rota");
                System.out.println("8. Calcular Demanda da Rota");
                System.out.println("9. Exibir Número Total de Rotas Criadas");
                System.out.println("10. Exibir Número Total de Pontos de Parada Criados");
                System.out.println("11. Sair do Programa");
                System.out.print("Escolha uma opção: ");
    
                int opcao = scanner.nextInt();
                scanner.nextLine();
    
                switch (opcao) {
                    case 1:
                    System.out.println("Criar Aluno:");
                    System.out.print("Nome/Razão Social: ");
                    String aluno_nomeRazaoSocial = scanner.nextLine();
                    System.out.print("Nome Social: ");
                    String aluno_nomeSocial = scanner.nextLine();
                    System.out.print("Naturalidade/Origem: ");
                    String aluno_naturalidadeOrigem = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String aluno_telefone = scanner.nextLine();
                    System.out.print("CPF: ");
                    String aluno_cpf = scanner.nextLine();
                    System.out.print("Nome do Pai: ");
                    String aluno_nomePai = scanner.nextLine();
                    System.out.print("Nome da Mãe: ");
                    String aluno_nomeMae = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String aluno_matricula = scanner.nextLine();
                    System.out.print("Série: ");
                    String aluno_serie = scanner.nextLine();
                    System.out.print("Data Inicial (DD/MM/AAAA): ");
                    String aluno_dataInicialStr = scanner.nextLine();
                    Endereco aluno_endereco = new Endereco();
                    SimpleDateFormat aluno_dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date aluno_dataInicial = null;

                    try {
                        
                        aluno_dataInicial = aluno_dateFormat.parse(aluno_dataInicialStr);
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválido. Use o formato DD/MM/AAAA.");
                        continue;
                    }     
                    Aluno novoAluno = new Aluno(aluno_nomeRazaoSocial, aluno_nomeSocial, aluno_naturalidadeOrigem, aluno_telefone, aluno_endereco, aluno_cpf, aluno_nomePai, aluno_nomeMae, aluno_matricula, aluno_serie, aluno_dataInicial);

                    alunos.add(novoAluno);

                    System.out.println("Aluno criado com sucesso!");
                        break;
                    case 2:
                        // Lógica para criar um motorista
                        System.out.println("Criar Motorista:");
                    System.out.print("Nome/Razão Social: ");
                    String motorista_nomeRazaoSocial = scanner.nextLine();
                    System.out.print("Nome Social: ");
                    String motorista_nomeSocial = scanner.nextLine();
                    System.out.print("Naturalidade/Origem: ");
                    String motorista_naturalidadeOrigem = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String motorista_telefone = scanner.nextLine();
                    System.out.print("CPF: ");
                    String motorista_cpf = scanner.nextLine();
                    System.out.print("Nome do Pai: ");
                    String motorista_nomePai = scanner.nextLine();
                    System.out.print("Nome da Mãe: ");
                    String motorista_nomeMae = scanner.nextLine();
                    System.out.print("Número da CNH: ");
                    String motorista_num_cnh = scanner.nextLine();
                    System.out.print("Categoria da CNH: ");
                    String motorista_categoria_cnh = scanner.nextLine();
                    System.out.print("Data Inicial (DD/MM/AAAA): ");
                    String motorista_dataInicialStr = scanner.nextLine();
                    Endereco motorista_endereco = new Endereco();
                    System.out.print("O motorista é terceirizado?(s/n)");
                    Boolean 


                    // Você deve implementar a lógica para criar um objeto Endereco.

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date motorista_dataInicial = null;

                    try {
                        // Tente fazer a conversão da String para Date.
                        motorista_dataInicial = dateFormat.parse(motorista_dataInicialStr);
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválido. Use o formato DD/MM/AAAA.");
                        continue; // Volte ao menu principal
                    }

                    // ... (código para criar o objeto Contrato)

                    // Crie um novo objeto Motorista com base no construtor fornecido.
                    Motorista novoMotorista = new Motorista(motorista_nomeRazaoSocial, motorista_nomeSocial, motorista_naturalidadeOrigem, motorista_telefone, motorista_endereco, motorista_cpf, motorista_nomePai, motorista_nomeMae, motorista_terceirizado, motorista_num_cnh, motorista_categoria_cnh, motorista_dataInicial);

                    // Adicione o novo motorista à lista de motoristas.
                    motoristas.add(novoMotorista);

                    System.out.println("Motorista criado com sucesso!");
                    break;
                        break;
                    case 3:
                        // Lógica para criar um contrato
                        break;
                    case 4:
                        // Lógica para criar uma escola
                        break;
                    case 5:
                        // Lógica para criar um veículo
                        break;
                    case 6:
                        // Lógica para criar um ponto de parada
                        break;
                    case 7:
                        // Lógica para criar uma nova rota
                        break;
                    case 8:
                        // Lógica para calcular a demanda de uma rota específica
                        break;
                    case 9:
                        System.out.println("Número total de rotas criadas: " + rotas.size());
                        break;
                    case 10:
                        System.out.println("Número total de pontos de parada criados: " + pontosDeParada.size());
                        break;
                    case 11:
                        System.out.println("Saindo do programa.");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        break;
                }
            }
        }
        

}
    

