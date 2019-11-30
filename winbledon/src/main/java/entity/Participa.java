package entity;

/**
 *
 * @author maynor.menjivarusam
 */
public class Participa {

    private int id_parti;
    private Participante participante;
    private Partido partido;

    public int getId_parti() {
        return id_parti;
    }

    public void setId_parti(int id_parti) {
        this.id_parti = id_parti;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

}
