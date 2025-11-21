package proyecto_;

public class CandidataEstudiante extends Candidata {
    private String universidad, carrera;

    public CandidataEstudiante(int id, int edad, String nombre, String distrito, double puntajeJurado, String universidad, String carrera){
        super(id, edad, nombre, distrito, puntajeJurado);
        this.universidad=universidad;
        this.carrera=carrera;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\nNombre: " + getNombre() + "\nID: " + getId() + "\nEdad: " + getEdad() + "\nDistrito: "
                + getDistrito() + "\nPuntaje del jurado: " + getPuntajeJurado() +
                "\nUniversidad: " + universidad + "\nCarrera: " + carrera);
    }

}
