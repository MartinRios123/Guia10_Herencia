package guia10_herencia_eje03;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        int opcion; 
        String opcion2;
        
        do{
            System.out.println("-----Menu-----");
            System.out.println("1.Crea lavadoras");
            System.out.println("2.Crea televisores");
            System.out.println("3.Precio de los televisores y las lavadoras");
            System.out.println("4.Precio total de todos los electrodomésticos");
            System.out.println("5.Salir");
            System.out.println("Ingrese una opcion:");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    do{    
                        Lavadora lavadora = new Lavadora();
                        lavadora.crearLavadora();
                        electrodomesticos.add(lavadora);
                        System.out.println("Desea crear otra lavadora? S/N");
                        opcion2 = leer.next().toUpperCase();
                    }while(!opcion2.equals("N"));
                    break;
                case 2:
                    do{    
                        Televisor televisor = new Televisor();
                        televisor.crearTelevisor();
                        electrodomesticos.add(televisor);
                        System.out.println("Desea crear otro televisor? S/N");
                        opcion2 = leer.next().toUpperCase();
                    }while(!opcion2.equals("N"));  
                    break;
                case 3:
                    double totalLavadoras = 0;
                    double totalTelevisores = 0;
                    for (Electrodomestico electroDomestico : electrodomesticos) {
                        if (electroDomestico instanceof Lavadora) {
                            totalLavadoras += electroDomestico.precio;
                        }else
                            totalTelevisores += electroDomestico.precio;
                    }
                    System.out.println("Precio total de las lavadoras: "+ totalLavadoras);
                    System.out.println("Precio total de los televisores: "+ totalTelevisores);
                    break;
                case 4:
                    double totalElect = 0;
                    for (Electrodomestico electrodomestico : electrodomesticos) {
                        totalElect += electrodomestico.precio;
                    }
                    System.out.println("Precio total de los electrodomesticos: "+ totalElect);
                    break;
                default:
                    System.out.println("OPCION INCORRECTA.");
            }
        }while(opcion != 5);
    }
}
    

