import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int cubo=0;

        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                System.out.println("Informe o número de linha: "+l+" e coluna: "+c+" :");

                cubo = sc.nextInt();
                cubo *=cubo;
                matriz[l][c] = cubo;

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

    }

}
