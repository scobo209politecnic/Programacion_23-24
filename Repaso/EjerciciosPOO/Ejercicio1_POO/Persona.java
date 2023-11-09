package EjerciciosPOO.Ejercicio1_POO;

public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String n_documento;
    private String f_nacimiento;

    public Persona(String nombre, String apellido1, String apellido2, String n_documento, String f_nacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.n_documento = n_documento;
        this.f_nacimiento = f_nacimiento;
    }

    public String informacionPersona() {
        imprimir("Nombre: " + nombre);
        imprimir("Apellidos: " + apellido1 + " " + apellido2);
        imprimir("Número documento: " + n_documento);
        imprimir("Fecha de nacimiento: " + f_nacimiento);

        return null;
    }


    public String imprimir(String s) {
        System.out.println(s);
        return s;
    }

}
