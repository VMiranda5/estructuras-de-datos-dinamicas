//Cree una función recursiva que calcule la sumatoria de todos los números impares de una matriz cuadrada.

#include <stdio.h>

int sumatoria(int n,int i,int j, int size,int a[][n]){
    if (i==0 && j<0){
        return 0;
    }
    else{
        if (i>=0){
            //printf("this is i: %d\n", i);
            if(j>=0){
                if(a[i][j]%2!=0){
                    //printf("this is j: %d\n", j);
                    return a[i][j]+ sumatoria(n,i, j-1,size,a);
                }
                else{
                    return 0 + sumatoria(n,i, j-1,size,a);
                }
            }
            if(a[i-1][size]%2!=0){
                return a[i-1][size]+sumatoria(n,i-1, size-1, size,a);
            }
            else{
                0+sumatoria(n,i-1, size-1, size,a);
            }
        }
    }
}


int main(){
    int matrix[][3]={
        {1, 2, 3},
        {4, 5,6},
        {7, 8, 9}
    };
    int size = 2;
    int n = 3;

    int sum = sumatoria(n,size,size,size,matrix);
    //should be 25
    printf("the sum is: %d\n", sum);

    return 0;
}