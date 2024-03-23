/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.example;

import java.util.List;

/**
 *
 * @author anibal
 */
public class BLLProveedor {

    public static void agregarProveedor(Proveedor proveedor) {
        DALProveedor.guardarProveedor(proveedor);
    }

    public static void mostrarRegistrosPersistidos() {
        DALProveedor.mostrarRegistrosPersistidos();
    }

    public static List<Proveedor> obtenerTodosLosProveedores() {
        return DALProveedor.obtenerTodosLosProveedores();
    }
}
