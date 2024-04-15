import java.util.Arrays;

public class CombinationSum {
static void combination_sum(int[] A, int[] B){
    int[][] Sum = new int[6][6];
    System.out.println("All possible combinations:");
    for(int i =0;i<A.length;i++){
        for(int j =0;j<B.length;j++){
            System.out.print("("+(i+1)+","+(j+1)+")"+"\t");
            Sum[i][j]=A[i]+B[j];
        }
        System.out.println();
    }
    print_sum(Sum);
}
static void print_sum(int[][]S){
    System.out.println("Possible Combinations:");
    for(int[] row :S){
    System.out.println(Arrays.toString(row));
    }
}

    public static void main(String[] args) {
        int Die_A[]={1,2,3,4,5,6};
        int Die_B[]={1,2,3,4,5,6};
        combination_sum(Die_A,Die_B);

    }
}
