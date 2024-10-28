import java.util.Scanner;

public class SolicitarPalabras{

    public static void main(String[] args){

        var entrada = new Scanner(System.in);

        System.out.print("Por favor introduzca palabra 1: ");
        var palabra1 = entrada.nextLine();

        System.out.print("Por favor introduzca palabra 2: ");
        var palabra2 = entrada.nextLine();
        
        System.out.print("Por favor introduzca palabra 3: ");
        var palabra3 = entrada.nextLine();

        System.out.println(palabra1+" "+palabra2+" "+palabra3);

        //System.out.printf("Introduzca palabra 1: %s%nIntroduzca palabra 2: %s%nIntroduzca palabra 3: %s ","Adiós","y","Hola");

        entrada.close();
    }
}