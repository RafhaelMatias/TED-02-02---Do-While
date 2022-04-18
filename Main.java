import java.util.Scanner;

        public class Main {
        public static void main (String[] args) {
        Scanner A = new Scanner(System.in);


        int Positivos = 0, Negativos = 0;
        int numero, Lidos = 0, soma = 0;


        do { System.out.print("Informe um numero inteiro (0 para sair): ");
            numero = Integer.parseInt(A.nextLine());

            if(numero > 0){
                Positivos++;
            }
            else if(numero < 0){
                Negativos++;
            }

            soma += numero;

            if(numero != 0){
                Lidos++;
            }
        }
        while(numero != 0);

        if(Lidos == 0){
            System.out.println("Você nao informou nenhum numero.");
        }
        else{
            System.out.println("Quantidade de numeros positivos: " + Positivos);
            System.out.println("Quantidade de numeros negativos: " + Negativos);
            System.out.println("A soma dos numeros lidos: " + soma);
            System.out.println("Media aritmetica: " + ((soma * 1.0) / Lidos));


        }
    }
}
