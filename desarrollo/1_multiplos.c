//Cree una función recursiva que reciba un número entero y retorne cuantos dígitos de este número son múltiplos de 2 y de 4. La única restricción es que el cero no se tiene en cuenta
#include <stdio.h>

int multiplo_2_4(int num){

    static int cont =0;

    if(num==0){
        return cont;
    }
    else{
        int residuo = num%10;
        if(residuo !=0){
            if(residuo%2==0 && residuo%4==0){
                cont++;
            }
        }
        return multiplo_2_4((num-residuo)/10);
        
    }
}
    

int main() {
    int num = 10234448;
    printf("multiplos de 2 y 4 en %d: %d\n", num, multiplo_2_4(num));

    return 0;
}