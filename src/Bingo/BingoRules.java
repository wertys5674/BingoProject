package Bingo;

public class BingoRules {
    static int verticalBingo(int x, boolean[][] board) {
            int count = 0;
            for (int y = 0; y < 5; y++) {
                if (board[x][y]==false)
                    break;
                else{
                    count ++;
                    if(bingoComplete(count))
                        return x;
                    else
                        continue;
                }
            }
    }

    static boolean horizontalBingo(int y, boolean[][] board) {
        return true;
    }

    //빙고되면 락걸리는 함수

    private static boolean bingoComplete(int i){
        if(i==5)
            return true;
        else
            return false;
    }
}
