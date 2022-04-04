/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class NewMain {

    public static void main(String[] args) {

        MiniMax_AlphaBeta a = new MiniMax_AlphaBeta();
        char[][] ARRAY = {
            {'X', '*', '*'},
            {'X', 'O', '*'},
            {'*', '*', '*'}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ARRAY[i][j] + " | ");
            }
            System.out.println("");
        }

        Node XOBOARD = new Node(ARRAY);
        int[] aqqq;
        aqqq = MiniMax_AlphaBeta.AI_minimax_AlphaBeta(XOBOARD ,0, Integer.MIN_VALUE, Integer.MAX_VALUE ,true);

        for (int q = 0; q < aqqq.length ; q++) {
            System.out.println("########### " + aqqq[q]);
        }

    }

}
