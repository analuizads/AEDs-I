import java.util.Random;
import java.util.Scanner;

public class Questao_10 {

    public static String verificaIgualdade(int a[][], int b[][]){

        if(a.length != b.length){
            System.out.print("As matrizes são diferentes!");

        }

        int i = 0, j = 0;
        String retorno = " ";

            for(i=0; i<a.length; i++ ){
                for(j=0; j<a[0].length; j++){
                    if(a[i][j] != b[i][j]){
                        retorno = "As matrizes são diferentes.";
                        return retorno;
                    }
                    
                }
            }

            retorno = "As matrizes são iguais.";
            return retorno;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1, m1, n2, m2;

        System.out.print("Entre com a quantidade de linhas da matriz a:");
        n1 = sc.nextInt();
        System.out.print("Entre com a quantidade de colunas da matriz a:");
        m1 = sc.nextInt();

        System.out.print("Entre com a quantidade de linhas da matriz b:");
        n2 = sc.nextInt();
        System.out.print("Entre com a quantidade de colunas da matriz b:");
        m2 = sc.nextInt();

        int a[][] = new int[n1][m1];
        int b[][] = new int[n2][m2];

        int i = 0, j = 0;

        for(i=0; i<a.length; i++){
            for(j=0; j<a[0].length; j++){
                System.out.print("Preencha a matriz a:");
                a[i][j] = sc.nextInt();
            }
        }

        for(i=0; i<a.length; i++){
            for(j=0; j<a[0].length; j++){
                System.out.print("Preencha a matriz b:");
                b[i][j] = sc.nextInt();
            }
        }

        String retorno = verificaIgualdade(a, b);

        System.out.print(retorno);

    }
    
}
