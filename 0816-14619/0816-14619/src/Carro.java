import java.time.LocalDate;
import java.util.Calendar;

public class Carro {
    public String matricula; //ex: 00-XX-02
    public LocalDate dataDaMatricula; //ex: 22/01/2022
    public String marca; //ex: Luis
    public String modelo; //ex: Santos
    public int numeroRodas; //ex: 4
    public int iuc; //imposto único de circulação ex: 10,20€
    public String tipoDeVeiculo; //ex: carro; moto; camião; bicicleta
    public String combustivel; //ex: Gasóleo, Híbrido, Elétrico
    public double kms; //ex: 95.000
    public boolean classico; //ex: Sim/Não ; True/False
    public int numeroLugares; //ex: 4; 5; 7; 2

    //Getters e Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataDaMatricula() {
        return dataDaMatricula;
    }
    public void setDataDaMatricula(LocalDate dataDaMatricula) {
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

    public boolean isClassico() {
        return classico;
    }
    public void setClassico(boolean classico) {
        this.classico = classico;
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }
     public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    @Override
    public String toString() {
        return "Carro [matricula=" + matricula + ", dataDaMatricula=" + dataDaMatricula + ", marca=" + marca
                + ", modelo=" + modelo + ", numeroRodas=" + numeroRodas + ", iuc=" + iuc + ", tipoDeVeiculo="
                + tipoDeVeiculo + ", combustivel=" + combustivel + ", kms=" + kms + ", classico=" + classico
                + ", numeroLugares=" + numeroLugares + "]";
    }

    
    public Carro() {
        this.matricula = "";
        this.dataDaMatricula = LocalDate.of(2000, 1, 1);
        this.marca = "";
        this.modelo = "";
        this.numeroRodas = 0;
        this.iuc = 0;
        this.tipoDeVeiculo = "";
        this.combustivel = "";
        this.kms = 0;
        this.classico = false;
        this.numeroLugares = 0;
    }
    public Carro(String matricula, LocalDate dataDaMatricula, String marca, String modelo, int numeroRodas, int iuc,
            String tipoDeVeiculo, String combustivel, double kms, boolean classico, int numeroLugares) {
        this.matricula = matricula;
        this.dataDaMatricula = dataDaMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroRodas = numeroRodas;
        this.iuc = iuc;
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.combustivel = combustivel;
        this.kms = kms;
        this.classico = classico;
        this.numeroLugares = numeroLugares;
    }

    public int getIdadeVeiculo(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - dataDaMatricula.getYear();
    }
    public static void main(String[] args) {
        
    }
}
