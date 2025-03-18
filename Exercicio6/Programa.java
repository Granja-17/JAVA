 class Programa {
    public static void main(String[] args) {
        Moradia m1 = new Moradia();
        Moradia m2 = new Moradia();

        Localizacao locales = new Localizacao();

        Cliente cli1 = new Cliente ("Tomas", 915490687,"a14619@oficina.pt");
        System.out.println(cli1.toString());
        

        m1.tipologia = "T1";
        m1.NumsQuartos = 3;
        m1.NumsWc = 2;
        //m1.localidade = "Famalicao";
        m1.comprar = 140000;
        m1.vender = 150000;

        m1.showInfo();

        m2.tipologia = "T1";
        m2.NumsQuartos = 3;
        m2.NumsWc = 2;
        //m2.localidade = "Famalicao";
        m2.comprar = 14600;
        m2.vender = 156000;

    locales.setpais("Portugal");
    locales.setdistrito("Braga");
    locales.setconcelho("Famalicao");
    locales.setlocalidade("Antas");
    locales.setcodigoPostal("4760");
    locales.setlatitude("154");
    locales.setlongitude("98");
    
    
    System.out.println("\n\nInfo de Onde Moras:");
    System.out.println("País: " + locales.getpais());
    System.out.println("Distrito:" + locales.getdistrito());
    System.out.println("Concelho:" + locales.getconcelho());
    System.out.println("Localidade:" + locales.getlocalidade());
    System.out.println("Codigo Postal:" + locales.getcodigoPostal());
    System.out.println("Latitude:" + locales.getlatitude());
    System.out.println("Longitude: " + locales.getlongitude());
    }
    
}
