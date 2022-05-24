import java.util.Scanner;

public class Questao_14 {

    public static void printVetor(int v[]) {

        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.print("\n");

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

    public static int[][] geraMatriz(int v[]){

        int m[][] = new int[3][5];
        int i = 0, j = 0;

        for(i=0; i<m.length; i++){
            for(j=0; j<m[0].length; j++){

                if(i == 0){
                    m[i][j] = v[j];
                }
                else if(i == 1){
                    m[i][j] = v[j] + 3;
                }
                else{
                    m[i][j] = m[i-2][j]%m[i-1][j];
                }
            }
        }

        return m;
    }

    public static void main(String[] args){

        Scanner sc = new  Scanner(System.in);

        int v[] = new int[5];

        int i = 0;

        for(i=0; i<v.length; i++){

            System.out.print("Preencha o vetor: ");
            v[i] = sc.nextInt();
        }

        System.out.print("v = ");
        printVetor(v);

        int m[][] = new int[3][5];

        m = geraMatriz(v);

        System.out.println("Matriz resultante: ");
        printMatriz(m);

    }    
    
}
