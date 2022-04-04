/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class AI_AlphaBeta {
    
    private Node copyNode;
    public AI_AlphaBeta() {
    }
    
    public int[] alphabetaAlgorithm_GetIndex(Node xoboard){
        int bestMove = Integer.MIN_VALUE;
        int v;
        int heuristic;
        int a[] = new int[2];
        this.copyNode = new Node(xoboard.getMatrix());
        for(int i=0 ;i<3;i++){
            for(int j=0;j<3;j++){
                if(xoboard.getIndexMatrix(i, j) == '*'){
                    this.copyNode.setIndexMatrix(i, j, 'X');
                    v = AI_miniMax(copyNode, 0, false);
                    //heuristic = copyNode.heuristic(true);
                    //System.out.println("##### "+ v + " ###### " +i+"  "+j +" ### HEURISTIC :: " + heuristic);
                    

                    if(v > bestMove){
                        bestMove = v;
                        a[0] = i;
                        a[1] = j;
                    }
                    this.copyNode.setIndexMatrix(i, j, '*');
                  
                    
                }
            }
        }
        return a;
    }

    private int AI_miniMax(Node copyNode, int depth, boolean maximizingPlayer) {
      //  if( copyNode.xoState() != '*' ){
         //   return copyNode.score(maximizingPlayer);
       // }
        int bestValue;
        if(maximizingPlayer) bestValue = Integer.MIN_VALUE;
        else bestValue = Integer.MAX_VALUE;
        if(maximizingPlayer){
            
            int v;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (copyNode.getIndexMatrix(i, j) == '*') {
                    copyNode.setIndexMatrix(i, j, 'O');
                    v = AI_miniMax(copyNode, 0, false);
                    copyNode.setIndexMatrix(i, j, '*');
                    bestValue = Math.max(bestValue, v);
                    }
                }
          }
          return bestValue;
        }
        else{
            
            int v;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (copyNode.getIndexMatrix(i, j) == '*') {
                    copyNode.setIndexMatrix(i, j, 'X');
                    v = AI_miniMax(copyNode, 0, true);
                    copyNode.setIndexMatrix(i, j, '*');
                    bestValue = Math.min(bestValue, v);
                    }
                }
          }
          return bestValue;            
        }
    }
}