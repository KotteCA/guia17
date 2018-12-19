package cl.accenture.programatufuturo.guia17.Modelo;

public class CuentaBancaria {
    private String idCuenta;
    private int saldoDisponible;
    private String tipoCuenta;


    public CuentaBancaria() {
        this.idCuenta = "";
        this.saldoDisponible = 0;
        this.tipoCuenta = "";
    }
    public CuentaBancaria(String idCuenta, int saldoDisponible, String tipoCuenta) {
        this.idCuenta = idCuenta;
        this.saldoDisponible = saldoDisponible;
        this.tipoCuenta = tipoCuenta;
    }



    public String getIdCuenta() {
        return idCuenta;
    }
    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }
    public int getSaldoDisponible() {
        return saldoDisponible;
    }
    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
