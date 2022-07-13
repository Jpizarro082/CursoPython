
package midia;
import java.util.Scanner;

class MyDate{//no puede llevar public
    	int day;
    	int month;
    	int year;
    	public MyDate(int day, int month, int year){//constructor
    		this.day=day;
    		this.month=month;
    		this.year = year;
    	}
    }



    int buscar(MyDate md[], int m){
        int i,ind= -1;
        for(i=0;i<md.length;i++){
            if(m == md[i].month){
                ind=i;
                i=md.length;
            }
        }
        return ind;
    }

public class MiDia {
      
    public static void main(String []args){
    	MyDate dates[]= {new MyDate(7,7,1968),
    	                 new MyDate(22,8,1976),
    	                 new MyDate(5,7,2004),
    	                };
    	int i,ind,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el mes a buscar");
        m=sc.nextInt();
        ind=dates[0].buscar(dates,m);
        if(ind==-1){
        System.out.println("No se encontro el mes");
        }
        else{
         System.out.println(dates[ind].day);
         System.out.println(dates[ind].month);
         System.out.println(dates[ind].year);
        }
        
       /* for(i=0; i<dates.length;i++){
        	System.out.println(dates[i].day+" "+dates[i].month+" "+dates[i].year);*/
        }
    }
    

