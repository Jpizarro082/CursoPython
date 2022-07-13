
package testempleado;

import java.util.Scanner;



	class Empleado{
		String nombre;
		String puesto;
		float salario;
		int id;
	}




 class testempleado{
 	public static void main(String args[]){
 		    int numEmpleados;
 		    Scanner sc = new Scanner(System.in);
 		    System.out.println("cuanto empleados hay");
 		    numEmpleados = sc.nextInt();
    		Empleado []e= new  Empleado[numEmpleados];
    		int i;

    		for(i=0;i<numEmpleados;i++){
    		e[i]=new Empleado();
    	        System.out.println("dame el nombre");
    		e[i].nombre = sc.next();
    		System.out.flush();
    		System.out.println("dame el puesto");
    		e[i].puesto= sc.next();
    		System.out.flush();
    		System.out.println("dame el salario");
    	        e[i].salario= sc.nextFloat();
    	        System.out.flush();
    	        System.out.println("dame el id");
    	        e[i].id= sc.nextInt();
    	        System.out.flush();

    		}

    		for(i=0;i<numEmpleados;i++){
     System.out.println(e[i].nombre+" puesto: "+e[i].puesto+" salario:  "+e[i].salario+" id:  "+e[i].id);

    	}
   }
}