public class Node {
    private char[][] matrix;
    
    public Node(){
        this.matrix = new char[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                this.matrix[i][j] = '*';
    }
    
    public Node(char[][] matrix){
        this.matrix = matrix;
    }
    
    public void setMatrix(char[][] matrix){
        this.matrix = matrix;
    }

    public char[][] getMatrix(){
        return matrix;
    }
    
    public char getIndexMatrix(int row, int coloumn){
        return (this.matrix[row][coloumn]);
    }
    
    public void setIndexMatrix(int row, int coloumn, char value){
        this.matrix[row][coloumn] = value;
    }
    
    public void clearBoard(){
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                this.matrix[i][j] = '*';
    }
    
    //This Function will print the X-O Board to the console
    public void printXO() {
        System.out.println(this.matrix[0][0] + " | " + this.matrix[0][1] + " | " + this.matrix[0][2]);
        System.out.println(this.matrix[1][0] + " | " + this.matrix[1][1] + " | " + this.matrix[1][2]);
        System.out.println(this.matrix[2][0] + " | " + this.matrix[2][1] + " | " + this.matrix[2][2]);
        System.out.println("=================================");
    }
    
   //This Function will search for the winner and it will return INTEGER based on the winner
    //WE WANT THE AI TO BE THE WINNER, SO WHENEVER THE WINNER IS 'O' which is AI, it will return the score of WIN = 1000
    public int xoStateScore(){ 
        char winnerMark = '*';
        for (int i = 0; i < 3; i++) {
          if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
            winnerMark = matrix[i][0];
          }
        }
        
        for (int i = 0; i < 3; i++) {
          if (matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i]) {
            winnerMark = matrix[0][i];
          }
        }
        
        if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) 
            winnerMark = matrix[0][0];
 
        if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) 
            winnerMark = matrix[0][2]; 
        
        
        
        int emptyPlaces = 0;
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            if (matrix[i][j] == '*') {
              emptyPlaces++;
            }
          }
        }

        if(winnerMark == 'O') return 1000;
        if(winnerMark == 'X') return -1000;
        if (winnerMark == '*' && emptyPlaces == 0) {
          return 0;
        }
        
        return (int) winnerMark;
    }
}
