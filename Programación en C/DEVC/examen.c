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
    char Roman[2] = "IV";
    unsigned int Entero = 0;

    Entero = Roman2Entero(Roman);
    printf("%d", Entero);
    
    return 0;
}

unsigned int Roman2Entero (char * s)
{
	//Calculamos la longitud de la cadena
	int i, j, suma = 0;
	
	while(s[i] != '\0'){
		i++;
	}
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
		//suma += valor[j];
		printf("%d\n", valor[j]);
	}
	
	for(j = 0; j<i;j++){
		if(s[i-(j+1)] == 'I' && s[i-j] == 'V'){
			suma += valor[i-j]-valor[i-(j+1)];
			printf("%c\n", s[i-(j+1)]);
			printf("%d\n", valor[i-(j+1)]);
			printf("%c\n", s[i-j]);
			printf("%d\n", valor[i-j]);
			
		}
		else{
			suma+=valor[j];
		}
		printf("%d\n", suma);
	}
    return i;
}

