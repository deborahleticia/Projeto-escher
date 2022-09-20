import java.util.Scanner;

public class escher {
public static void main (String[] args){
    Scanner A = new Scanner(System.in);
    int numSeq = A.nextInt();
    int flag = 0;
    if (numSeq % 2 == 0){
        int []seqAlt = new int [numSeq];
          for (int i=0; i<numSeq; i++){
              seqAlt[i] = A.nextInt();
          }
            int somaini = seqAlt[0] + seqAlt[numSeq - 1];
            int somacomp = 0;

                for(int j=1; j<(numSeq * 0.5); j++){
                    somacomp = seqAlt[j] + seqAlt[numSeq-j-1];
                        if (somaini != somacomp){
                            flag = 1;
                        }
                }
                if(flag == 0){
                    System.out.println("S");
                }else 
                    System.out.println("N");
    }else 
    System.out.println("N"); 
}
}
