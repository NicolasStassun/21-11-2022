import java.util.Scanner;

    public class Ex6 {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            int matriz[][] = new int[7][8];
            int num=0;

            for(int l=0;l<7;l++){

                for(int c=0;c<8;c++){

                num=l+c;

                matriz[l][c]=num;

                }

            }
            for(int l=0;l<7;l++){

                for(int c=0;c<8;c++){
                    if(c!=7){
                        System.out.printf(matriz[l][c]+" ");
                    }
                    else{
                        System.out.printf(matriz[l][c]+" \n");
                    }


                }

            }


        }


        }


