package top150;

public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int live = 0;

                for (int k = 0; k < 8; k++) {
                    int ni = i + dx[k], nj = j + dy[k];

                    if (ni >= 0 && nj >= 0 && ni < m && nj < n &&
                            Math.abs(board[ni][nj]) == 1)
                        live++;
                }

                if (board[i][j] == 1 && (live < 2 || live > 3))
                    board[i][j] = -1;

                if (board[i][j] == 0 && live == 3)
                    board[i][j] = 2;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] > 0) board[i][j] = 1;
                else board[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        GameOfLife obj = new GameOfLife();
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        obj.gameOfLife(board);

        for (int[] row : board) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}