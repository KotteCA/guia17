package cl.accenture.programatufuturo.guia17.dao;


import cl.accenture.programatufuturo.guia17.Modelo.CuentaBancaria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransaccionDAO {
    private Conexion conect;

    public TransaccionDAO() {
        this.conect = new Conexion();
    }
    public TransaccionDAO(Conexion conect) {
        this.conect = conect;
    }

    public Conexion getConect() {
        return conect;
    }
    public void setConect(Conexion conect) {
        this.conect = conect;
    }

    public void ListarTransacciones (CuentaBancaria a) throws Exception{
    }

    public void ListaAbono(){

    }
}
