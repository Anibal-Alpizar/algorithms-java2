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
public class BLLJuegoDeMesa {

    public static void agregarJuegoDeMesa(JuegoDeMesa juegoDeMesa) {
        DALJuegoDeMesa.agregarJuego(juegoDeMesa);
    }

    public static List<JuegoDeMesa> obtenerTodosLosJuegos() {
        return DALJuegoDeMesa.obtenerTodosLosJuegos();
    }

    public static void eliminarJuegoDeMesa(String dniJuego) {
        DALJuegoDeMesa.eliminarJuego(dniJuego);
    }
}
