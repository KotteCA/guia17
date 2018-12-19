package cl.accenture.programatufuturo.guia17.Modelo;

public class Transaccion {
    private int idTransaccion;
    private CuentaBancaria cuenta;
    private String tipoTransaccion;
    private int monto;



    public Transaccion() {
        this.idTransaccion = 0;
        this.cuenta = new CuentaBancaria();
        this.tipoTransaccion = "";
        this.monto = 0;
    }

    public Transaccion(int idTransaccion, CuentaBancaria cuenta, String tipoTransaccion, int monto) {
        this.idTransaccion = idTransaccion;
        this.cuenta = cuenta;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
    }


    public int getIdTransaccion() {
        return idTransaccion;
    }
    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }




}
