package entidades;

public class NegroRojo {

    private static final int[] ROJOS = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    private static final int[] NEGROS = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

    public static String obtenerColor(int numero) {
        if (numero == 0) {
            return "Verde";
        }
        for (int rojo : ROJOS) {
            if (rojo == numero) {
                return "Rojo";
            }
        }
        for (int negro : NEGROS) {
            if (negro == numero) {
                return "Negro";
            }
        }
        return "Desconocido";
    }

    public static boolean esRojoSecuencial(int numero) {
        for (int i = 0; i < ROJOS.length; i++) {
            if (ROJOS[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static boolean esNegroBinario(int numero) {
        int izq, der, central;
        izq = 0;
        der = NEGROS.length - 1;
        
        while(izq <= der){
            central = (izq + der)/2;
            if (numero == NEGROS[central]) {
                return true;
            }else{
                if (numero > NEGROS[central]) {
                    izq = central + 1;
                }else{
                    der = central - 1;
                }
            }
        }
        return false;
    }
}
