package Greedy_Algorithim;
import java.util.*;
public class Max_Length_Chain_of_Pairs {
    public static void main(String arg[]){
        int pairs [][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chainLength = 1;
        int chainEnd = pairs[0][1]; //last selected pair end or chain end

        for(int i = 0;i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain = "+ chainLength);

    }
}
