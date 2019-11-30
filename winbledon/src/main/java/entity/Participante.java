package entity;

/**
 *
 * @author maynor.menjivarusam
 */
public class Participante {

    private int id_ptc;
    private String nom_par;
    private String apellido;
    private int edad;
    private String p_representa;
    private Paises pais;

    public int getId_ptc() {
        return id_ptc;
    }

    public void setId_ptc(int id_ptc) {
        this.id_ptc = id_ptc;
    }

    public String getNom_par() {
        return nom_par;
    }

    public void setNom_par(String nom_par) {
        this.nom_par = nom_par;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getP_representa() {
        return p_representa;
    }

    public void setP_representa(String p_representa) {
        this.p_representa = p_representa;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

}
