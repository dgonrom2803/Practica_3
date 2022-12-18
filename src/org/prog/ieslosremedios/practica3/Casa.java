package org.prog.ieslosremedios.practica3;
public class Casa {

    private Integer precio;
    private Character califEnergetica;
    private String RefCatastral;
    private final Integer IVA = 21;
    private final Integer IVAreducido = 16;
    private Direccion direccion2;

    Casa(){

    }
    Integer precioIVA (Integer precio) {
        Integer total1;
        total1 = (precio * IVA/100) + precio;
        return total1;
    }

    Integer precioIVAreducido(Integer precio){
        Integer total2;
        total2 = (precio * IVAreducido/100) + precio;
        return total2;
    }

     protected void CasaCompleta (String RefCatastral, Integer precio){
        System.out.println("La referencia catastral es: " + this.RefCatastral);
        System.out.println("El precio sin IVA es: " + this.precio);
        System.out.println("El precio con IVA es: " + this.precioIVA(this.precio));
        System.out.println("El precio con IVA reducido es: " + this.precioIVAreducido(this.precio));
    }


    public Direccion getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(Direccion direccion2) {
        this.direccion2 = direccion2;
    }
}
