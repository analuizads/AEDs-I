import java.util.Random;
import java.util.Scanner;
public class Questao_1 {

    static Scanner sc = new Scanner(System.in);


    public static int[] generateRandomArray(int size, int range) {

        Random generator = new Random();
        int vet[] = new int[size];

        for(int j=0; j<vet.length; j++) {

            vet[j] = generator.nextInt(range);
        }

        return vet;

    }

    public static void printArray(int v[]) {

        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.print("\n");

    }

    public static int[] removeIdx(int[] v, int idx){

        int newV[] = new int[v.length];

        for(int a=0; a<v.length; a++) {
            newV[a] = 0;
        }

        int j = 0; 

        for(int i=0; i<v.length; i++){

            if(i != idx) {
                newV[j] = v[i];
                j++;
            }
        }
        return newV;
    }
    public static void main(String[] args){

        int size;

        System.out.print("Entre com o tamanho do vetor: ");
        size = sc.nextInt();

        int v[] = new int[size];
        v = generateRandomArray(size, 60);

        String resp ="s";
        int idx;
        int removed = 0;

        printArray(v);
        
        while ((resp.equals("S")) || (resp.equals("s"))) {

            System.out.print("Qual índice deseja excluir? ");
            idx = sc.nextInt();

            int newV[] = new int[v.length];

            newV = removeIdx(v, idx);

            v = newV;
            removed ++;

            printArray(v);

            if(removed == v.length){
                break;
            }

            System.out.print("Deseja exlxuir mais algum índice? s/n ");
            resp = sc.next();
        }

    }
    
}
