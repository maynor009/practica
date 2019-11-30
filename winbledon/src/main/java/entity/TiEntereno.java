package entity;

import java.sql.Date;

/**
 *
 * @author maynor.menjivarusam
 */
public class TiEntereno {

    private int id_tentre;
    private Date f_inicio;
    private Date f_fin;
    private Entrenador entrenador;
    private Participante participante;

    public int getId_tentre() {
        return id_tentre;
    }

    public void setId_tentre(int id_tentre) {
        this.id_tentre = id_tentre;
    }

    public Date getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(Date f_inicio) {
        this.f_inicio = f_inicio;
    }

    public Date getF_fin() {
        return f_fin;
    }

    public void setF_fin(Date f_fin) {
        this.f_fin = f_fin;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

}
