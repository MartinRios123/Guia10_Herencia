package guia10_herencia_eje02;

public class Principal {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        System.out.println("Lavadora: ");
        lavadora.crearLavadora();
        System.out.println(lavadora);
        
        Televisor televisor=new Televisor();
        System.out.println("Televisor: ");
        televisor.crearTelevisor();
        System.out.println(televisor);
    }

}
