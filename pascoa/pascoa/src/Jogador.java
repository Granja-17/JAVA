import java.time.LocalDate;

public class Jogador {
    private String nome;
    private LocalDate datadenascimento;
    private String escalao;
    private String posicao;
    private double altura;
    private double peso;
    
    
    public Jogador(String nome, LocalDate datadenascimento, String escalao, String posicao, double altura,
            double peso) {
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.escalao = escalao;
        this.posicao = posicao;
        this.altura = altura;
        this.peso = peso;
    }

    public Jogador() {
        this.nome = "";
        this.datadenascimento = LocalDate.of(2007, 3, 17);
        this.escalao = "";
        this.posicao = "";
        this.altura = 0;
        this.peso = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(LocalDate datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getEscalao() {
        return escalao;
    }

    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", datadenascimento=" + datadenascimento + ", escalao=" + escalao
                + ", posicao=" + posicao + ", altura=" + altura + ", peso=" + peso + "]";
    }

    
}
