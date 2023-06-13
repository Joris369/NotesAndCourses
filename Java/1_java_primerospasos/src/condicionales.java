package src;

public class condicionales {
    public static void main(String[] args) {
        
        
        //condicionales if else
        int edad = 12;
        int cantidad = 2;
        if (edad >= 18) {
            System.out.println("usted puede entrar");
        
        } else {
            if(cantidad >= 2){
                System.out.println("puede entrar");
            }else{
                System.out.println("Usued no esta permitido a " + "entrar");
            }
            
        }
    }
}

