public class Probablity {
    static int no_of_possible_combination(int a, int b){
        return a*b;

    }
    static void Probablity_of_sum(int []A, int[]B){
        int total_combination = no_of_possible_combination(A.length, B.length);
        for(int i =2;i<=12;i++){
            int count=0;
            for(int j =0;j<A.length;j++){
                for(int k =0;k<B.length;k++){
                    if(i==A[j]+B[k]){
                        count++;
                    }
                }
            }
            double occurence=(double) count/total_combination;
            System.out.printf("P(Sum= " +"%d"+ ")"+"%.4f",i,occurence);
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int Die_A[]={1,2,3,4,5,6};
        int Die_B[]={1,2,3,4,5,6};
        Probablity_of_sum(Die_A, Die_B);
    }
}
