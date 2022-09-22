package com.example.miinventario;

public class InventariosVO {

    private String nombre;
    private String cantidad_integrantes;
    private String rol;
    private String fecha_creacion;

    public InventariosVO() {
    }

    public InventariosVO(String nombre, String cantidad_integrantes, String rol, String fecha_creacion) {
        this.nombre = nombre;
        this.cantidad_integrantes = cantidad_integrantes;
        this.rol = rol;
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCantidad_integrantes() { return cantidad_integrantes; }

    public void setCantidad_integrantes(String cantidad_integrantes) { this.cantidad_integrantes = cantidad_integrantes; }

    public String getRol() { return rol; }

    public void setRol(String rol) { this.rol = rol; }

    public String getFecha_creacion() { return fecha_creacion; }

    public void setFecha_creacion(String fecha_creacion) { this.fecha_creacion = fecha_creacion; }
}
