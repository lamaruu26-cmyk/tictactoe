import javax.swing.border.EmptyBorder;

public class TicTacToe {
    public static void main(String[] args) {

        final int Size = 3;
        final char X = 'X';
        final char O = 'O';
        final char Empty = '-';

        char[][] borad = new char[3][3];

        initialiseBoard(borad, Size, Empty);


    }

    static void initialiseBoard(char[][] borad, int Size, char Empty) {
        for (int r = 0; r < Size; r++) {
            for (int col = 0; col < Size; col++) {
                borad[r][col] = Empty;
            }
        }
    }
    static void displayBoard(){
        for (int r = 0; r < 3; r++){
            for (int col = 0; col < 3; col++){

            }
        }
    }

}

