/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

unsigned int Roman2Entero (char * s);

int main()
{
    char Roman[] = "DCCXXIV";
    unsigned int Entero = 0;

    Entero = Roman2Entero(Roman);
    printf("El numero ingresado es %d en lenguaje decimal", Entero);
    
    return 0;
}

unsigned int Roman2Entero (char * s)
{
	//Calculamos la longitud de la cadena
	int i = 0;
	int j = 0;
	int suma = 0;
	
	while(s[i] != '\0'){
		i++;
	}
	//Asignamos los "pesos" de las letras
	int valor[i];
	for(j = 0; j<i; j++){
		switch(s[j]){
			case 'I': valor[j] = 1;
			break;
			case 'V': valor[j] = 5;
			break;
			case 'X': valor[j] = 10;
			break;
			case 'L': valor[j] = 50;
			break;
			case 'C': valor[j] = 100;
			break;
			case 'D': valor[j]= 500;
			break;
			case 'M': valor[j]= 1000;
			break;
			default: break;			
		}
	}
	//Iniciamos la suma
	int k = 0;
	for(k = 0; k<i; k++){
		//Cuando el siguiente caracter sea fin de cadena, suma el actual y finaliza
		if(s[k+1] == '\0'){
			suma += valor[k];
			break;
		}
		//Cuando el siguiente caracter sea menor que el actual, la suma de pesos continua
		else if(valor[k]>=valor[k+1]){
			suma+=valor[k];
		}
		//Cuando el siguiente caracter sea mayor que el actual, se resta su peso
		else if(valor[k]<=valor[k+1]){
			suma -= valor[k];
		}
	}
	return suma;
}

