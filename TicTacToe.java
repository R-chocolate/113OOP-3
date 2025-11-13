public class TicTacToe {

    private char[][] board;  // 3x3 井字盤
    private int moves;       // 已下的步數

    public TicTacToe() {
        board = new char[3][3];
        moves = 0;

        // 初始化盤面
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';  // 空白
            }
        }
    }

    // 設定 O 或 X 到某個位置
    public boolean set(int row, int col, char player) {
        if (player != 'O' && player != 'X') return false;
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        if (board[row][col] != ' ') return false;

        board[row][col] = player;
        moves++;
        return true;
    }

    // 判斷勝負：回傳 O / X / D(平手) / C(繼續)
    public char evaluate() {

        // 判斷橫
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) 
                return board[i][0];
        }

        // 判斷直
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i])
                return board[0][i];
        }

        // 判斷斜
        if (board[0][0] != ' ' &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2])
            return board[0][0];

        if (board[0][2] != ' ' &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0])
            return board[0][2];

        // 判斷平手
        if (moves == 9) return 'D';  // Draw

        // 否則遊戲還沒結束
        return 'C';  // Continue
    }

    // 額外：取得盤面（JUnit 會用）
    public char get(int r, int c) {
        return board[r][c];
    }
}
// update comment






