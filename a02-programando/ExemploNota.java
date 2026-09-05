import java.util.Scanner;

public class ExemploNota {

    public static void main(String[] args){
        
        final int TAM = 4;
        Scanner scanner = new Scanner(System.in);
        float total = 0.0f;
        float[] notas = new float[TAM];

        for (int i = 0; i < TAM; i++){
            System.out.print("Digite a nota do aluno: ");
            float nota = scanner.nextFloat();
            total += nota;
            notas[i] = nota;
        }

        float media = total / TAM;

        System.out.println("A nota final do aluno foi: " + media);

        scanner.close();
    }
}