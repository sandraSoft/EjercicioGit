/**
 * Datos básicos de una persona
 */
public class Persona {

    private String nombre;

    public Persona(String nombre) {
        if (nombre != null) {
			this.nombre = nombre;
		}
		
    }

    public String getNombre(){
        return "El nombre es: " + nombre;
    }
}