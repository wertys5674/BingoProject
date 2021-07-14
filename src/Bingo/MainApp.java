package Bingo;

public class MainApp {
    public static void main(String[] args) {
        Board myBoard = new Board();
        myBoard.printBoard(myBoard.myBoard);
        Pick myPick = new Pick();

        for (int i = 0; i < 15; i++) {
            myBoard.putBomb(myPick.pickX(), myPick.pickY());
            myBoard.printBoard(myBoard.myBoard);
        }
    }
}
