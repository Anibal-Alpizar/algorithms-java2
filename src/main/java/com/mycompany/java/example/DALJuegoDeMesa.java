/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.example;

/**
 *
 * @author anibal
 */
import java.util.List;

public class DALJuegoDeMesa {

    private static MiPila<JuegoDeMesa> juegos = new MiPila<>();

    public static void agregarJuego(JuegoDeMesa juego) {
        juegos.apilar(juego);
    }

    public static List<JuegoDeMesa> obtenerTodosLosJuegos() {
        return juegos.obtenerTodosLosElementos();
    }

    public static void eliminarJuego(String dniJuego) {
        MiPila<JuegoDeMesa> copiaJuegos = new MiPila<>();

        while (!juegos.estaVacia()) {
            JuegoDeMesa juego = juegos.desapilar();
            if (!juego.getDni().toString().equals(dniJuego)) {
                copiaJuegos.apilar(juego);
            }
        }

        while (!copiaJuegos.estaVacia()) {
            juegos.apilar(copiaJuegos.desapilar());
        }
    }

}
