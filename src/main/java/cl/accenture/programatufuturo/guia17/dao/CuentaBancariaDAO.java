package cl.accenture.programatufuturo.guia17.dao;

import cl.accenture.programatufuturo.guia17.Modelo.CuentaBancaria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CuentaBancariaDAO {
    private Conexion conect;


    public CuentaBancariaDAO() {
        this.conect = new Conexion();
    }
    public CuentaBancariaDAO(Conexion conexion) {
        this.conect = conexion;
    }

    public Conexion getConect() {
        return conect;
    }

    public void setConect(Conexion conect) {
        this.conect = conect;
    }

    public void GuardarCuenta (CuentaBancaria a) throws Exception{
        PreparedStatement pstatementInsert= getConect().obtenerConnection().prepareStatement("INSERT INTO CuentaBancaria(idCuenta, saldoDisponible,tipoCuenta)" + "VALUES(?,?,?)");
        pstatementInsert.setString(1,a.getIdCuenta());
        pstatementInsert.setInt(2,a.getSaldoDisponible());
        pstatementInsert.setString(3,a.getTipoCuenta());
        int resultpInsert= pstatementInsert.executeUpdate();
    }

    public void obtenerCuentas() throws Exception{
        PreparedStatement preparedStatement= getConect().obtenerConnection().prepareStatement("SELECT idCuenta FROM cuentaBancaria");
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("idCuenta"));
        }
    }
}
