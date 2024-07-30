
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaCampeonato sistema = new SistemaCampeonato();

        // Crear equipos y jugadores
        Equipo equipo1 = new Equipo("Barrio 1", "Rojo", true, "Equipo 1");
        equipo1.agregarJugador(new Jugador("Perez", "Juan", "1234567890", true, "Senior", new byte[]{}));

        Equipo equipo2 = new Equipo("Barrio 2", "Azul", true, "Equipo 2");
        equipo2.agregarJugador(new Jugador("Gomez", "Pedro", "0987654321", true, "Senior", new byte[]{}));

        // Crear campeonatos
        Campeonato campeonato1 = new Campeonato(90, new Date(), new Date(), "Masculino", 2, 4, 1, 1);
        Campeonato campeonato2 = new Campeonato(90, new Date(), new Date(), "Masculino", 2, 4, 1, 1);

        // Registrar equipos en los campeonatos
        campeonato1.registrarEquipo(equipo1);
        campeonato1.registrarEquipo(equipo2);

        campeonato2.registrarEquipo(equipo1);
        campeonato2.registrarEquipo(equipo2);

        // Agregar campeonatos al sistema
        sistema.agregarCampeonato(campeonato1);
        sistema.agregarCampeonato(campeonato2);

        // Jugar partidos
        sistema.jugarPartido(campeonato1, equipo1, equipo2, 2, 2); // Empate
        sistema.jugarPartido(campeonato2, equipo1, equipo2, 3, 1); // Victoria equipo1

        // Calcular resultados y mostrar tabla de posiciones
        sistema.calcularResultados(campeonato1);
        sistema.calcularResultados(campeonato2);

        // Obtener y mostrar tabla de posiciones del campeonato 1
        List<Equipo> tablaPosiciones = campeonato1.obtenerTablaPosiciones();
        for (Equipo equipo : tablaPosiciones) {
            System.out.println(equipo.getNombreEquipo());
        }
    }
}
