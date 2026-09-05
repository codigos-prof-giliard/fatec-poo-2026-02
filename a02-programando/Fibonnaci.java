import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args){
        int n; // numero da sequência;
        long anterior = 1, atual = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o índice da sequência: ");
        n = scanner.nextInt();

        if ( n < 0 ) {
            System.out.println("Olha eu aqui!!!");
            System.exit(0);
        }
        
        if (n > 2){
            long tmp;
            for (int i = 2; i < n; i++){
                tmp = atual;
                atual = atual + anterior;
                anterior = tmp;
            }
        }

        System.out.println("O " + n +"º número da sequência de Fibonnaci é " + atual);
        scanner.close();
    }
}