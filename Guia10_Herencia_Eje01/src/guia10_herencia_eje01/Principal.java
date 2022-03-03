package guia10_herencia_eje01;

public class Principal {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Tomy","dogchow",5,"doberman");
        Perro perro2 = new Perro("Pepito","chow",2,"golden");
        perro1.alimentarse();
        perro2.alimentarse();
        
        Animal gato1 = new Gato("Gordito","gati",4,"mini");
        Gato gato2 = new Gato("Nenita","cat",6,"patita corta");
        gato1.alimentarse();
        gato2.alimentarse();
        
        Animal caballo1 = new Caballo("Tornado","heno",1,"carrera");
        Caballo caballo2 = new Caballo("Tornadito","pasto",7,"de casa");
        caballo1.alimentarse();
        caballo2.alimentarse();
    }
    
}
