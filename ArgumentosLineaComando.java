public class ArgumentosLineaComando {
    public static void main(String[] args) {

        //siempre el indice compienza en 0, mientras sea menos que el largo
        // . length
        // incrementamos

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1);
        }

        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos Nº= " + i + ":" + args[i]);
        }

    }
}

// Recordar los comando del terminal y correrlo desde alli
