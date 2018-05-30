
public class Empleado {
    private byte horas,genero,horasex;
    private String nombre;
    final double sueldob=70; 
    byte bono; 
    final double impuestos=0.05;
    private double sueldo,pagoextra,deducciones,pagofin;
    
    
    //constructor
    public Empleado(){
       nombre="";
       genero=1;
       horas=0;
       horasex=0;
       pagoextra=0;
               }
       

//set y get horas
public void setNombre(String nombre){
this.nombre=nombre;
}
public String getNombre(){
return nombre;
} 

//set y get horas
public void setHoras(byte horas){
this.horas=horas;
}
public byte getHoras(){
return horas;
} 

//set y get genero
public void setGenero(byte genero){
this.genero=genero;
}
public byte getGenero(){
return genero;
} 
//set y get horas extras
public void setHorasex(byte horasex){
this.horasex=horasex;
}
public byte getHorasex(){
return horasex;
} 
//get sueldo
public double getSueldo(){
    return sueldo;
}//caltot
public double calSueldo(){
sueldo=horas*sueldob;
return sueldo;
                         }
//horasExtras
public double pagoextra(){
return pagoextra;
                         }

public double calPagoextra(){
if(horasex>0){
if(genero==1)//1 es igual a hombre
{
pagoextra=(70*3)*horasex;
}
else{if(genero==2)//2 es igual a hombre
    
pagoextra=(70*2)*horasex;
}
}
else{
    if(horasex==0){pagoextra=0;}
    }
return pagoextra;
}
//bono





}
