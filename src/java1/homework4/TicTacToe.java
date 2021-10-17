package java1.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = 'º';

    public static final String AI_WIN_MSG = "Победил компьютер!";
    public static final String HUMAN_WIN_MSG = "Победил человек!";
    public static final String DRAW_MSG = "Ничья!";


    private static final int SIZE=  5;
    private static final int SERIES =4;


    private static  char[][] map;
    private static  Scanner scanner;
    private static  Random random;

    public static void main(String[] args) {
        scanner =  new Scanner(System.in);
        random = new Random();

        initMap(); // первое построение поля
        printMap(); //печать игрового поля

        startGameLoop();
    }

    private static void startGameLoop() {
        while (true){
            humanTurn(); // Ход человека
            printMap(); //печать игрового поля
            if (checkEndGame(DOT_X)) break;

            aiTurn();
            printMap();
            if (checkEndGame(DOT_0)) break;
        }
    }

    private static boolean checkEndGame(char symbol) {
        if (isMapFull()) {
            System.out.println(DRAW_MSG);
            return true;
        }

        if (isWin(symbol)){
            System.out.println(getWinMessageBy(symbol));
            return true;
        }
        return false;
    }

    private static String getWinMessageBy(char symbol){

        // если символ Х, тогда HUMAN_WIN_MSG иначе AI_WIN_MSG
        return symbol == DOT_X ? HUMAN_WIN_MSG : AI_WIN_MSG;
    }
    private static boolean isWin(char symbol) {

        if (checkWinRows(symbol)) {
            return true;
        }

        if (checkWinCols(symbol)) {
            return true;
        }

        if (checkWinDiagonal(symbol)){
            return true;
        }

        return false;

    }

    private static boolean checkWinDiagonal(char symbol) {

        int i, j;
        int countSymbol = 0;
        int countSymbolDiagonal = 0;

        for (i = 0; i < map.length; i++) {
            for (j = 0; j < map.length; j++) {

                // диагональ #1 [00]
                if (i == j && map[i][j] == symbol){
                        countSymbol++;
                }

                // диагональ #2 [0][map.length]
                if (i + j == map.length - 1 && map[i][j] == symbol){
                    countSymbolDiagonal++;
                }
            }
        }

        if (countSymbol == SERIES || countSymbolDiagonal == SERIES) {
            System.out.println("Диагональ");
            return true;
        }
        return false;
    }

    private static boolean checkWinCols(char symbol) {
        int i, j;
        int countSymbol;

        // check cols
        for (j = 0; j < map.length; j++) {
           countSymbol = 0;

            for (i = 0; i < map.length; i++) {
                if (map[i][j] == symbol) {
                    countSymbol++;
                }
            }
            if (countSymbol == SERIES) {
                System.out.println("checkWinCols");
                return true;
            }
        }
        return false;
    }

    private static boolean checkWinRows(char symbol) {
        int i, j;
        int countSymbol;

        // check rows
        for (i = 0; i < map.length; i++){
            countSymbol = 0;

            for (j = 0; j < map[i].length; j++){
                if (map[i][j] == symbol){
                    countSymbol++;
                }
            }

            if (countSymbol == SERIES) {
                System.out.println("строка");
                return true;
            }

        }
        return false;
    }

    private static boolean isMapFull(){
        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++){
                if (isEmptyCell(row, col)){
                    return false;
                }
            }
        }
        return true;
    }
    private static void aiTurn() {
        int row, col;

        if (!interceptionOfVictoryFromAiRows() && !interceptionOfVictoryFromAiCols()) {

            do {
                row = random.nextInt(SIZE);
                col = random.nextInt(SIZE);
            } while (! isEmptyCell(row,col));

            map[row][col] = DOT_0;


        }

    }

    public  static boolean interceptionOfVictoryFromAiCols(){
        int i, j;
        int countSymbol;
        int row = 0;

        // check cols
        // перехват победы по колонке
        for (j = 0; j < map.length; j++) {
            countSymbol = 0;

            for (i = 0; i < map.length; i++) {
                if (map[i][j] == DOT_X) {
                    if (map[i][j] == DOT_X) {
                        countSymbol++;
                        row = i + 1;
                    } else {
                        countSymbol = 0;
                        row = 0;
                    }
                }
                if (countSymbol == SERIES - 1) {
                    if (row < map.length && isEmptyCell(row, j)) {
                        map[row][j] = DOT_0;
                        return true;
                    } else if (row - countSymbol > 0 && isEmptyCell((i - countSymbol), j)) {
                        map[row - countSymbol][j] = DOT_0;
                        return true;
                    }
                }
            }
        }
        return false;


    }


    private static boolean interceptionOfVictoryFromAiRows() {
        int i, j, col;
        int countSymbol;

        // check rows
        // перехват победы по строке

        for (i = 0; i < map.length; i++){
            countSymbol = 0;
            for (j = 0; j < map[i].length; j++){
                if (map[i][j] == DOT_X){
                    countSymbol++;
                    col = j;

                    if (countSymbol == SERIES-1) {
                        if (col + 1 < map.length &&isEmptyCell(i,(col + 1 ))) {
                            map[i][col+1] = DOT_0;
                            return true;
                        } else if (col - countSymbol > 0 && isEmptyCell(i,(col - countSymbol))){
                            map[i][col - countSymbol] = DOT_0;
                            return true;
                        }
                    }
                }
            }
        }
        return false;



    }

    private static void humanTurn() {
        System.out.println("Введите  координаты row col: ");
        int row = 0;
        int col = 0;
        do {
            row = readIndex();
            col = readIndex();

            if (!checkRange(row) || !checkRange(col)) {
                System.out.println("Координаты должны быть в диапазоне от 1 до " + SIZE);
                continue;
            }
            if (isEmptyCell(row -1, col -1)){
                break;
            } else {
                System.out.println("Клетка уже занята!");
            }

        } while (true);


        map[row -1][col -1] =  DOT_X;
    }

    private static boolean isEmptyCell (int row, int col){
        return map[row][col] == DOT_EMPTY;
    }

    private static int readIndex() {
        while (!scanner.hasNext()){
            System.out.println("Координаты должны иметь целочисленное значение!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static boolean checkRange(int index) {
        return  (index >= 1 && index <= SIZE);
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++){
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapSate();
        System.out.println();
    }

    private static void printMapSate() {
        for (int i = 0; i < map.length; i++){

            System.out.print(i+1 +" ");

            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMapHeader() {
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i +" ");
        }

        System.out.println();
    }
}
