public class Methodoverride {

     int id=10;
    String name="kiran";
    String Location="CBE";

     void display(){
        System.out.println(id+" "+name);
    }
        
 }

 class name extends Methodoverride{
   
    void display(){

        System.out.println(id+" "+name+Location);
    }
 }
