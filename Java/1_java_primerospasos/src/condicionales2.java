package src;


public class condicionales2 {
    public static void main(String[] args) {
        
        
        //condicionales if else
        int edad = 22;
        int cantidadPersonas = 2;
        boolean enPareja = cantidadPersonas >= 2;
        boolean puedeEntrar = edad >= 18 && enPareja;
        
        //para poder entrar la persona debe ser mayor e ir en pareja
        if (puedeEntrar) {
            System.out.println("usted puede entrar");
        
        } else {
            
            System.out.println("Usued no esta permitido a " + "entrar");
        }
    }
}
