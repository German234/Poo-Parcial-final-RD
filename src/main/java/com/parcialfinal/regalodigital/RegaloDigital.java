package com.parcialfinal.regalodigital;

import java.time.LocalDate;

public class RegaloDigital{

    private int regaloID;
    private String destinatario;
    private String remitente;
    private String mensaje;
    private String tipoRegalo;
    private LocalDate fechaEnvio;
    private String enlaceDescarga;

    public RegaloDigital() {}

    public RegaloDigital(int regaloID, String destinatario, String remitente, String mensaje,
                         String tipoRegalo, LocalDate fechaEnvio, String enlaceDescarga) {
        this.regaloID = regaloID;
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.mensaje = mensaje;
        this.tipoRegalo = tipoRegalo;
        this.fechaEnvio = fechaEnvio;
        this.enlaceDescarga = enlaceDescarga;
    }

    public int getRegaloID() {
        return regaloID;
    }

    public void setRegaloID(int regaloID) {
        this.regaloID = regaloID;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipoRegalo() {
        return tipoRegalo;
    }

    public void setTipoRegalo(String tipoRegalo) {
        this.tipoRegalo = tipoRegalo;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getEnlaceDescarga() {
        return enlaceDescarga;
    }

    public void setEnlaceDescarga(String enlaceDescarga) {
        this.enlaceDescarga = enlaceDescarga;
    }
}

