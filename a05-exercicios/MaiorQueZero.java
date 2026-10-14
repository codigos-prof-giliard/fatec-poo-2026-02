import java.util.Scanner;

public class MaiorQueZero {

    public static void main (String[] args){

        int contador = 0, num = 0;
        double total = 0.0, media = 0.0;

        Scanner scanner = new Scanner(System.in);

        while (num >= 0) {
            System.out.println("Digite o próximo número:");
            num = scanner.nextInt();
            if (num < 0){  break; }
            contador++;
            total += num;
        }

        if (contador > 0 ) {
            media = total / contador;
            System.out.printf("Foram digitados %02d números cuja média é igual a %.3f.", contador, media);
        } else {
            System.out.println("Não foi digitado nenhum número válido.");
        }

        scanner.close();
    }
    
}
