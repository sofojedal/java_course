public class EjemploClaseMath {
    public static void main(String[] args) {
        int  absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        // pi - esponente a la 1
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        //Función Logaritmo natural
        // logaritmo natural de 10, toma como base la constante e, es decir el valor 2,71828
        double log = Math.log(10);
        System.out.println("log = " + log);

        //Potencia - 10 elevado 3, 10 elevado a la potencia de 3, 10 multiplicado 3 veces
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        //Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);
        
        // METODOS PARA TRIGONOMETRIA, EJ: PARA CONVERTIR UN ANGULO EN RADIANES A GRADOS 
        double grados = Math.toDegrees(1.57);
        // para redondear el valor
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        // CONVERTIR DE GRADOS A RADIANES
        
        // 90.00 == 90d, d de double
        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        // FUNCIONES DE TRIGONOMETRIA: COS SEN
        // cos y seno de 90 grados, ya que los radianes son de 90 grados
        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90)" + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0);
        System.out.println("cos(0): " + Math.cos(radianes));

        // -----> siguiente clase= ejemplo clase Math.random

        // Metodo random para tomar un valor aleatorio entre 0 y 1, con varios decimales,
        // y esto lo podemos multiplicar por algun valor, redondear y podemos obtener casi cualquier
        // valor aleatorio

    }
}
