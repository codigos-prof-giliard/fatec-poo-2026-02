import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data[] datas = new Data[3];
        for (int i=0; i < datas.length; i++){
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            int ano = scanner.nextInt();
            datas[i] = new Data(dia, mes, ano);
        }
        for (int i=0; i < datas.length; i++){
            System.out.println(datas[i].formatoPorExtenso());
        }
        scanner.close();
    }
}
