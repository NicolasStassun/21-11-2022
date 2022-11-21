import java.util.Random;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][4];

        for(int l=0;l<3;l++){

            for(int c=0;c<4;c++){
                System.out.println("Informe o número ");
                matriz[l][c] = sc.nextInt();
            }

        }
        System.out.println(matriz[0][0]);
        System.out.println(matriz[2][0]);

    }

}
