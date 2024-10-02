import java.util.Arrays;
import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        // Este metodo es para generar un numero aleatorio, un numero decimal, es decir del tipo double 
        // entre 0 y 1, pero el 1 no es inclusivo, no se incluye 

        // 6 colores que llegan hasta el indice 5
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        System.out.println("random = " + random);
        // random = random * 7, nueva comenclatura
        // ----->     random *= 7;
        //obtenermos el numero de colores hasta el largo, por lo tanto debemos redondear hacia abajo,
        // no hacia arriba, ya que de lo contrario no cogera el último número
        random *= colores.length;
        System.out.println("random = " + random);

        // Redondeando hacia abajo, nunca llega a 7, porque siempre redondeamos hacia abajo
        random = Math.floor(random);
        // Mostrara la posición de los colores
        System.out.println("random = " + random);

        // CAST - de double a un entero   ---->   colores[(int)random]

        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);
        //Para realizar un rango, entre 15 y 25, y el 25 no se incluye, el 15 si, con el +1, si se incluye el 25
        int randomInt1 = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt1 = " + randomInt1);

        //Retorna un long primitivo, long equivale a un número mucho mas amplio
        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        // ¿Como reemplazar el array de los colores?
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("colores = " + colores[randomInt]);


    }
}
