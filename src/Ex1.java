import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int mediaPares=0, contPares=0, somaPares=0;

        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                System.out.println("Informe o número de linha: "+l+" e coluna: "+c+" :");

                matriz[l][c] = sc.nextInt();

                if (matriz[l][c]%2==0) {

                    somaPares+=matriz[l][c];
                    contPares++;


                }

            }

        }
        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){
                if(c!=4){
                    System.out.printf(matriz[l][c]+" ");
                }
                else{
                    System.out.printf(matriz[l][c]+" \n");
                }


            }

        }
        mediaPares=somaPares/contPares;
        System.out.println("A média de pares é de: "+mediaPares);
    }

}
