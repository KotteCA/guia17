package cl.accenture.programatufuturo.guia17.dao;

import cl.accenture.programatufuturo.guia17.Exception.SinConexionException;


import java.sql.*;
import java.sql.Connection;

public class Conexion {
    private String direccionIP;
    private int puerto;
    private String nombre, usuario, password;


    public Conexion(){
        this.puerto =0;
        this.direccionIP="";
        this.nombre="";
        this.usuario="";
        this.password="";
    }

    public Conexion(String direccionIP,int puerto, String nombre, String usuario, String password) {
        this.puerto = puerto;
        this.direccionIP = direccionIP;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
    }

    public int getPuerto() {
        return puerto;
    }
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    public String getDireccionIP() {
        return direccionIP;
    }
    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }




    public Connection obtenerConnection() throws SinConexionException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection(
                    "jdbc:mysql;//" + this.direccionIP + ":" + this.puerto + "/" + this.nombre, this.usuario, this.password);
            return conect;
        }catch (ClassNotFoundException e){
            throw new SinConexionException("El driver no se ha cargado correctamente", e);

        }catch (SQLException e){
            throw new SinConexionException("Ocurrio un error al establecer la conexion : " + e.getMessage(), e);
        }
    }
}
