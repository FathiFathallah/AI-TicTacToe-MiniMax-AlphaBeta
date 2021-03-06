
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame implements ActionListener {

    private Node xoBoard;
    private boolean playerTurn;

    public NewJFrame() {
        initComponents();
        this.xoBoard = new Node();
        this.clearButtons();
        this.playerTurn = true;

        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);
        this.jButton7.addActionListener(this);
        this.jButton8.addActionListener(this);
        this.jButton9.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton1.setText("X");

        jButton6.setBackground(new java.awt.Color(153, 255, 153));
        jButton6.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton6.setText("X");

        jButton9.setBackground(new java.awt.Color(153, 255, 153));
        jButton9.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton9.setText("X");

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton5.setText("X");

        jButton8.setBackground(new java.awt.Color(153, 255, 153));
        jButton8.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton8.setText("X");

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton3.setText("X");

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton2.setText("X");

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton4.setText("X");

        jButton7.setBackground(new java.awt.Color(153, 255, 153));
        jButton7.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jButton7.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel2.setText("Computer:");

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel3.setText("X");

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel4.setText("O");

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel5.setText("PLAYER:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearButtons() {
        this.jButton1.setText("");
        this.jButton2.setText("");
        this.jButton3.setText("");
        this.jButton4.setText("");
        this.jButton5.setText("");
        this.jButton6.setText("");
        this.jButton7.setText("");
        this.jButton8.setText("");
        this.jButton9.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    public void AI_minimaxAlphaBeta(Node xoBoard) {
        int[] indexAI = MiniMax_AlphaBeta.AI_minimax_AlphaBeta(xoBoard, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        int row = indexAI[1];
        int coloumn = indexAI[2];
        AI_setBoard(row, coloumn);
        if (this.gameChecker(this.xoBoard.xoStateScore()));
        this.playerTurn = true;
        this.xoBoard.printXO();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public boolean gameChecker(int resultMark) {
        boolean gameFinished = false;
        if (resultMark == 1000) {
            JOptionPane.showMessageDialog(NewJFrame.this, "you have lost to artificial intelligence! :)".toUpperCase());
            gameFinished = true;
        } else if (resultMark == -1000) {
            JOptionPane.showMessageDialog(NewJFrame.this, "you have beaten the artificial intelligence! :)".toUpperCase());
            gameFinished = true;
        } else if (resultMark == 0) {
            JOptionPane.showMessageDialog(NewJFrame.this, "draw! :)".toUpperCase());
            gameFinished = true;
        }
        
        if (gameFinished) {
            xoBoard.clearBoard();
            this.clearButtons();
            this.playerTurn = true;
        }
        return gameFinished;
    }

    public void AI_setBoard(int row, int coloumn) {
        if (row == 0 && coloumn == 0) {
            if (this.jButton1.getText().equals("")) {
                this.jButton1.setText("O");
                this.xoBoard.setIndexMatrix(0, 0, 'O');
            }
        } else if (row == 0 && coloumn == 1) {
            if (this.jButton2.getText().equals("")) {
                this.jButton2.setText("O");
                this.xoBoard.setIndexMatrix(0, 1, 'O');
            }
        } else if (row == 0 && coloumn == 2) {
            if (this.jButton3.getText().equals("")) {
                this.jButton3.setText("O");
                this.xoBoard.setIndexMatrix(0, 2, 'O');
            }
        } else if (row == 1 && coloumn == 0) {
            if (this.jButton4.getText().equals("")) {
                this.jButton4.setText("O");
                this.xoBoard.setIndexMatrix(1, 0, 'O');
            }
        } else if (row == 1 && coloumn == 1) {
            if (this.jButton5.getText().equals("")) {
                this.jButton5.setText("O");
                this.xoBoard.setIndexMatrix(1, 1, 'O');
            }
        } else if (row == 1 && coloumn == 2) {
            if (this.jButton6.getText().equals("")) {
                this.jButton6.setText("O");
                this.xoBoard.setIndexMatrix(1, 2, 'O');
            }
        } else if (row == 2 && coloumn == 0) {
            if (this.jButton7.getText().equals("")) {
                this.jButton7.setText("O");
                this.xoBoard.setIndexMatrix(2, 0, 'O');
            }
        } else if (row == 2 && coloumn == 1) {
            if (this.jButton8.getText().equals("")) {
                this.jButton8.setText("O");
                this.xoBoard.setIndexMatrix(2, 1, 'O');
            }
        } else if (this.jButton9.getText().equals("")) {
            this.jButton9.setText("O");
            this.xoBoard.setIndexMatrix(2, 2, 'O');
        }
    }

    //This is the handler for the jButtons, It calls the xoState 
    //if the game was WIN / LOSS then we stop it, otherwise we call the AI function
    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.playerTurn) {
            if (e.getSource() == jButton1) {
                if (this.jButton1.getText().equals("")) {
                    this.jButton1.setText("X");
                    this.playerTurn = !this.playerTurn;
                    this.xoBoard.setIndexMatrix(0, 0, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            } else if (e.getSource() == jButton2) {
                if (this.jButton2.getText().equals("")) {
                    this.jButton2.setText("X");
                    this.playerTurn = !this.playerTurn;
                    this.xoBoard.setIndexMatrix(0, 1, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            } else if (e.getSource() == jButton3) {
                if (this.jButton3.getText().equals("")) {
                    this.jButton3.setText("X");
                    this.playerTurn = !this.playerTurn;
                    this.xoBoard.setIndexMatrix(0, 2, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            } else if (e.getSource() == jButton4) {
                if (this.jButton4.getText().equals("")) {
                    this.jButton4.setText("X");
                    this.playerTurn = !this.playerTurn;
                    this.xoBoard.setIndexMatrix(1, 0, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }

                }
            } else if (e.getSource() == jButton5) {
                if (this.jButton5.getText().equals("")) {
                    this.jButton5.setText("X");
                    this.playerTurn = !this.playerTurn;
                    this.xoBoard.setIndexMatrix(1, 1, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            } else if (e.getSource() == jButton6) {
                if (this.jButton6.getText().equals("")) {
                    this.jButton6.setText("X");
                    this.playerTurn = !this.playerTurn;
                    this.xoBoard.setIndexMatrix(1, 2, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            } else if (e.getSource() == jButton7) {
                if (this.jButton7.getText().equals("")) {
                    this.jButton7.setText("X");
                    this.playerTurn = !this.playerTurn;
                    this.xoBoard.setIndexMatrix(2, 0, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            } else if (e.getSource() == jButton8) {
                if (this.jButton8.getText().equals("")) {
                    this.jButton8.setText("X");
                    this.xoBoard.setIndexMatrix(2, 1, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            } else {
                if (this.jButton9.getText().equals("")) {
                    this.jButton9.setText("X");
                    this.xoBoard.setIndexMatrix(2, 2, 'X');
                    if (!this.gameChecker(this.xoBoard.xoStateScore())) {
                        AI_minimaxAlphaBeta(xoBoard);
                    }
                }
            }

        }
    }
}
