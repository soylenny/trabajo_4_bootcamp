public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "David";
        cliente.edad = 19;
        cliente.telefono = 312534316;
        cliente.credito = 50.000;
        System.out.println("mi nombre es " + cliente.nombre + " mi edad es " + cliente.edad + " mi numero de telefono es " + cliente.telefono + " y mi credito es de " + cliente.credito);

       trabajador.nombre = "juan";
       trabajador.edad = 22;
       trabajador.telefono = 313342778;
       trabajador.salario = 30.000;
       System.out.println("(tabajador) mi nombre es " + trabajador.nombre + " tengo " + trabajador.edad + " mi numero es " + trabajador.telefono + " y mi salario es de " + trabajador.salario);

        System.out.println();
    }

}
class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}