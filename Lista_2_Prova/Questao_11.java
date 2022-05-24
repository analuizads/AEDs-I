import java.util.Random;
import java.util.Scanner;

public class Questao_11 {

    public static void printMatriz(int m[][]) {

        for(int i=0; i<m.length; i++) {
            for(int j = 0; j<m[0].length; j++){
            System.out.print(m[i][j] + " ");
            if(j == m[0].length-1){
                System.out.print("\n");
            }
            }
        }
        System.out.print("\n");
    }

    public static int[][] generateRandomMatriz(int m[][]) {

        Random generator = new Random();

        for(int i=0; i<m.length; i++) {
            for(int j = 0; j<m[0].length ; j++){

                m[i][j] = generator.nextInt(10);
            }
        }

        return m;
    }

    public static int somaDiagonalPrincipal(int m[][]){

        int soma = 0;
        int i = 0;

        for(i = 0; i<m.length; i++){
            soma = m[i][i] + soma;
        }

        return soma;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Entre com o tamanho da matriz quadrada: ");
        n = sc.nextInt();

        int m[][] = new int[n][n];

        m = generateRandomMatriz(m);

        printMatriz(m);

        int somaDiagonal = somaDiagonalPrincipal(m);

        System.out.print("A soma da diagonal principal é " + somaDiagonal);
    }
    
}
