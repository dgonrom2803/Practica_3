package org.prog.ieslosremedios.practica3;

public class Alumno {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private String repetidor;
    private float notaMedia;
    private String email;
    private Direccion direccion1;

    protected Alumno (String nombre, String apellido1, String apellido2, Integer edad){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;

    }
    public void llamarAlumno(){
      System.out.println(getNombre() + " " + getApellido1() + " " + getApellido2() + " " + getEdad());
    }
    static float notaMedia(float a,float b){
        float numeroMayor;
        numeroMayor=Math.max(a,b);
        return numeroMayor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRepetidor() {
        return repetidor;
    }

    public void setRepetidor(String repetidor) {
        this.repetidor = repetidor;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(Direccion direccion1) {
        this.direccion1 = direccion1;
    }
}
