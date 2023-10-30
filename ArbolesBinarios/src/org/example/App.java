package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Este programa permite trabajar con Árboles.");
        System.out.println("Digite el número de valores: ");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int valores = -1;
        while (flag) {
            try {
                //int valores = scanner.nextInt();
                valores = scanner.nextInt();
                System.out.println("El valor ingresado es: " + valores);
                flag = false;
            } catch (InputMismatchException ex) {
                System.out.println("Usted ingresó un valor no numérico, por favor ingrese un valor numérico: ");
                scanner.nextLine();
            }
        }

        switch(valores){
            case -1: {
                NodoEnteros padre = loopInfinito();
                Menu menu = new Menu();
                menu.padre = padre;
                menu.mostrar_menu();
                break;
            }
            case 0: {
                System.out.println("Usted ingresó un arbol null");
                break;
            }
            default:
                NodoEnteros padre =loopDefinido(valores);
                //padre.recorrerInOrder();
                Menu menu = new Menu();
                menu.padre = padre;
                menu.mostrar_menu();
                break;
        }
    }


    private static NodoEnteros construirArbol(NodoEnteros padre, int valor){
        if(padre==null){
            padre = new NodoEnteros();
            padre.valor = valor;
            return padre;
        }

        if (valor<padre.valor){
            padre.hijoIzquierdo = construirArbol(padre.hijoIzquierdo,valor);
        } else if (valor > padre.valor) {
            padre.hijoDerecho = construirArbol(padre.hijoDerecho, valor);
        }

        return padre;

    }

    private static NodoEnteros loopInfinito() {
        Scanner sc = new Scanner(System.in);
        String valor = "";
        boolean flag = true;
        NodoEnteros padre = null; // Initialize outside the loop
        while (flag) {
            System.out.println("Ingrese el valor del nodo: ");
            valor = sc.next();
            if (valor.equalsIgnoreCase("X")) {
                flag = false;
            } else {
                int valorInt = Integer.parseInt(valor);
                if (padre == null) {
                    padre = new NodoEnteros();
                    padre.valor = valorInt;
                } else {
                    padre = construirArbol(padre, valorInt);
                }
            }
        }
        //sc.close(); // Close the scanner to release resources.
        return padre;
    }

    private static NodoEnteros loopDefinido(int valores){
        Scanner sc2 = new Scanner(System.in);
        String valor = "";
        NodoEnteros padre = new NodoEnteros();
        for (int i=0; i<valores; i++){
            System.out.println("Ingrese el valor del nodo: ");
            valor = sc2.next();
            if (valor.equalsIgnoreCase("X")) {
                break;
            }
            else{
                int valorInt = Integer.parseInt(valor);
                if(i==0){
                    padre.valor= valorInt;
                }
                else{
                    padre = construirArbol(padre, valorInt);

                }
            }
        }
        //sc2.close();
        return padre;
    }


}

