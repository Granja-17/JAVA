import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("17-TG-09",LocalDate.of(2000,1,1), "Nissaniiiiiii", "GTRIII", 4, 13, "carro", "Gasolina", 93.000, false, 2);
        Carro carro2 = new Carro("18-TG-10",LocalDate.of(2000,1,1), "BMW", "M3", 9, 10, "carrito", "Elétrico", 10.000, true, 9);
        Carro carro3 = new Carro("19-TG-11",LocalDate.of(2000,1,1), "TOYOTA", "Yaris", 1, 3, "carroça", "Gasoleo", 9.500, false, 5);
        Carro carro4 = new Carro("20-TG-12",LocalDate.of(2000,1,1) , "Ferrariiiiiii", "TestaRosa", 15, 1, "carrão", "Gasolina", 1.220, true, 1);
        Mota mota1 = new Mota("21-TG-13", "29/12/1989", "BMW", "Tomás", 2, 12, "Motxona", "Gasolina", 50.000, true, 2);
        Mota mota2 = new Mota("22-TG-14", "28/12/1997", "BMW", "Granja", 3, 1, "Motinha", "Gasolina", 20.000, false, 5);
    }
}
