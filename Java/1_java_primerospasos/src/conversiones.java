package src;
public class conversiones {
    public static void main(String[] args) {
        //double: datos decimales
        double varDouble = 230.44;
        int varInt = (int) varDouble;
        //long: tipo de dato que soporta mas numeros
        long prueba = 1222222222222222222L;
        //short: soporta menos numeros que long
        short varShort = 12222;
        //byte: es el que menos numeros soporta
        byte NumByte = 122;
        //float: parecido a double pero soporta menos numeros
        float numFloat = 2.5F;

        int resultado = (int) varDouble + varInt;

        System.out.println(resultado);
    }
}
