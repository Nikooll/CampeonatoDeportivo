
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String barrio;
    private String colorUniforme;
    private boolean genero;
    private String nombreEquipo;
    private List<Jugador> jugadores;

    public Equipo(String barrio, String colorUniforme, boolean genero, String nombreEquipo) {
        this.barrio = barrio;
        this.colorUniforme = colorUniforme;
        this.genero = genero;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
    }

    // Métodos para agregar y obtener jugadores
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    // Getters y Setters
}
