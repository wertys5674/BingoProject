package Bingo;

import java.util.Scanner;

public class Pick {
    Scanner scanner = new Scanner(System.in);

    int pickX() {
        System.out.print("폭탄을 넣을 좌표의 x값을 입력해주세요(1~5) >>");
        int x = Integer.parseInt(scanner.next());
        if (x < 1 || x > 5)
            throw new IllegalArgumentException("1~5 사이의 숫자를 입력해주세요.");
        return x - 1;
    }

    int pickY() {
        System.out.print("폭탄을 넣을 좌표의 y값을 입력해주세요()1~5 >>");
        int y = Integer.parseInt(scanner.next());
        if (y < 1 || y > 5)
            throw new IllegalArgumentException("1~5 사이의 숫자를 입력해주세요.");
        return y - 1;
    }
}
