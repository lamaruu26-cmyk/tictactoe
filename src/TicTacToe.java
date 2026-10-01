import javax.swing.border.EmptyBorder;

public class TicTacToe {
    public static void main(String[] args) {

        final int Size = 3;
        final char X = 'X';
        final char O = 'O';
        final char Empty = '-';

        char[][] borad = new char[3][3];
        int[][] filld = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        initialiseBoard(borad, Size, Empty);
    }

    static void initialiseBoard(char[][] borad, int Size, char Empty) {
        for (int r = 0; r < Size; r++) {
            for (int col = 0; col < Size; col++) {
                borad[r][col] = Empty;
            }
        }
    }
}

