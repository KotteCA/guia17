package cl.accenture.programatufuturo.guia17.Exception;

public class SinConexionException extends Exception {
    public SinConexionException(String a, Throwable e){
        super (a,e);
    }
}
