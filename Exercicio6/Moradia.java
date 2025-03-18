// Create a Main Class
public class Moradia {

    /* atributos */
    public String tipologia;
    public int NumsQuartos;
    public int NumsWc;
    public Localizacao localidade;
    public int comprar;
    public int vender;

public void showInfo(){
    System.out.println("Info da Moradia:");
    System.out.println("Tipologia: " + tipologia);
    System.out.println("Num de quartos :" + NumsQuartos);
    System.out.println("Num de WCs:" + NumsWc);
    //System.out.println("Localidade:" + localidade);
    System.out.println("Preço Compra:" +comprar);
    System.out.println("Preço Venda:" + vender);
    }

public Moradia(String tipologia, int numsQuartos, int numsWc, Localizacao localizacao, int comprar, int vender) {
    this.tipologia = tipologia;
    NumsQuartos = numsQuartos;
    NumsWc = numsWc;
    this.localidade = localizacao;
    this.comprar = comprar;
    this.vender = vender;
}

public Moradia() {

}
@Override
public String toString() {
    return "Moradia [tipologia=" + tipologia + ", NumsQuartos=" + NumsQuartos + ", NumsWc=" + NumsWc + ", localizacao="
            + localidade + ", comprar=" + comprar + ", vender=" + vender + "]";
}

}
