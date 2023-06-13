package src;

public class ejercicioMatriz {
    public static void main(String[] args) {
        //numbero de filas
        for(int fila = 0; fila <= 10; fila++){
            for(int columna = 0; columna < fila; columna++){
                
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
