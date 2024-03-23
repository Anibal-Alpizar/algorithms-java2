/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.example;

/**
 *
 * @author anibal
 */
public class MiCola<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    
    public MiCola() {
        this.primero = null;
        this.ultimo = null;
    }
    
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        
        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    
    public boolean estaVacia() {
        return primero == null;
    }
    
    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
    }
    
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T dato = primero.dato;
        primero = primero.siguiente;
        if (primero == null) {
            ultimo = null;
        }
        return dato;
    }
    
    public T primero() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return primero.dato;
    }
}