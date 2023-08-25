//Cree una función recursiva que reciba un string alfanumérico y que extraiga los dígitos del string y retorne el número formado por todos los dígitos
#include <stdio.h>

int digits(const char *str, int index) {
    if (str[index] == '\0') {
        return 0;
    }

    if (str[index] >= '0' && str[index] <= '9') {
        return (str[index] - '0') + digits(str, index + 1) * 10;
    }

    return digits(str, index + 1);
}

int main() {
    const char *str = "a1b2c3d4e5f6";
    int formedNumber = digits(str, 0);

    printf("Formed Number: %d\n", formedNumber);

    return 0;
}

