/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anibal
 */
public class DALProveedor {

    private static MiCola<Proveedor> colaProveedores = new MiCola<>();

    public static void guardarProveedor(Proveedor proveedor) {
        colaProveedores.encolar(proveedor);
    }

    public static void mostrarRegistrosPersistidos() {
        System.out.println("Registros persistidos en memoria:");

        MiCola<Proveedor> colaTemp = new MiCola<>();
        while (!colaProveedores.estaVacia()) {
            Proveedor proveedor = colaProveedores.desencolar();
            colaTemp.encolar(proveedor);
            System.out.println(proveedor);
        }

        while (!colaTemp.estaVacia()) {
            colaProveedores.encolar(colaTemp.desencolar());
        }
    }

    public static List<Proveedor> obtenerTodosLosProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();
        MiCola<Proveedor> colaTemp = new MiCola<>();

        while (!colaProveedores.estaVacia()) {
            Proveedor proveedor = colaProveedores.desencolar();
            proveedores.add(proveedor);
            colaTemp.encolar(proveedor);
        }

        while (!colaTemp.estaVacia()) {
            colaProveedores.encolar(colaTemp.desencolar());
        }

        return proveedores;
    }


}
