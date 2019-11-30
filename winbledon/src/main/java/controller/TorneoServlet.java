/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ModalidadDao;
import dao.PaisCedeDao;
import dao.TorneoDao;
import entity.Modalidad;
import entity.PaisCede;
import entity.Torneo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maynor.menjivarusam
 */
@WebServlet(name = "TorneoServlet", urlPatterns = {"/Torneo"})
public class TorneoServlet extends HttpServlet {

    String ruta = "";
    TorneoDao dtorneo;
    PaisCedeDao dPaiscede;
    ModalidadDao dModalidad;

    public TorneoServlet() {
        super();
        dtorneo = new TorneoDao();
        dPaiscede = new PaisCedeDao();
        dModalidad = new ModalidadDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("action");
        switch (accion) {
            case "consulta":

                ruta = "admin/torneo/torneo.jsp";
                try {
                    request.setAttribute("lista", dtorneo.consulta());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case "insertar":
                ruta = "admin/torneo/instorneo.jsp";
                try {
                    request.setAttribute("PaisCede", dPaiscede.consultar());
                    request.setAttribute("modalidad", dModalidad.consulta());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "eliminar":
                ruta = "admin/torneo/torneo.jsp";
                try {
                    int idEli = Integer.parseInt(request.getParameter("id"));
                    dtorneo.eliminar(idEli);
                    request.setAttribute("lista", dtorneo.consulta());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case "actualizar":
                ruta = "admin/torneo/instorneo.jsp";
                try {
                    int idUp = Integer.parseInt(request.getParameter("id"));
                    request.setAttribute("PaisCede", dPaiscede.consultar());
                    request.setAttribute("modalidad", dModalidad.consulta());
                    request.setAttribute("llena", dtorneo.llenarById(idUp));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        RequestDispatcher dt = request.getRequestDispatcher(ruta);
        dt.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idPCede = Integer.parseInt(request.getParameter("cmbPais"));
        String ciudad = request.getParameter("txtCiudad");
        Date ftorneo = Date.valueOf(request.getParameter("txtFecha"));
        int idModa = Integer.parseInt(request.getParameter("cmbModalidad"));

        Torneo t = new Torneo();
        PaisCede pc = new PaisCede();
        Modalidad md = new Modalidad();

        t.setAnio(ftorneo);
        t.setCiudad(ciudad);
        pc.setId_cede(idPCede);
        t.setPaisCede(pc);
        md.setId_mod(idModa);
        t.setModalidad(md);

        try {
            dtorneo.insetar(t);
            ruta = "admin/torneo/torneo.jsp";
            request.setAttribute("lista", dtorneo.consulta());
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher dt = request.getRequestDispatcher(ruta);
        dt.forward(request, response);
    }
}
