package EjerciciosPOO.EjerciciosPropuestos;

public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String n_documento;
    private String f_nacimiento;
    private String pais_nacimiento;
    private char genero; // H o M

    public Persona(String nombre, String apellido1, String apellido2, String n_documento, String f_nacimiento,
                   String pais_nacimiento, char genero) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.n_documento = n_documento;
        this.f_nacimiento = f_nacimiento;

        this.pais_nacimiento = pais_nacimiento;
        this.genero = genero;
    }

    public String informacionPersona() {
        imprimir("Nombre: " + nombre);
        imprimir("Apellidos: " + apellido1 + " " + apellido2);
        imprimir("Número documento: " + n_documento);
        imprimir("Fecha de nacimiento: " + f_nacimiento);

        imprimir("País de nacimiento: " + pais_nacimiento);
        imprimir("Género: " + genero);

        return null;
    }


    public String imprimir(String s) {
        System.out.println(s);
        return s;
    }

}
