/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class MiniMax_AlphaBeta {

    public MiniMax_AlphaBeta() {
    }

    public static int[] AI_minimax_AlphaBeta(Node xoBoard, int depth, int alpha, int beta, boolean isMaximizing) {
        // [0]: BestScore | [1]: OptimalMove Row | [2]: OptimalMove Coloumn
        int[] optimal_move = new int[3];
        int bestScore;
        if (isMaximizing) {
            bestScore = -1000;
        } else {
            bestScore = 1000;
        }

        //TERMINAL NODE, WHEN THE STATE OF THE NODE DOES NOT EQUAL 42 (*) => ONLY THEN IT's A WIN,LOSS,DRAW, SO IT's TERMINAL NODE
        //IF TERMINAL NODE => WE RETURN THE ARRAY (OPTIMAL MOVE)=> WHICH CONTAINS : // BestScore | OptimalMove Row | OptimalMove Coloumn
        if (xoBoard.xoStateScore() != (int) '*') {
            bestScore = xoBoard.xoStateScore();
            optimal_move[0] = bestScore;
            return optimal_move;
        }

        //EACH CHILD CONSIDERED TO BE A POSSIBLE STATE, SO EACH EMPTY SQUARE IS A CHILD
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (xoBoard.getIndexMatrix(i, j) == '*') {
                    if (isMaximizing) {
                        xoBoard.setIndexMatrix(i, j, 'O');
                        int score = AI_minimax_AlphaBeta(xoBoard, depth + 1, alpha, beta, false)[0];
                        if (score > bestScore) {
                            bestScore = score - depth * 10;
                            optimal_move[0] = bestScore;
                            optimal_move[1] = i;
                            optimal_move[2] = j;
                            alpha = Math.max(alpha, bestScore);
                            xoBoard.setIndexMatrix(i, j, '*');
                            if (beta <= alpha) {
                                break;
                            }
                        }
                    } else {
                        xoBoard.setIndexMatrix(i, j, 'X');
                        int score = AI_minimax_AlphaBeta(xoBoard, depth + 1, alpha, beta, true)[0];
                        if (score < bestScore) {
                            bestScore = score + depth * 10;
                            optimal_move[0] = bestScore;
                            optimal_move[1] = i;
                            optimal_move[2] = j;
                            beta = Math.min(beta, bestScore);
                            xoBoard.setIndexMatrix(i, j, '*');
                            if (beta <= alpha) {
                                break;
                            }
                        }
                    }
                    xoBoard.setIndexMatrix(i, j, '*');
                }
            }
        }
        return optimal_move;
    }

}
