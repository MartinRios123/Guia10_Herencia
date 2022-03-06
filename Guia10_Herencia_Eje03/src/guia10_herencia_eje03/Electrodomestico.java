/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */

package guia10_herencia_eje03;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);;
    
    public Electrodomestico() {
    }
    
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        if (letra < 'A' || letra > 'F') {
            this.consumoEnergetico = 'F';
        }else{
            this.consumoEnergetico = letra;
        }
    }
    
    public void comprobarColor(String color){
        if (!color.equalsIgnoreCase("blanco") && 
            !color.equalsIgnoreCase("negro") && 
            !color.equalsIgnoreCase("rojo") && 
            !color.equalsIgnoreCase("azul") && 
            !color.equalsIgnoreCase("gris")) {
            
            this.color = "blanco";
        }else{
            this.color = color;
        }
    }
    
    public void crearElectrodomestico() {
        this.precio = 1000.00;
        System.out.println("Ingrese el color del electrodomestico: ");
        this.color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese consumo energetico: ");
        this.consumoEnergetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese peso del electrodoméstico: ");
        this.peso = leer.nextDouble();  
    }
    
    public void precioFinal() {
        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio+=100;
        }else if(this.peso > 20 && this.peso <= 49){
            this.precio+=500;
        }else if(this.peso > 50 && this.peso <= 80){
            this.precio+=800;
        }else{
            this.precio+=1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }
    
}