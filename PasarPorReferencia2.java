class Persona{
    private String nombre;
    // void no retorna nada, solamente modifica el atributo nombre
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}



public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("iniciamos el método main con i = ");
        System.out.println("persona.nombre = " + persona.leerNombre());
        test(persona);
        System.out.println("Después de llamar el metodo test ");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos del arreglo modificados = ");
        // En ese proceso se modifican los datos del arreglo
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
