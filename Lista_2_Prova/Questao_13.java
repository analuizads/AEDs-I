import java.util.Scanner;

public class Questao_13 {

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

    public static void calculaEmelentos(int m[][]){

        int i = 0, j = 0;
        

        for(j = 0; j<m[0].length; j++ ){
            for(i=0; i<m.length-1; i++){

                m[3][j] = m[i][j] + m[3][j];

            }

        }

        System.out.println("A nova matriz preenchida é: ");

        printMatriz(m);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m[][] = new int[4][4];
        int i = 0, j = 0;

        for(i= 0; i<m.length - 1; i++ ){
            for(j=0; j<m.length; j++){

                System.out.print("Preencha a matriz: ");
                m[i][j] = sc.nextInt();

            }
        } 

        printMatriz(m);

        calculaEmelentos(m);
    }
       
}
