import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        String menu = """
                *****************************************
                ¡Bienvenido/a al Conversor de Monedas!
                
                1 - Dolar --> Peso argentino
                2 - Peso argentino --> Dolar
                3 - Dolar --> Real brasileño
                4 - Real brasileño --> Dolar
                5 - Dolar --> Peso colombiano
                6 - Peso colombiano --> Dolar
                7 - Salir
                
                Elija una opcion tecleando un numero: 
                *****************************************
                """ ;

        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ConsultaDeMoneda consultaOpc1 = new ConsultaDeMoneda();
                    System.out.println("Ingrese el monto a convertir: ");
                    float valorMonedaUA = teclado.nextFloat();

                    try {
                        Moneda monedaUA = consultaOpc1.buscaMoneda("USD", "ARS",  valorMonedaUA);
                        GeneradorDeArchivo generador = new GeneradorDeArchivo();
                        generador.guardarJson(monedaUA);
                        System.out.println("La conversion es de: " + monedaUA.conversion_result());
                    }catch (Exception e){
                        System.out.println("Unexpected Error");
                    }

                    break;
                case 2:
                    ConsultaDeMoneda consultaOpc2 = new ConsultaDeMoneda();
                    System.out.println("Ingrese el monto a convertir: ");
                    float valorMonedaAU = teclado.nextFloat();

                    try {
                        Moneda monedaAU = consultaOpc2.buscaMoneda("ARS", "USD",  valorMonedaAU);
                        GeneradorDeArchivo generador = new GeneradorDeArchivo();
                        generador.guardarJson(monedaAU);
                        System.out.println("La conversion es de: " + monedaAU.conversion_result());
                    }catch (Exception e){
                        System.out.println("Unexpected Error");
                    }

                    break;
                case 3:
                    ConsultaDeMoneda consultaOpc3 = new ConsultaDeMoneda();
                    System.out.println("Ingrese el monto a convertir: ");
                    float valorMonedaUB = teclado.nextFloat();

                    try {
                        Moneda monedaUB = consultaOpc3.buscaMoneda("USD", "BRL",  valorMonedaUB);
                        GeneradorDeArchivo generador = new GeneradorDeArchivo();
                        generador.guardarJson(monedaUB);
                        System.out.println("La conversion es de: " + monedaUB.conversion_result());
                    }catch (Exception e){
                        System.out.println("Unexpected Error");
                    }

                    break;
                case 4:
                    ConsultaDeMoneda consultaOpc4 = new ConsultaDeMoneda();
                    System.out.println("Ingrese el monto a convertir: ");
                    float valorMonedaBU = teclado.nextFloat();

                    try {
                        Moneda monedaBU = consultaOpc4.buscaMoneda("BRL", "USD",  valorMonedaBU);
                        GeneradorDeArchivo generador = new GeneradorDeArchivo();
                        generador.guardarJson(monedaBU);
                        System.out.println("La conversion es de: " + monedaBU.conversion_result());
                    }catch (Exception e){
                        System.out.println("Unexpected Error");
                    }

                    break;
                case 5:
                    ConsultaDeMoneda consultaOpc5 = new ConsultaDeMoneda();
                    System.out.println("Ingrese el monto a convertir: ");
                    float valorMonedaUC = teclado.nextFloat();

                    try {
                        Moneda monedaUC = consultaOpc5.buscaMoneda("USD", "COP",  valorMonedaUC);
                        GeneradorDeArchivo generador = new GeneradorDeArchivo();
                        generador.guardarJson(monedaUC);
                        System.out.println("La conversion es de: " + monedaUC.conversion_result());
                    }catch (Exception e){
                        System.out.println("Unexpected Error");
                    }

                    break;
                case 6:
                    ConsultaDeMoneda consultaOpc6 = new ConsultaDeMoneda();
                    System.out.println("Ingrese el monto a convertir: ");
                    float valorMonedaCU = teclado.nextFloat();

                    try {
                        Moneda monedaCU = consultaOpc6.buscaMoneda("COP", "USD",  valorMonedaCU);
                        System.out.println(monedaCU);
                        GeneradorDeArchivo generador = new GeneradorDeArchivo();
                        generador.guardarJson(monedaCU);
                        System.out.println("La conversion es de: " + monedaCU.conversion_result());
                    }catch (Exception e){
                        System.out.println("Unexpected Error");
                    }

                    break;
                case 7:
                    System.out.println("Gracias por usar nuestros servicios!!!");
                break;
                default:
                    System.out.println("Opcion Invalida");
            }

        }

    }
}