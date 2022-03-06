package cuentas;

/**
 * Esta clase se encarga de crear los objetos CCuenta,
 * que contendran nombre , numero de cuenta, saldo y tipo de interes
 * 
 * @author Cristian Fernando Pacheco Corrales
 */
public class CCuenta {

    /**
     * retorna el nombre del propietario
     * 
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * asigna un nuevo nombre al propietario
     * 
     * @param nombre nombre del cleinte
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * retorna la cuenta del propietario
     * 
     * @return  cuenta del propietario
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * asigna una nueva cuenta al propietario
     * 
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * retorna el saldo de la cuenta
     * 
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * asigna un nuevo saldo a la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * retorna el tipo de interes de la cuenta
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * asigna un nuevo tipo de interes a la cuenta
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * constructor de la clsse cuenta
     */
    public CCuenta()
    {
    }
    /**
     * Constructor de CCuenta que contendra los siguientes parametros.
     * 
     * @param nom nombre del tirular   
     * @param cue cuenta del titular
     * @param sal saldo de la cuenta
     * @param tipo  tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Metodo que devolvera el saldo 
     * 
     * @return  saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * metodo para ingresar saldo en la cuenta
     * 
     * @param cantidad que se ingresa
     * @throws Exception para verificar si cantidad menor que 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * metodo para retirar saldo de la cuenta
     * @param cantidad a retirar del saldo
     * @throws Exception verifica si hay saldo suficienre o es negativo 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}