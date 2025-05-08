import java.util.Scanner;

public class AppAnt {

    public static void main(String[] args) throws Exception {
        
        /*Jogador jog1 = new Jogador();
        jog1.nome = "Mateus Arante";
        jog1.escalao = "SUB17";
        Jogador jog2 = new Jogador();
        jog2.nome = "Santiago PiroLito";
        jog2.escalao = "SUB17";
        Jogador jog3 = new Jogador();
        jog3.nome = "Eduardo Machadinho";
        jog3.escalao = "SUB21";
        Jogador jog4 = new Jogador();
        jog4.nome = "Tomas Granja";
        jog4.escalao = "SUB17";*/
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("**********CALCULADORA**********");
            System.out.println("Nº1 - para somar");
            System.out.println("Nº2 - para subtrair");
            System.out.println("Nº3 - para multiplicar");
            System.out.println("Nº4 - para dividir");
            System.out.println("Escreve o que queres fazer REI");
            int aux = scanner.nextInt();
            System.out.println("Escreve o primeiro numero REI");
            int num1 = scanner.nextInt();
            System.out.println("Escreve o segundo numero REI");
            int num2 = scanner.nextInt();
            
            switch (aux) {
                case 1:
                    System.out.println("a soma = " + somar(num1, num2));
                    break;
                case 2:
                    System.out.println("a subtração = " + subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("a multiplicação = " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("a divizão = " + dividir(num1, num2));
                    break;
                default:
                System.out.println("Não escolheste NENHUM dos numeros aceites REI");
                    break;
            }
    }
}
