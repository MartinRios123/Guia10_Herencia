
package guia10_herencia_eje03;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean sintonizadorTdt;

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, boolean sintonizadorTdt, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return sintonizadorTdt;
    }

    public void setTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese resolucion del televisor en pulgadas: ");
        this.resolucion = leer.nextInt();
        System.out.println("Ingrese true/false si posee sintonizadorTdt : ");
        this.sintonizadorTdt = leer.nextBoolean();
        precioFinal();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio = this.precio * 0.3;
        }
        if (sintonizadorTdt) {
            this.precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + " resolucion=" + resolucion + " sintonizadorTdt=" + sintonizadorTdt + '}';
    }
    
    
}