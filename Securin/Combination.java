import java.util.*;
public class Combination {

    static int no_of_possible_combination(int a, int b){
        return a*b;

    }
    public static void main(String[] args) {
        int Die_A[]={1,2,3,4,5,6};
        int Die_B[]={1,2,3,4,5,6};
        System.out.println("Total Combinations:\t"+no_of_possible_combination(Die_A.length, Die_B.length));
    }

}
