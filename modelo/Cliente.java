package com.bytebank.modelo;

/**
* Clase que representa a un cliente en ByteBank
*
* @autor Mau Aguilar
* @version 0.1
*/

public class Cliente implements Autenticable {

    private String nombre;
    private String documento;
    private String telefono;

    private AutenticacionUtil util;

    public Cliente() {
        this.util = new AutenticacionUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }
}
