package com.mycompany.java.example;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MiPila<T> {

    private static class Nodo<T> {

        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
        }
    }

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;

    public MiPila() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int tamaño() {
        return tamaño;
    }

    public void apilar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
        tamaño++;
    }

    public T desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        T dato = primero.dato;
        primero = primero.siguiente;
        tamaño--;
        return dato;
    }

    public T verCima() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return primero.dato;
    }

    public List<T> obtenerTodosLosElementos() {
        List<T> elementos = new ArrayList<>();
        Nodo<T> actual = primero;

        while (actual != null) {
            elementos.add(actual.dato);
            actual = actual.siguiente;
        }

        return elementos;
    }
}
