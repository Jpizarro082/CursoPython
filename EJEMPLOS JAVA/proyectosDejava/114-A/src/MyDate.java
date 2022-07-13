
public int getDay(){
  return day;
}

public void setDay(int day){
  this.day=day;
}

public int getMonth(){
  return month;
}

public void setMonth(int month){
  this.month=month;
}

public int getYear(){
  return year;
}

}

public class TestMyDate {
    public static void main( String []args){
       My Date md[]= new MyDate[5]; //Declaracion y creacion de renglones
       Scanner sc = new Scanner(System.in);
       int i;
       int d,m,y;
       
       for(i=0;i<md.lenght;i++){
           md[i] = new MyDate(); 
   }
       for(i=0;i<md,lenght; i++){
        System.out.println("Dar dia de nacimiento");
        d = sc.nextInt();
        System.out.println("Dar mes de nacimiento");
        m = sc.nextInt();
        System.out.println("Dar año de nacimiento");
        y = sc.nextInt();
        
       }
       for(i=0;i<md.lenght;i++){
         System.out.println(md[i].getDay()+" "+md[i].getMonth()+" "+md[i].getYear);
       }
    }   
}