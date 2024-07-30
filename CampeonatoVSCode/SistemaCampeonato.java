
import java.util.ArrayList;
import java.util.List;

public class SistemaCampeonato {
    private List<Campeonato> campeonatos;

    public SistemaCampeonato() {
        this.campeonatos = new ArrayList<>();
    }

    public void agregarCampeonato(Campeonato campeonato) {
        campeonatos.add(campeonato);
    }

    public void jugarPartido(Campeonato campeonato, Equipo equipo1, Equipo equipo2, int puntaje1, int puntaje2) {
        campeonato.registrarResultado(equipo1, equipo2, puntaje1, puntaje2);
    }

    public void calcularResultados(Campeonato campeonato) {
        // Implementación de cálculo de resultados y actualización de la tabla de posiciones
    }
}
