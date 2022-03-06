package guia10_herencia_eje02;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, char consumo, Double peso, Integer carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.*/
    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese carga de la lavadora: ");
        this.carga = leer.nextInt();
        precioFinal();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + " carga=" + carga + '}';
    }
    
    
}
