import java.lang.reflect.Array;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        
        Scanner tec= new Scanner(System.in);
        String opc;
        String nombre, numero, mail;
        String[] Nombre = new String[259];
        String[] Numero = new String[259];
        String[] Mail = new String[259];

        do {
            System.out.println("--------------------- Agenda ---------------------");
            System.out.println("       ¿Quieres [I]ngresar un nuevo contacto");
            System.out.println("--------------------------------------------------");
            System.out.println("       [C]onsultar un contacto ya existente?");
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("                     [S]alir");


            opc=tec.nextLine();

            switch(opc){
                case "I":
                System.out.println("Ingrese su nombre");
                nombre= tec.next();
                for (int n=0; n<=Array.getLength(Nombre); n++){
                    Nombre[n] = (nombre);
                }
                System.out.println("Ingrese su numero");
                numero= tec.next();
                for (int t=0; t<=Array.getLength(Numero); t++){
                    Numero[t] = (numero);
                }
                System.out.println("Ingrese su mail");
                mail= tec.next();
                for (int m=0; m<=Array.getLength(Mail); m++){
                    Mail[m] = (mail);
                }

                break;

                case "C":
                 System.out.println("Ingrese el nombre a buscar");
                 nombre= tec.nextLine();
                 if(nombre == null) {
                    System.out.println("No existe un contacto con el nombre"+nombre);
                }

                break;

                case "S":


                break;

            }

        }while(true);
                
    }
}
