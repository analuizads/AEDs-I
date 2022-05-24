import java.util.Random;
import java.util.Scanner;

public class Questao_9 {

    public static int[][] generateRandomMatriz(int m[][]) {

        Random generator = new Random();

        for(int i=0; i<m.length; i++) {
            for(int j = 0; j<m[0].length ; j++){

                m[i][j] = generator.nextInt(50);
            }
        }

        return m;
    }

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

    public static void somaMatrizes(int a[][], int b[][]){

        int newM[][] = new int[a.length][a[0].length];
        int i = 0;
        int j = 0;

        for(i=0; i<a.length; i++){
            for(j=0; j<a[0].length; j++){
                newM[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Nova matriz: ");
        printMatriz(newM);
    }

    public static void main(String[] args){

        int a[][] = new int[3][5];
        int b[][] = new int[3][5];

        a = generateRandomMatriz(a);
        b = generateRandomMatriz(b);

        System.out.println("Matriz a: ");
        printMatriz(a);
        System.out.println("Matriz b: ");
        printMatriz(b);

        somaMatrizes(a, b);

    }
}