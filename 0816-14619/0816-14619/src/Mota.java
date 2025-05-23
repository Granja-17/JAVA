import java.util.Calendar;

public class Mota {
    public String matricula; //ex: 00-XX-02
    public String dataDaMatricula; //ex: 22/01/2022
    public String marca; //ex: Luis
    public String modelo; //ex: Santos
    public int numeroRodas ; //ex: 4
    public int iuc; //imposto único de circulação ex: 10,20€
    public String tipoDeVeiculo; //ex: carro; moto; camião; bicicleta
    public String combustivel; //ex: Gasóleo, Híbrido, Elétrico
    public double kms; //ex: 95.000
    public boolean pagaIUC; //ex: Sim/Não ; True/False
    public int suporteMalas; //ex: Suportes malas laterais e Top case

    //Getters e Setters
public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataDaMatricula() {
        return dataDaMatricula;
    }
    public void setDataDaMatricula(String dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }
    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public int getIuc() {
        return iuc;
    }
    public void setIuc(int iuc) {
        this.iuc = iuc;
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }
    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getKms() {
        return kms;
    }
    public void setKms(double kms) {
        this.kms = kms;
    }

    public boolean isPagaIUC() {
        return pagaIUC;
    }
    public void setPagaIUC(boolean pagaIUC) {
        this.pagaIUC = pagaIUC;
    }

    public int getSuporteMalas() {
        return suporteMalas;
    }
    public void setSuporteMalas(int suporteMalas) {
        this.suporteMalas = suporteMalas;
    }

    //toString
@Override
    public String toString() {
        return "Mota [matricula=" + matricula + ", dataDaMatricula=" + dataDaMatricula + ", marca=" + marca
                + ", modelo=" + modelo + ", numeroRodas=" + numeroRodas + ", iuc=" + iuc + ", tipoDeVeiculo="
                + tipoDeVeiculo + ", combustivel=" + combustivel + ", kms=" + kms + ", pagaIUC=" + pagaIUC
                + ", suporteMalas=" + suporteMalas + "]";
    }

public Mota() {
    this.matricula = "";
    this.dataDaMatricula = "";
    this.marca = "";
    this.modelo = "";
    this.numeroRodas = 0;
    this.iuc = 0;
    this.tipoDeVeiculo = "";
    this.combustivel = "";
    this.kms = 0;
    this.pagaIUC = false;
    this.suporteMalas = 0;
}


public Mota(String matricula, String dataDaMatricula, String marca, String modelo, int numeroRodas, int iuc,
        String tipoDeVeiculo, String combustivel, double kms, boolean pagaIUC, int suporteMalas) {
    this.matricula = matricula;
    this.dataDaMatricula = dataDaMatricula;
    this.marca = marca;
    this.modelo = modelo;
    this.numeroRodas = numeroRodas;
    this.iuc = iuc;
    this.tipoDeVeiculo = tipoDeVeiculo;
    this.combustivel = combustivel;
    this.kms = kms;
    this.pagaIUC = pagaIUC;
    this.suporteMalas = suporteMalas;
}

/*public int getIdadeVeiculo(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - dataDaMatricula.getYear;
    }*/
public static void main(String[] args) {
        
    }

}

