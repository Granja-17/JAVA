import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        Scanner scanner = new Scanner(System.in);

        jogadores.add(new Jogador("Mateus Arante", 
        LocalDate.of(1900, 1, 15), 
        "SUB17", 
        "Avançado Fura Redes", 
        1.75, 
        65.0));

        jogadores.add(new Jogador("Santiago PiroLito", 
        LocalDate.of(2009, 2, 10), 
        "SUB21", 
        "Extremo Agressor da Bola", 
        1.20, 
        50.0));

        jogadores.add(new Jogador("Eduardo Machadinho", 
        LocalDate.of(2008, 3, 5), 
        "SUB17", 
        "Médio Da Porrada", 
        1.80, 
        80.0));

        int opcao;
        do {
            System.out.println("\n********** MENU PRINCIPAL **********");
            System.out.println("1 - Gerir Jogadores");
            System.out.println("2 - Gerir Equipa Técnica");
            System.out.println("0 - Sair da Aplicação");
            System.out.print("Escolhe uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerirJogadores(jogadores, scanner);
                    break;
                case 2:
                    System.out.println("Ainda não implementei a Gestão de equipa técnica REI.");
                    break;
                case 0:
                    System.out.println("Tas a sair da aplicação. Xauzão REI");
                    break;
                default:
                    System.out.println("Não escolheste NENHUM dos numeros aceites REI");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void gerirJogadores(ArrayList<Jogador> jogadores, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n--- MENU JOGADORES ---");
            System.out.println("1 - Ver Jogadores");
            System.out.println("2 - Adicionar Jogador");
            System.out.println("3 - Remover Jogador");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nLista de Jogadores:");
                    for (int i = 0; i < jogadores.size(); i++) {
                        System.out.println(i + " - " + jogadores.get(i));
                    }
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Data de Nascimento (AAAA-MM-DD): ");
                    String dataStr = scanner.nextLine();
                    LocalDate dataNascimento = LocalDate.parse(dataStr);

                    System.out.print("Escalão: ");
                    String escalao = scanner.nextLine();

                    System.out.print("Posição: ");
                    String posicao = scanner.nextLine();

                    System.out.print("Altura (em metros): ");
                    double altura = scanner.nextDouble();

                    System.out.print("Peso (em kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    Jogador novoJogador = new Jogador(nome, dataNascimento, escalao, posicao, altura, peso);
                    jogadores.add(novoJogador);
                    System.out.println("Adicionas-te mais um craque da bola!");
                    break;
                case 3:
                    System.out.println("Qual o número do jogador q queres q volte po Lobby?");
                    for (int i = 0; i < jogadores.size(); i++) {
                        System.out.println(i + " - " + jogadores.get(i).getNome());
                    }
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    if (indice >= 0 && indice < jogadores.size()) {
                        jogadores.remove(indice);
                        System.out.println("O jogador foi de Vasco com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
