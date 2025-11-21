import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Concurso {

    private ArrayList<Candidata> listaCandidatas = new ArrayList<>();
    private Map<Integer, Integer> conteoVotos = new HashMap<>();
    private final Scanner sc = new Scanner(System.in);

    public Concurso() {
    }

    public void registrarCandidata() {
        System.out.println("---REGISTRAR CANDIDATA---");
        int id = listaCandidatas.size() + 1;

        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese distrito: ");
        String distrito = sc.nextLine();

        double puntajeJurado = 0.0;

        Candidata nuevaCandidata = new Candidata(id, nombre, edad, distrito, puntajeJurado);
        listaCandidatas.add(nuevaCandidata);

        conteoVotos.put(id, 0);
        System.out.println("Candidata ID " + id + " registrada con éxito.");
    }

    public void votar(int idCandidata) {
        if (conteoVotos.containsKey(idCandidata)) {
            conteoVotos.put(idCandidata, conteoVotos.get(idCandidata) + 1);
            System.out.println("Voto registrado para la candidata ID: " + idCandidata);
        } else {
            System.out.println("ID de candidata no válido.");
        }
    }

    public Map<Integer, Integer> contarVotos() {
        return this.conteoVotos;
    }

    public List<Candidata> obtenerGanador() {

        if (conteoVotos.isEmpty()) {
            return Collections.emptyList();
        }

        int maxVotos = Collections.max(conteoVotos.values());
        List<Candidata> ganadoras = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : conteoVotos.entrySet()) {
            if (entry.getValue() == maxVotos) {
                int idGanadora = entry.getKey();
                for (Candidata c : listaCandidatas) {
                    if (c.getId() == idGanadora) {
                        ganadoras.add(c);
                        break;
                    }
                }
            }
        }
        return ganadoras;
    }

    public void mostrarDetalles() {
        System.out.println("\n--- ESTADO ACTUAL DEL CONCURSO ---");
        System.out.println("Candidatas:");
        for (Candidata c : listaCandidatas) {
            System.out.println("- " + c.toString());
        }
        System.out.println("Votos:");
        for (Map.Entry<Integer, Integer> entry : conteoVotos.entrySet()) {
            System.out.println("- Candidata ID " + entry.getKey() + ": " + entry.getValue() + " votos.");
        }

        List<Candidata> ganadoras = obtenerGanador();
        if (!ganadoras.isEmpty()) {
            System.out.println("\n*** GANADOR(A/ES) ACTUALES CON " + Collections.max(conteoVotos.values()) + " VOTOS ***");
            for (Candidata g : ganadoras) {
                System.out.println("-> " + g.getNombre());
            }
        }
    }
}

