public class CandidataProfesional extends Candidata {

    private String profesion;
    private int anosExperiencia;

    public CandidataProfesional(
            int id,
            String nombre,
            int edad,
            String distrito,
            double puntajeJurado,
            String profesion,
            int anosExperiencia
    ) throws DatoInvalidoException {
        super(id, nombre, edad, distrito, puntajeJurado);

        this.profesion = profesion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Candidata Profesional ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Distrito: " + distrito);
        System.out.println("Puntaje Jurado: " + puntajeJurado);
        System.out.println("Profesión: " + profesion);
        System.out.println("Años de experiencia: " + anosExperiencia);
        System.out.println("---------------------------");
    }
}