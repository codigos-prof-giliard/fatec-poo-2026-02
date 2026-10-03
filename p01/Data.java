
public class Data{
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // public static boolean anoBissexto(int ano){
    //     if ((ano % 4 == 0) && (ano % 100 != 0)){
    //         return true;
    //     } else if (ano % 400 == 0) {
    //         return true;
    //     }
    //     return false;
    // }

    public static boolean anoBissexto(int ano){
        return ((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0);
    }

    public static  int quantidadeDiaMes(int mes, int ano){
        if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            return 30;
        } else if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)){
            return 31;
        } else if (mes == 2){
            if (anoBissexto(ano)){
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    public boolean validaData(){
        if (this.ano < 1900){
            return false;
        }
        int diasMes = quantidadeDiaMes(this.mes, this.ano);
        return (1 <= this.dia) && (this.dia <= diasMes);
    }

    public String formatoPorExtenso(){
        if (!this.validaData()){
            return "data inválida";
        }
        String s;
        switch (this.mes) {
            case 1:
                s = "janeiro";
                break;
            case 2:
                s = "fevereiro";
                break;
            case 3:
                s = "março";
                break;
            case 4:
                s = "abril";
                break;
            case 5:
                s = "maio";
                break;
            case 6:
                s = "junho";
                break;
            case 7:
                s = "julho";
                break;
            case 8:
                s = "agosto";
                break;
            case 9:
                s = "setembro";
                break;
            case 10:
                s = "outubro";
                break;
            case 11:
                s = "novembro";
                break;
            case 12:
                s = "dezembro";
                break;
            default:
                s = "erro imprevisto";
                break;
        }

        return String.format("%02d de %s de %4d", this.dia, s, this.ano);
    }
}