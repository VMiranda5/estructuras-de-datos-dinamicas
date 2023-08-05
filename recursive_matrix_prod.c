#include <stdio.h>

void matrixProduct(int r1, int c1, int c2, int x[r1][c1], int y[][c2], int z[r1][c2])
{
    //las variable i, j, k se declaran como static para que conserven su valor actualizado despues de que se ejecute la funcion y asi no inicializar estos valores en cada llamada a la funcion
    static int i = 0, j = 0, k = 0;
    //para hacer seguimiento a los indices
    //printf("this is i: %d, this is j: %d, this is k: %d", i,j,k);
    //printf("\n");

    if (i >=r1)
    {
        return;
    }
    else if (i<r1)
    {
        if (j <c2)
        {
            if (k<c1)
            {
                //haria las veces del ciclo mas interno, va llamandose a si mismo hasta que termina de recorrer una fila de x y una                   columna de y
                z[i][j] += x[i][k] * y[k][j];
                k++;
                matrixProduct(r1, c1, c2, x, y,z);
            }
            //despues de que recorre una fila de x y una columna de x, vuelve la variable k 0 y ademas agrega 1 al valor de j para asi pasar a la siguiente columna de y, entrando de nuevo en el if mas interno
            k = 0;
            j++;
            matrixProduct(r1,c1,c2,x,y,z);
        }
        //cuando ya ha recorrido una fila de x con todas las columnas de y, obtiene los valores de la primera fila de z entonces ahora pasa a la siguiente fila de x para recorrerla con todas las columnas de y 
        j = 0;
        i++;
        matrixProduct(r1,c1,c2,x,y,z);

    }    
}
//una funcion para visualizar el resultado del producto de matrices
void visualize(int r1, int c2, int z[r1][c2])
{
    for (int i = 0; i<r1; i++)
    {
        for (int j = 0; j<c2; j++)
        {
            printf("%d ", z[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int r1 = 3;
    int c1 = 2;
    int c2 = 3;

    int m1 [3][2] = {{1,2},{-1,0},{-3,-1}};
    int m2 [2][3] = {{2,0,1},{-5,2,3}};
    int m3 [3][3] = {{0,0,0},{0,0,0},{0,0,0}};

    matrixProduct(r1,c1,c2,m1,m2,m3);
    printf("el producto de las matrices es:\n");
    visualize(r1,c2,m3);

    return 0;
}
