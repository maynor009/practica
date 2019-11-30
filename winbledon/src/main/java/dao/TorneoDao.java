package dao;

import entity.Modalidad;
import entity.PaisCede;
import entity.Torneo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author maynor.menjivarusam
 */
public class TorneoDao extends Conexion.Conexion {

    public void actualizar(Torneo t) throws Exception {
        PaisCede pc = t.getPaisCede();
        Modalidad md = t.getModalidad();

        try {
            this.conectar();
            String query = "update torneo set anio=?,ciudad=?,id_cede=?,id_mod=? where id_tor=?";
            PreparedStatement smt = this.getCon().prepareStatement(query);
            smt.setDate(1, t.getAnio());
            smt.setString(2, t.getCiudad());
            smt.setInt(3, pc.getId_cede());
            smt.setInt(4, md.getId_mod());
            smt.setInt(5, t.getId_tor());
            smt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    public Torneo llenarById(int id) throws Exception {
        Torneo t = new Torneo();
        try {
            this.conectar();
            String query = "select * from torneo where id_tor=?";
            PreparedStatement smt = this.getCon().prepareStatement(query);
            smt.setInt(1, id);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                PaisCede pc = new PaisCede();
                Modalidad md = new Modalidad();

                t.setId_tor(rs.getInt("id_tor"));
                t.setAnio(rs.getDate("anio"));
                t.setCiudad(rs.getString("ciudad"));
                pc.setCede_pais(rs.getString("id_cede"));
                t.setPaisCede(pc);
                md.setTipo_mod(rs.getString("id_mod"));
                t.setModalidad(md);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }

        return t;
    }

    public void eliminar(int idEli) throws Exception {
        try {
            this.conectar();
            String query = "delete from torneo where id_tor=?";
            PreparedStatement smt = this.getCon().prepareStatement(query);
            smt.setInt(1, idEli);
            smt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    public void insetar(Torneo t) throws Exception {
        PaisCede pc = t.getPaisCede();
        Modalidad md = t.getModalidad();

        try {
            this.conectar();
            String query = "insert into torneo(anio,ciudad,id_cede,id_mod) values(?,?,?,?)";
            PreparedStatement smt = this.getCon().prepareStatement(query);
            smt.setDate(1, t.getAnio());
            smt.setString(2, t.getCiudad());
            smt.setInt(3, pc.getId_cede());
            smt.setInt(4, md.getId_mod());
            smt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }

    }

    public ArrayList<Torneo> consulta() throws Exception {
        ArrayList<Torneo> lista = new ArrayList<>();
        try {
            this.conectar();
            String query = "select t.id_tor,t.anio,t.ciudad,pc.cede_pais,m.tipo_mod\n"
                    + "from torneo t \n"
                    + "inner join pais_cede pc on t.id_cede=pc.id_cede\n"
                    + "inner join modalidad m on t.id_mod=m.id_mod";
            PreparedStatement smt = this.getCon().prepareStatement(query);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Torneo t = new Torneo();
                PaisCede pc = new PaisCede();
                Modalidad md = new Modalidad();

                t.setId_tor(rs.getInt("t.id_tor"));
                t.setAnio(rs.getDate("t.anio"));
                t.setCiudad(rs.getString("t.ciudad"));
                pc.setCede_pais(rs.getString("pc.cede_pais"));
                t.setPaisCede(pc);
                md.setTipo_mod(rs.getString("m.tipo_mod"));
                t.setModalidad(md);
                lista.add(t); 
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }
}
