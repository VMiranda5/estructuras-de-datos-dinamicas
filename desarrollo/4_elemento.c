//4. Cree una función recursiva que reciba una lista, un elemento, y un índice y retorne si el elemento está en la lista dada, en el índice dado

#include <stdio.h>
//puesto que en C no se tiene tipos de datos booleanos, se opta por retornar 0 para False y 1 para True
// ademas, como se debe indicar el tipo de datos que va a almacenar el arreglo (por que no hay listas), se opta por hacer una funcion para cada tipo de arreglo dependiendo del tipo de datos que contenga

int element_in_array_int(int arr[], int element, int index, int size, int i){
    if(i>=size || index>=size){
        return 0;
    }
    else{
        if(arr[i] && i==index){
            return 1;
        }
        else{
            return element_in_array_int(arr,element,index,size,i+1);
        }
    }
}
//si el arreglo es de caracteres (un string)

int element_in_array_char(char arr[], char element, int index, int size, int i){
    if(i>=size || index>=size){
        return 0;
    }
    else{
        if(arr[i] && i==index){
            return 1;
        }
        else{
            return element_in_array_char(arr,element,index,size,i+1);
        }
    }
}

int main(){

    int arr[]={12,23,34,45,56,57,58,90};
    int element = 12;
    int index = 0;
    int size = 8;
    //int i = 0;

    printf("is in it? %d\n",element_in_array_int(arr,element,index,size,0));

    return 0;
}