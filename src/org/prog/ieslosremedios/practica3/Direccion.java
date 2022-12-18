package org.prog.ieslosremedios.practica3;

public class Direccion {
    private String calle;
    private Integer numero;
    private String puerta;
    private Integer CodPostal;
    private String Poblacion;
    private String Provincia;

    Direccion(){
    }
    Direccion(String calle, Integer numero, String puerta, Integer CodPostal, String Poblacion, String Provincia) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.CodPostal = CodPostal;
        this.Poblacion = Poblacion;
        this.Provincia = Provincia;
    }

    Direccion(String calle, Integer numero, String puerta, String Poblacion) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.Poblacion = Poblacion;
    }

    Direccion(String calle, Integer numero, Integer CodPostal, String Poblacion, String Provincia) {
        this.calle = calle;
        this.numero = numero;
        this.CodPostal = CodPostal;
        this.Poblacion = Poblacion;
        this.Provincia = Provincia;
    }

    public void DireccionCompleta(){
        System.out.println("El domicilio es: " + getCalle() + ",  " + getNumero() + ", " + getPuerta() + ", " + getCodPostal() + ", " + getPoblacion() + " (" + getProvincia() + ")");
    }
    public void DireccionCompleta(String calle, String poblacion){
        System.out.println("El domicilio corto es: " + getCalle() + ", " + getPoblacion());
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Integer getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(Integer codPostal) {
        CodPostal = codPostal;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }
}
