public class Localizacao {

    private String pais;
    private String distrito;
    private String concelho;
    private String localidade;
    private String codigoPostal;
    private String latitude;
    private String longitude;

public void setpais(String x){
    pais = x;
}
public String getpais(){
    return pais;
}
public void setdistrito(String x){
    distrito = x;
}
public String getdistrito(){
    return distrito;
}
public void setconcelho(String x){
    concelho = x;
}
public String getconcelho(){
    return concelho;
}
public void setlocalidade(String x){
    localidade = x;
}
public String getlocalidade(){
    return localidade;
}
public void setcodigoPostal(String x){
    codigoPostal = x;
}
public String getcodigoPostal(){
    return codigoPostal;
}
public void setlatitude(String x){
    latitude = x;
}
public String getlatitude(){
    return latitude;
}
public void setlongitude(String x){
    longitude = x;
}
public String getlongitude(){
    return longitude;
}
    
    public void showInfo(){
    System.out.println("Info de Onde Moras:");
    System.out.println("País: " + pais);
    System.out.println("Distrito:" + distrito);
    System.out.println("Concelho:" + concelho);
    System.out.println("Localidade:" + localidade);
    System.out.println("Codigo Postal:" + codigoPostal);
    System.out.println("Latitude:" + latitude);
    System.out.println("Longitude: " + longitude);
    }
    
    @Override
    public String toString() {
        return "Localizacao [pais=" + pais + ", distrito=" + distrito + ", concelho=" + concelho + ", localidade="
                + localidade + ", codigoPostal=" + codigoPostal + ", latitude=" + latitude + ", longitude=" + longitude
                + "]";
    }
    
}
