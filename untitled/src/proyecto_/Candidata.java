package proyecto_;

public abstract class Candidata {
    private int id, edad;
    private String nombre, distrito;
    private double puntajeJurado;

    public Candidata(int id, int edad, String nombre, String distrito, double puntajeJurado){
        setId(id);
        setEdad(edad);
        setNombre(nombre);
        setDistrito(distrito);
        setPuntajeJurado(puntajeJurado);
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public double getPuntajeJurado() {
        return puntajeJurado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPuntajeJurado(double puntajeJurado) {
        this.puntajeJurado = puntajeJurado;
    }
    public abstract void mostrarDetalles();
}
