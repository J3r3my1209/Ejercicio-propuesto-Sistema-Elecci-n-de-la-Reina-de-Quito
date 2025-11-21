import java.time.LocalDateTime;

public class Voto {

    private int idVoto;
    private int idCandidata;
    private LocalDateTime fechaHora;

    public Voto(int idVoto, int idCandidata, LocalDateTime fechaHora) {
        this.idVoto = idVoto;
        this.idCandidata = idCandidata;
        this.fechaHora = fechaHora;
    }

    public int getIdCandidata() {
        return idCandidata;
    }
}