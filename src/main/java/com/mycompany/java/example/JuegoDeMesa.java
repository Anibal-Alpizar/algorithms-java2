/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.example;

import java.util.UUID;

/**
 *
 * @author anibal
 */
public class JuegoDeMesa {

    private UUID dni;
    private String nombre;
    private String categoriaInteraccion;
    private String categoriaAccesorios;
    private String mecanica;
    private String numeroParticipantes;
    private int edadMinima;
    private String proveedor;

    public JuegoDeMesa(String nombre, String categoriaInteraccion, String categoriaAccesorios,
            String mecanica, String numeroParticipantes, int edadMinima, String proveedor) {
        this.dni = UUID.randomUUID();
        this.nombre = nombre;
        this.categoriaInteraccion = categoriaInteraccion;
        this.categoriaAccesorios = categoriaAccesorios;
        this.mecanica = mecanica;
        this.numeroParticipantes = numeroParticipantes;
        this.edadMinima = edadMinima;
        this.proveedor = proveedor;
    }

    public UUID getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoriaInteraccion() {
        return categoriaInteraccion;
    }

    public String getCategoriaAccesorios() {
        return categoriaAccesorios;
    }

    public String getMecanica() {
        return mecanica;
    }

    public String getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getDescripcionCompleta() {
        StringBuilder descripcion = new StringBuilder();

        descripcion.append("Nombre: ").append(nombre).append("\n");
        descripcion.append("Categoría de Interacción: ").append(categoriaInteraccion).append("\n");
        descripcion.append("Categoría de Accesorios: ").append(categoriaAccesorios).append("\n");
        descripcion.append("Mecánica: ").append(mecanica).append("\n");
        descripcion.append("Número de Participantes: ").append(numeroParticipantes).append("\n");
        descripcion.append("Edad Mínima: ").append(edadMinima).append("\n");
        descripcion.append("Proveedor: ").append(proveedor);

        return descripcion.toString();
    }

    @Override
    public String toString() {
        return "JuegoDeMesa{"
                + "dni=" + dni
                + ", nombre='" + nombre + '\''
                + ", categoriaInteraccion='" + categoriaInteraccion + '\''
                + ", categoriaAccesorios='" + categoriaAccesorios + '\''
                + ", mecanica='" + mecanica + '\''
                + ", numeroParticipantes='" + numeroParticipantes + '\''
                + ", edadMinima=" + edadMinima
                + ", proveedor=" + proveedor
                + '}';
    }
}
