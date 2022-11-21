import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int menorValor=0, menorL=0, menorC=0;

        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                System.out.println("Informe o número de linha: "+l+" e coluna: "+c+" :");

                matriz[l][c] = sc.nextInt();
                if(matriz[l][c]>menorValor){

                    menorValor=matriz[l][c];
                    menorL=l;
                    menorC=c;

                }

            }

        }
    }

}
