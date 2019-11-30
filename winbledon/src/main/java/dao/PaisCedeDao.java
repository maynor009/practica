/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.PaisCede;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author maynor.menjivarusam
 */
public class PaisCedeDao extends Conexion.Conexion {

    public ArrayList<PaisCede> consultar() throws Exception {
        ArrayList<PaisCede> lista = new ArrayList<>();
        try {
            this.conectar();
            String query = "select*from pais_cede";
            PreparedStatement smt = this.getCon().prepareStatement(query);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                PaisCede pc = new PaisCede();

                pc.setId_cede(rs.getInt("id_cede"));
                pc.setCede_pais(rs.getString("cede_pais"));
                lista.add(pc);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }

        return lista;
    }

}
