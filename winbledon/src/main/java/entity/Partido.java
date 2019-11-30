package entity;

/**
 *
 * @author maynor.menjivarusam
 */
public class Partido {

    private int id_pt;
    private String nom_face;
    private Arbitro arbitro;
    private Premios premio;
    private Torneo torneo;

    public int getId_pt() {
        return id_pt;
    }

    public void setId_pt(int id_pt) {
        this.id_pt = id_pt;
    }

    public String getNom_face() {
        return nom_face;
    }

    public void setNom_face(String nom_face) {
        this.nom_face = nom_face;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Premios getPremio() {
        return premio;
    }

    public void setPremio(Premios premio) {
        this.premio = premio;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

}
