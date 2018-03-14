package Lnitial;

public class BreakSentence {
    int [] numbers = {10, 20, 30, 40, 50};
    public void SeeBreak(){
        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                // break;
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
