package guia10_herencia_eje01;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void alimentarse(){
        System.out.println(super.getNombre()+ " se alimenta de: " + super.getAlimento());
    }
}
