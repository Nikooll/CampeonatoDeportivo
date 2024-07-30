
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campeonato {
    private int duracionCompromiso;
    private Date fechaFin;
    private Date fechaInicio;
    private String genero;
    private int numeroClasificadosPorGrupo;
    private int numeroEquiposPorGrupo;
    private int numeroGrupos;
    private int numeroVueltas;
    private List<Equipo> equipos;
    private List<Resultado> resultados;

    public Campeonato(int duracionCompromiso, Date fechaInicio, Date fechaFin, String genero,
                      int numeroClasificadosPorGrupo, int numeroEquiposPorGrupo, int numeroGrupos, int numeroVueltas) {
        this.duracionCompromiso = duracionCompromiso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.genero = genero;
        this.numeroClasificadosPorGrupo = numeroClasificadosPorGrupo;
        this.numeroEquiposPorGrupo = numeroEquiposPorGrupo;
        this.numeroGrupos = numeroGrupos;
        this.numeroVueltas = numeroVueltas;
        this.equipos = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void registrarResultado(Equipo equipo1, Equipo equipo2, int puntaje1, int puntaje2) {
        resultados.add(new Resultado(equipo1, equipo2, puntaje1, puntaje2));
    }

    public List<Equipo> obtenerTablaPosiciones() {
        // Método para calcular la tabla de posiciones
        // Basado en los resultados registrados
        // Retorna la lista de equipos ordenada por puntos
        return new ArrayList<>(); // Implementar lógica
    }

    // Getters y Setters
}
