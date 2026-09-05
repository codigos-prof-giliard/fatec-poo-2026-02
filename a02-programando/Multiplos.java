import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++ ){
                int valor = j * i;
                System.out.print(valor+ "   ");
            }
            System.out.println();
        }

        scanner.close();
    }
    
}
