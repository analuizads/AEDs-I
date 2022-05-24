import java.util.Random;

public class Questao_4 {

    public static void printArray(int v[]) {

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

    public static int[][] generateRandomMatriz(int m[][]) {

        Random generator = new Random();

        for(int i=0; i<m.length; i++) {
            for(int j = 0; j<m[0].length ; j++){

                m[i][j] = generator.nextInt(50);
            }
        }

        return m;
    }

    public static int[] transformarMatriz(int m[][]){

        int v[] = new int[m.length * m[0].length];
        int i = 0;
        int j = 0;
        int cont = 0;

        for(i=0; i<m.length; i++){
            for(j=0; j<m[0].length; j++){
                v[cont] = m[i][j];
                cont++;
            }
        }
        return v;
    }
    public static int[] ordenarVetor(int v[], int n){
        int i = 0, j = 0;
        int aux;

        for(i=0; i<n; i++){
            for(j=i + 1; j<n; j++) {
                if(v[i] > v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }

        return v;
    }

    public static void main(String[] args){

        int m[][] = new int[3][5];
        m = generateRandomMatriz(m);

        printMatriz(m);

        int n = 15;

        int v[] = new int[n];

        v = transformarMatriz(m);
       
        v = ordenarVetor(v, n);

        System.out.print("O terceiro menor número da matriz é " + v[2]);


    }
    
}
