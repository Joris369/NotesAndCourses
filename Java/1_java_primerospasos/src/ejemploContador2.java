package src;

public class ejemploContador2 {
    public static void main(String[] args) {
        int contador = 0;
        
        int total = 0;
        while(contador<=10){ //imprime la suma total de todos los num.
            
            total = total + contador;
            

            contador++; 
        }
        System.out.println(total); //suma de todos los num de 1 a 10
    }
}
