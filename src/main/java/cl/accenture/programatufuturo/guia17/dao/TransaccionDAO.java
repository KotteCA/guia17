package cl.accenture.programatufuturo.guia17.dao;


import cl.accenture.programatufuturo.guia17.Modelo.CuentaBancaria;
import cl.accenture.programatufuturo.guia17.Modelo.Transaccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

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

    public LinkedList<Transaccion> ListarTransacciones(CuentaBancaria a) throws Exception {
        LinkedList<Transaccion> transaccions = new LinkedList<Transaccion>();
        PreparedStatement preparedStatement = getConect().obtenerConnection().prepareStatement("SELECT tipoTransaccion FROM Transaccion WHERE CuentaBancaria_idCuenta=?");
        preparedStatement.setString(1, a.getIdCuenta());
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            Transaccion transaccion = new Transaccion();
            transaccion.setTipoTransaccion(rs.getString("tipoTransaccion"));
            transaccion.setMonto(rs.getInt("monto"));
            transaccions.add(transaccion);
        }
        return transaccions;
    }



    public LinkedList <Transaccion> ListaAbono() throws Exception{
        LinkedList<Transaccion> transaccions = new LinkedList<Transaccion>();
        PreparedStatement preparedStatement = getConect().obtenerConnection().prepareStatement("SELECT * FROM Transacción WHERE tipoTransaccion=abono");
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()){
            Transaccion transaccion = new Transaccion();
            transaccion.setTipoTransaccion(rs.getString("tipoTransaccion"));
            transaccion.setMonto(rs.getInt("monto"));
            transaccions.add(transaccion);
        }
        return transaccions;
    }

}
