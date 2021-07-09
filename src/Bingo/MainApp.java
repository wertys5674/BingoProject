package Bingo;

public class MainApp {
    public static void main(String[] args) {
        Board myBoard = new Board();
        Pick myPick = new Pick();


        myBoard.putBomb(myPick.pickX(), myPick.pickY());
        myBoard.printBoard();
    }
}
