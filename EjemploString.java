public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("programación Java");
        boolean esIgual = curso ==curso2;
        //false, porque son dos objetos distintos, instancias.
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        //True, porque se compara por valor.
        System.out.println("esIgual = " + esIgual);

        //Para mayusculas y minusculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);

        //Siempre por el valor, no con ==, osea usar equals()

    }
}
