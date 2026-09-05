import java.util.Scanner;

public class Programa {
    
    /*
    Método estático não depende de um objeto
    */
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in); 

        // Como se instância um objeto:
        // Funcionario funcionario = new Funcionario("Daniel Zanchetta", "000.000.000-00");

        // Como se instancia um array de objetos;
        Funcionario[] funcionarios = new Funcionario[3];

        for(int i=0; i < funcionarios.length ; i++){
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o cpf: ");
            String cpf = scanner.nextLine();
            
            // Para cada posição é necessário instanciar o nosso objeto;
            funcionarios[i] = new Funcionario(nome, cpf);
        }

        System.out.println("\nExibindo a lista de funcionários\n\n");
        for (int i =0; i < funcionarios.length; i++){
            System.out.println(funcionarios[i].toString().toUpperCase());
        }

        scanner.close();
    }
}
