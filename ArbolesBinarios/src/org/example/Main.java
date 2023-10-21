package org.example;

public class Main {
    public static void main(String[] args) {
        /**
         *
         *
         *             4
         *          /     \
         *        1        6
         *      /  \        \
         *    0     2        9
         *                    \
         *                     13
         *
         */

        NodoEnteros padre = new NodoEnteros();  //1
        padre.valor = 4;


        NodoEnteros hijoIzquierdo = new NodoEnteros(); //2
        hijoIzquierdo.valor = 1;
        NodoEnteros hijoDerecho = new NodoEnteros();  //3
        hijoDerecho.valor = 6;

        padre.hijoIzquierdo = hijoIzquierdo;

        padre.hijoDerecho = hijoDerecho;

        NodoEnteros hijoIzquierdoDelHijoIzquierdo = new NodoEnteros(); //4
        hijoIzquierdoDelHijoIzquierdo.valor = 0;

        NodoEnteros hijoDerechoDelHijoIzquierdo = new NodoEnteros(); //5
        hijoDerechoDelHijoIzquierdo.valor = 2;
        hijoIzquierdo.hijoDerecho = hijoDerechoDelHijoIzquierdo;

        hijoIzquierdo.hijoIzquierdo = hijoIzquierdoDelHijoIzquierdo;

        NodoEnteros hijoDerechoDelHijoDerecho = new NodoEnteros(); //6
        hijoDerechoDelHijoDerecho.valor = 9;
        hijoDerecho.hijoDerecho = hijoDerechoDelHijoDerecho;

        NodoEnteros hijoDerechoDelHijoDerechoDelHijoDerecho = new NodoEnteros(); //7
        hijoDerechoDelHijoDerechoDelHijoDerecho.valor = 13;
        hijoDerechoDelHijoDerecho.hijoDerecho = hijoDerechoDelHijoDerechoDelHijoDerecho;


        /*
        System.out.println(padre.esHoja());  //Falso
        System.out.println(hijoIzquierdo.esHoja()); //Falso
        System.out.println(hijoDerecho.esHoja()); //Verdadero
        System.out.println(hijoIzquierdoDelHijoIzquierdo.esHoja()); //Verdadero
        */
        //padre.recorrerInOrder();
        //padre.recorrerPostOrder();

        //int niveles = padre.contarNiveles(0,0);
        //System.out.println(niveles);
        int hojas = padre.contarHojas();
        System.out.println(hojas);
    }
}