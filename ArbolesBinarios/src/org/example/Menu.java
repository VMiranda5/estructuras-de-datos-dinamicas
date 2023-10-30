package org.example;

import java.util.Scanner;

public class Menu {
    NodoEnteros padre;
    public void mostrar_menu() {
        Scanner scanner = new Scanner(System.in);
        String input;
        int opcion=0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Numero de nodos");
            System.out.println("2. Numero de hojas");
            System.out.println("3. Numero de niveles");
            System.out.println("4. Ancho del arbol");
            System.out.println("5. Recorrido in order");
            System.out.println("6. Recorrido post order");
            System.out.println("7. Recorrido pre order");
            System.out.println("X. Salir del menu");

            System.out.print("Ingrese la opcion: ");
            input = scanner.next();

            if (input.equalsIgnoreCase("X")) {
                opcion = 8;
            } else {
                try {
                    opcion = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese un número entre 1 y 7 o 'X' para salir.");
                    continue;
                }
            }

            switch (opcion) {
                case 1:
                    option1(padre);
                    break;
                case 2:
                    option2(padre);
                    break;
                case 3:
                    option3(padre);
                    break;
                case 4:
                    option4(padre);
                    break;
                case 5:
                    opcion5(padre);
                    break;
                case 6:
                    option6(padre);
                    break;
                case 7:
                    option7(padre);
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa");
                    break;
            }
        } while (opcion != 8);

        //scanner.close();
    }

    private static void option1(NodoEnteros padre) {
        System.out.println("Seleccionó la opción 1: contar los nodos del árbol");
        int nodos = padre.contarNodos();
        System.out.println("la cantidad de nodos que tiene el árbol es: " + nodos);
    }

    private static void option2(NodoEnteros padre) {
        System.out.println("Seleccionó la opción 2: contar las del árbol");
        int hojas = padre.contarHojas();
        System.out.println("la cantidad de hojas que tiene el árbol es: " + hojas);
    }

    private static void option3(NodoEnteros padre) {
        System.out.println("Seleccionó la opción 3: contar los niveles del árbol");
        int niveles = padre.contarNiveles(0,0);
        System.out.println("la cantidad de niveles que tiene el árbol es: " + niveles);
    }

    private static void option4(NodoEnteros padre) {
        System.out.println("Seleccionó la opción 4: ancho del árbol");
    }

    private static void opcion5(NodoEnteros padre) {
        System.out.println("Seleccionó la opción 5: recorrido in order");
        padre.recorrerInOrder();

    }

    private static void option6(NodoEnteros padre) {
        System.out.println("Seleccionó la opción 6: recorrido post order");
        padre.recorrerPostOrder();

    }

    private static void option7(NodoEnteros padre) {
        System.out.println("Seleccionó la opción 6: recorrido pre order");
        padre.recorrerPreOrder();

    }
}

