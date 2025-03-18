public class Cliente {
    private String nome;
    private int telefone;
    private String email;

    public Cliente(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente() {
        this.nome = "";
        this.telefone = 0;
        this.email = "";
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int gettelefone() {
        return telefone;
    }

    public void settelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }
}
