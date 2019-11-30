package entity;

/**
 *
 * @author maynor.menjivarusam
 */
public class Premios {

    private int id_premio;
    private String pre_ganador;
    private String pre_consuelo;

    public int getId_premio() {
        return id_premio;
    }

    public void setId_premio(int id_premio) {
        this.id_premio = id_premio;
    }

    public String getPre_ganador() {
        return pre_ganador;
    }

    public void setPre_ganador(String pre_ganador) {
        this.pre_ganador = pre_ganador;
    }

    public String getPre_consuelo() {
        return pre_consuelo;
    }

    public void setPre_consuelo(String pre_consuelo) {
        this.pre_consuelo = pre_consuelo;
    }

}
