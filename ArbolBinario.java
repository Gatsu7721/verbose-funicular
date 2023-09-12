/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesbinarios;

/**
 *
 * @author Alumno
 */
public class ArbolBinario {
     class Nodo {    //Representa un nodo en el arbol
        int valor;   //Cada nodo tiene un valor y referncias a los nodos hijoz izq y drch
        Nodo izquierdo;
        Nodo derecho;

        public Nodo(int valor) {
            this.valor = valor;
            this.izquierdo = this.derecho = null;
        }
    }

    Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    public void recorridoPreorden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            recorridoPreorden(raiz.izquierdo);
            recorridoPreorden(raiz.derecho);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertar los números en el árbol
        arbol.insertar(9);
        arbol.insertar(5);
        arbol.insertar(17);
        arbol.insertar(12);
        arbol.insertar(8);
        arbol.insertar(3);
        arbol.insertar(19);
        arbol.insertar(10);
        arbol.insertar(11);
      
        System.out.println("Nombre: Adan Vizcarra Choque");
        System.out.println("Recorrido Preorden del árbol:");
        arbol.recorridoPreorden(arbol.raiz);
    }
}
