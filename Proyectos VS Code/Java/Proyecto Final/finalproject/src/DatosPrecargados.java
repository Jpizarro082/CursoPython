public class DatosPrecargados {

    public Object[][] datosPrecargados(){
        String nombreaux;
        double prizeaux;
        int exisaux;
        int k = 1;
        double vti;
    
        NOMBREP[][] nombreP = new NOMBREP[10][10];
        PRECIOP[][] precioP = new PRECIOP[10][10];
        EXISTENCIAP[][] existP = new EXISTENCIAP[10][10];
      
        for (int i = 0; i<10; i++){
          for (int j = 0; j<10; j++){
            nombreaux = "tortas"+k;
            prizeaux = (i*k+Double.valueOf(j))/k;
            exisaux = i+j+1;
    
            NOMBREP nombrep2 = new NOMBREP();
            PRECIOP preciop2 = new PRECIOP();
            EXISTENCIAP existp2 = new EXISTENCIAP();
    
            nombrep2.setNombre(nombreaux);
            preciop2.setPRIZE(prizeaux);
            existp2.setEXIS(exisaux);
    
            nombreP[i][j] = nombrep2;
            precioP[i][j] = preciop2;
            existP[i][j] = existp2;
            k++;
          }
        }
        Object[][] productos = new Object[100][4];
        k = 0;
        for (int i = 0; i<10; i++){
          for (int j = 0; j<10; j++){
            nombreaux = nombreP[i][j].getNombre();
            Object productoaux = "";
            productoaux = nombreaux;
            productos[k][0] = productoaux;
            k++;
          }
        }
        k = 0;
        for (int i = 0; i<10; i++){
          for (int j = 0; j<10; j++){
            prizeaux = precioP[i][j].getPRIZE();
            Object productoaux;
            productoaux = prizeaux;
            productos[k][1] = productoaux;
            k++;
          }
        }
        k = 0;
        for (int i = 0; i<10; i++){
          for (int j = 0; j<10; j++){
            exisaux = existP[i][j].getEXIS();
            Object productoaux;
            productoaux = exisaux;
            productos[k][2] = productoaux;
            k++;
          }
        }
        k = 0;
        for (int i = 0; i<10; i++){
          for (int j = 0; j<10; j++){
            prizeaux = precioP[i][j].getPRIZE();
            exisaux = existP[i][j].getEXIS();
            vti = prizeaux*exisaux;
            Object productoaux;
            productoaux = vti;
            productos[k][3] = productoaux;
            k++;
          }
        }
        return productos;
    }
}
