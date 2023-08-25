//Cree una función no recursiva que invierta solo la mitad de un string (la segunda mitad). Para encontrar la mitad se hace con módulo para que la división sea entera.

#include <stdio.h>


void inverted_str(char *str){
    int size=0;
    while(str[size]!='\0'){
        size++;
    }

    int start = (size-1)/2;
    int limit = size-1;
    int new_value = 0;
    int left_bound = start;

    for(int i =0;i<=(start/2);i++){
        new_value = str[left_bound];
        str[left_bound] = str[limit];
        str[limit] = new_value;
        limit --;
        left_bound++;
    }
}

int main(){
    char str[]="this is working perfectly";
    printf("%s\n", str);
    inverted_str(str);
    printf("with the inverted last half: %s\n",str);

    return 0;  

}