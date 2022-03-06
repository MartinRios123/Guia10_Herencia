package guia10_herencia_eje04;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo implements calculoFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = leer.nextDouble();
        System.out.printf("El área del rectangulo es %.2f \n", calcularArea());
        System.out.printf("El perímetro del rectangulo es %.2f \n", calcularPerimetro());
    }
    
    @Override
    public double calcularArea(){
        return base * altura;    
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
    
    
}

