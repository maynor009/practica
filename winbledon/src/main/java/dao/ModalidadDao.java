/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Modalidad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author maynor.menjivarusam
 */
public class ModalidadDao extends Conexion.Conexion{
    public ArrayList<Modalidad> consulta()throws Exception{
    ArrayList<Modalidad> lista=new ArrayList<>();
        try {
            this.conectar();
            String query="select * from modalidad";
            PreparedStatement smt=this.getCon().prepareStatement(query);
            ResultSet rs=smt.executeQuery();
            while(rs.next()){
            Modalidad md=new Modalidad();
            
            md.setId_mod(rs.getInt("id_mod"));
            md.setTipo_mod(rs.getString("tipo_mod"));
            lista.add(md);
            }
            
        } catch (Exception e) {
        throw e;
        }finally{
        this.desconectar();
        }
    
    return lista;
    }
    
}
