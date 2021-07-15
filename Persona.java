/**
 * Datos básicos de una persona
 */
public class Persona {

    private String nombre;
	private int edad;

    public Persona(String nombre) {
        if (nombre != null) {
			this.nombre = nombre;
		}
		this.edad = 18;
    }

    public String getNombre(){
        return "El nombre es: " + nombre;
    }
}