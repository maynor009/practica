package entity;

import java.sql.Date;

/**
 *
 * @author maynor.menjivarusam
 */
public class Torneo {

    private int id_tor;
    private Date anio;
    private String ciudad;
    private PaisCede paisCede;
    private Modalidad modalidad;
    

    public int getId_tor() {
        return id_tor;
    }

    public void setId_tor(int id_tor) {
        this.id_tor = id_tor;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public PaisCede getPaisCede() {
        return paisCede;
    }

    public void setPaisCede(PaisCede paisCede) {
        this.paisCede = paisCede;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }


}
