import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int somaLinha =0, somaColuna=0, diagonalPrincipal=0,diagonalSecundaria=0, todosElementos=0;

        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                System.out.println("Informe o número de linha: "+l+" e coluna: "+c+" :");

                matriz[l][c] = sc.nextInt();
                matriz[l][c] += todosElementos;

            }

        }
        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                if(c==2){
                    matriz[l][c]+=somaColuna;
                }

            }

        }
        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                if(c==l){
                    matriz[l][c]+=somaColuna;
                }

            }

        }
        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                if(c==2){
                    matriz[l][c]+=somaColuna;
                }

            }

        }
        for(int l=0;l<5;l++){

            for(int c=0;c<5;c++){

                if((l+c)==4){
                    matriz[l][c]+=diagonalSecundaria;
                }

            }

        }
        System.out.println("Soma linha 4 de M: "+somaLinha);
        System.out.println("Soma coluna 2 de M: "+somaColuna);
        System.out.println("Soma diagonal principal: "+diagonalPrincipal);
        System.out.println("Soma diagonal secundaria: "+diagonalSecundaria);
        System.out.println("Soma todos elementos: "+todosElementos);



    }

}
