package org.example;

import uce.ec.edu.dominio.Docente;
import uce.ec.edu.dominio.Estudiante;
import uce.ec.edu.dominio.Lector;

public class Main {
    public static void main (String[] args){

        Lector a =  new Estudiante("E1", "ANA", "AL@UCE.EDU.EC",true,"MAT001");
        Lector b = new Docente("D1", "JUAN", "JU@UCE.EDU.EC", true,"Fica");
        Lector c= new Lector("L1", "luis","LU@UCE.EDU.EC",true);

        Lector d =  new Estudiante("E1", "ANA", "AL@UCE.EDU.EC",true,"MAT001");
        //d=a;
        imprimirFicha(a);
        imprimirFicha(b);
        imprimirFicha(c);

        if (a==d){
            System.out.println("Objetos iguales");
        }else if(a.equals(c)) {
            System.out.println("Equals iguales");
        }
        else {
            System.out.println("Son distintos");
        }


    }
    public static void imprimirFicha(Lector lector){
        System.out.println(lector + "\r\n"+ lector.calcularDiasPrestamo()+"dias: "+ lector.calcularMulta(4, 20) + " Multa: "+
                lector.calcularMulta(10 )+" Multa base");
    }
}