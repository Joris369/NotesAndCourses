package src;


public class scope {
    public static void main(String[] args) {
        
        
        //condicionales if else
        int edad = 22;
        int cantidadPersonas = 2;
        boolean enPareja;

        //boolean enPareja = cantidadPersonas > 2;
        if(cantidadPersonas > 1){
            enPareja = true;
        }else{
            enPareja = false;
        }
        
        boolean puedeEntrar = edad >= 18 && enPareja;
        //para poder entrar la persona debe ser mayor e ir en pareja
        if (puedeEntrar) {
            System.out.println("usted puede entrar");
        
        } else {
            
            System.out.println("Usued no esta permitido a " + "entrar");
        }
    }
}
