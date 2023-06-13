public class crearCuenta {
   public static void main(String[] args) {
      // Crear una instancia de la clase Cuenta
      // instancia 1:primera cuenta
      Cuenta primeraCuenta = new Cuenta();
      primeraCuenta.saldo = 1000;
      System.out.println(primeraCuenta.saldo);
      // instancia 2:segunda cuenta
      Cuenta SegundaCuenta = new Cuenta();
      SegundaCuenta.saldo = 500;
      System.out.println(SegundaCuenta.saldo);
      System.out.println(primeraCuenta.agencia);

   }
}
