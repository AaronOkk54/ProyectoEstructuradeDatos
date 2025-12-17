/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;

public class ListaCircularUsuarios {
    
    private NodoUsuario cabeza;
    private int tam;

    public ListaCircularUsuarios() {
        this.cabeza = null;
        this.tam = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int tamaño() {
        return tam;
    }

    public boolean existeNickname(String nick) {
        if (nick == null) return false;
        if (estaVacia()) return false;

        NodoUsuario x = cabeza;
        do {
            if (x.dato.getNickname().equals(nick)) {
                return true;
            }
            x = x.siguiente;
        } while (x != cabeza);
        return false;
    }

    public boolean agregar(Usuario u) {
        if (u == null) 
            return false;
        if (u.getNickname() == null) 
            return false;
        if (existeNickname(u.getNickname())) 
            return false;

        NodoUsuario nuevo = new NodoUsuario();
        nuevo.dato = u;

        if (estaVacia()) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cabeza = nuevo;
        } else {
            NodoUsuario cola = cabeza.anterior;
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
        
        tam = tam + 1;
        return true;
    }

    public Usuario consultarPorNickname(String nick) {
        if (nick == null) return null;
        if (estaVacia()) return null;

        NodoUsuario x = cabeza;
        do {
            if (x.dato.getNickname().equals(nick)) {
                return x.dato;
            }
            x = x.siguiente;
        } while (x != cabeza);

        return null;
    }

    public boolean inactivar(String nick, boolean tieneRelaciones) {
        if (nick == null) return false;
        if (estaVacia()) return false;

        NodoUsuario x = cabeza;
        do {
            if (x.dato.getNickname().equals(nick)) {
                if (tieneRelaciones) {
                    return false;
                }
                x.dato.setEstado(false);
                return true;
            }
            x = x.siguiente;
        } while (x != cabeza);

        return false;
    }

    public String listarComoTexto() {
        if (estaVacia()) return "Lista vacía";
        String s = "";
        NodoUsuario x = cabeza;
        do {
            s = s + x.dato.getNickname() + " - " + (x.dato.isEstado() ? "Activo" : "Inactivo") + "\n";
            x = x.siguiente;
        } while (x != cabeza);
        return s;
    }
}
