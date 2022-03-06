package guia10_herencia_eje04;

import java.util.Locale;
import java.util.Scanner;

public class Circulo implements calculoFormas {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, double perimetro) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCirculo(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio del circulo: ");
        this.radio = leer.nextDouble();
        System.out.printf("El área del circulo es %.2f \n", calcularArea());
        System.out.printf("El perímetro del circulo es %.2f \n", calcularPerimetro());
    }
    
    @Override
    public double calcularArea(){
        return PI * Math.pow(radio,2); 
    }
    
    @Override
     public double calcularPerimetro(){
        return 2 * PI * radio; 
    }
}
