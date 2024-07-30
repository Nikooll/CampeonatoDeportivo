
public class Jugador extends Persona {
    private String categoria;
    private byte[] foto;

    public Jugador(String apellido, String nombre, String cedula, boolean sexo, String categoria, byte[] foto) {
        super(apellido, nombre, cedula, sexo);
        this.categoria = categoria;
        this.foto = foto;
    }

    // Getters y Setters
}
