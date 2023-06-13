package src;

public class ejCaracteres {
    public static void main(String[] args) {
        
        //char solo acepta un caracter, hay que usar comillas simples para definirlo como char
        char caracter = 'a';
        // los numeros en las variables char hacen referencia al codigo ascii y no al numero escrito
        caracter = 65;
        System.out.println(caracter); //imprime A
        caracter = 65 + 1;
        
        
        char segundoCaracter = (char) (caracter + 1);
        System.out.println(segundoCaracter);

        

    }
}
