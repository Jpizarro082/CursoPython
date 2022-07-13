#include <stdio.h>

void cumple(int *);

int main (){

    int edad = 20;    

    printf("Tu edad es %d\n", edad);
    cumple(&edad);
    printf("%d\n", &edad);
    printf("Tu edad es %d", edad);
    return 0;
}

void cumple(int *p){
    printf("%d\n", p);
    *p+=1;
    printf("%d\n", p);
}