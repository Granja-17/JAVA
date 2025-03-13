import java.util.Scanner;

public class Jogo4EmLinha {
    
    static final int LINHAS = 6;
    static final int COLUNAS = 9;
    static char[][] tabuleiro = new char[LINHAS][COLUNAS];
    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o tabuleiro
        inicializarTabuleiro();

        while (true) {
            mostrarTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", escolha uma coluna (0-9): ");
            int coluna = scanner.nextInt();

            // Verifica se a coluna é válida
            if (coluna < 0 || coluna >= COLUNAS) {
                System.out.println("Coluna inválida! Tente novamente.");
                continue;
            }

            // Tenta colocar a peça na coluna escolhida
            if (!fazerJogada(coluna)) {
                System.out.println("Coluna cheia! Tente outra.");
                continue;
            }

            // Verifica vitória ou empate
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

            // Troca de jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    // Inicializa o tabuleiro com espaços vazios
    public static void inicializarTabuleiro() {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Exibe o tabuleiro atual
    public static void mostrarTabuleiro() {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print("|" + tabuleiro[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-------------------");
    }

    // Tenta fazer a jogada na coluna indicada
    public static boolean fazerJogada(int coluna) {
        for (int i = LINHAS - 1; i >= 0; i--) {
            if (tabuleiro[i][coluna] == ' ') {
                tabuleiro[i][coluna] = jogadorAtual;
                return true;
            }
        }
        return false;
    }

    // Verifica se um jogador venceu
    public static boolean verificarVitoria() {
        // Verificar horizontal
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS - 3; j++) {
                if (tabuleiro[i][j] == jogadorAtual && tabuleiro[i][j] == tabuleiro[i][j + 1] && tabuleiro[i][j] == tabuleiro[i][j + 2] && tabuleiro[i][j] == tabuleiro[i][j + 3]) {
                    return true;
                }
            }
        }

        // Verificar vertical
        for (int i = 0; i < LINHAS - 3; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (tabuleiro[i][j] == jogadorAtual && tabuleiro[i][j] == tabuleiro[i + 1][j] && tabuleiro[i][j] == tabuleiro[i + 2][j] && tabuleiro[i][j] == tabuleiro[i + 3][j]) {
                    return true;
                }
            }
        }

        // Verificar diagonal principal (de cima esquerda para baixo direita)
        for (int i = 0; i < LINHAS - 3; i++) {
            for (int j = 0; j < COLUNAS - 3; j++) {
                if (tabuleiro[i][j] == jogadorAtual && tabuleiro[i][j] == tabuleiro[i + 1][j + 1] && tabuleiro[i][j] == tabuleiro[i + 2][j + 2] && tabuleiro[i][j] == tabuleiro[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        // Verificar diagonal secundária (de cima direita para baixo esquerda)
        for (int i = 0; i < LINHAS - 3; i++) {
            for (int j = 3; j < COLUNAS; j++) {
                if (tabuleiro[i][j] == jogadorAtual && tabuleiro[i][j] == tabuleiro[i + 1][j - 1] && tabuleiro[i][j] == tabuleiro[i + 2][j - 2] && tabuleiro[i][j] == tabuleiro[i + 3][j - 3]) {
                    return true;
                }
            }
        }

        return false;
    }

    // Verifica se o jogo deu empate (todas as posições estão preenchidas)
    public static boolean verificarEmpate() {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
