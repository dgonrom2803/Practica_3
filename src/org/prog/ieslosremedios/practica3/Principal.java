package org.prog.ieslosremedios.practica3;
public class Principal {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Diego", "González", "Romero", 21);
        alumno1.llamarAlumno();
        System.out.println("Hola, mi nombre es: " + alumno1.getNombre() + " " + alumno1.getApellido1() + " " + alumno1.getApellido2() + " y tengo " + alumno1.getEdad() + " años.");
        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Calle Ana Jimenez");
        direccion1.setNumero(18);
        direccion1.setPuerta("4ºB");
        direccion1.setCodPostal(11600);
        direccion1.setPoblacion("Ubrique");
        direccion1.setProvincia("Cádiz");
        direccion1.DireccionCompleta("Calle Jazmín", "Ubrique");
        direccion1.DireccionCompleta();

        Alumno alumno2=new Alumno("Paco", "Moreno", "Angulo", 21);
        alumno1.setNotaMedia(6.45f);
        alumno2.setNotaMedia(8.15f);
        float resultado = alumno1.notaMedia(alumno1.getNotaMedia(), alumno2.getNotaMedia());
        System.out.println("La nota media mayor es de: " + resultado);



    }
}
