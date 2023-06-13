package src;
public class TipoVariable {
public static void main(String[] args){
    System.out.println("Hola mundo");
    //Variable int
    int edad = 28;
    System.out.println(edad);
    edad = 47;
    System.out.println(edad);
    //String y suma
    edad = 46 + 20;
    System.out.println("mi edad es " + edad);

    //variable double
    double salario = 1250.56;
    System.out.println(" salario: " + salario);
    //division
    
    edad = 28;
    double salarioMitad = salario / 2;
    System.out.println(salarioMitad);

    //conversiones
    double variable2 = 230.89;
    // cast: se encarga de forzar una variable a cambiar a otr tipo de dato
    int variableEntero = (int) variable2; //cast
    System.out.println(variableEntero);

}    
}
