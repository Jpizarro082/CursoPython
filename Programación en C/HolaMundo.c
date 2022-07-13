#include <stdio.h>
#include <stdlib.h>
// Ejemplo 

int suma(int num1, int num2);

int main() {
    int num1;
    int num2;
    int res;
    printf("Introduzca un numero entero: ");
    scanf("%d", &num1);
    printf("Introduzca un numero entero: ");
    scanf("%d", &num2);
    
    res = suma(num1,num2);
    printf("%d", res);
    return 0;
}


int suma(int num1, int num2){
	return num1+num2;
}
