import java.time.LocalDate;

public class Equipa_tecnica {
    public String nome;
    public LocalDate datadenascimento;
    public String funcao;
    public static void main(String[] args) {
        
    }

    public Equipa_tecnica(String nome, LocalDate datadenascimento, String funcao) {
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.funcao = funcao;
    }

    public Equipa_tecnica() {
        this.nome = "";
        this.datadenascimento = LocalDate.of(2007, 3, 17);
        this.funcao = "";
    }    
}
