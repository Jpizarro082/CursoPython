#include<stdio.h>

void f(int *, float *);

int main(int argc, char * argv)
{
 int entero;
 float real;

 entero = 22;
 real = 33.3;

 printf("Antes de llamar a f, entero vale %d y real vale %6.2f\n", entero, real);
 f(&entero, &real);
 printf("Después de volver de f, entero vale %d y real vale %6.2f\n", entero, real);

 return 0;
}


void f(int *p, float *q)
{
 printf("Al entrar en f, *p (= entero) vale %d y *q (= real) vale %6.2f\n", *p, *q);

 *p = 7777;
 *q = 12345.67;


 printf("Al salir de f, *p vale %d y *q vale %6.2f\n", *p, *q);
 return;
}
/*
El resultado de ejecutar este programa es el siguiente:


Antes de llamar a f, entero vale 22 y real vale  33.30
Al entrar en f, *p (= entero) vale 22 y *q (= real) vale  33.30
Al salir de f, p vale 7777 y q vale 12345.67
Después de volver de f, entero vale 7777 y real vale 12345.67
*/