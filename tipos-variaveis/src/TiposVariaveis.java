import java.util.Locale;
import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {
        
        //tipos primitivos
        //estudem a classe Sting que re presenta texto na aplicacao
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Seja bem vindo: " + nome);





        
        double salarioMinimo = 2500;
        long cpf = 54722569843L;
        float pi = 3.14F;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; // Erro 

        int numero = 5; //variavel comum
        numero = 12; // pode ter seu valor alterado depois sem probelmas

        final double PI = 3.14;
        //PI = 3.12; erro, constantes não podem ter valor alterado depois de declarada



    }
}
