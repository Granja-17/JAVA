import java.util.Scanner;

public class JogoDoGalo {

    static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", escolha uma posição (linha e coluna): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;

            if (verificarVitoria()) {
                mostrarTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                break;
            }

            if (verificarEmpate()) {
                mostrarTabuleiro();
                System.out.println("Empate!");
                break;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    public static void mostrarTabuleiro() {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    public static boolean verificarVitoria() {
        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }

        // Verificar diagonais
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }

        return false;
    }

    public static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}