package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
        if (board[i][i] == 1){
          if (checkColumn(board,i)||checkLine(board,i)){
              rsl = true;
          }
        }
        }
        return rsl;
    }
    private static boolean checkColumn(int[][] board, int column) {
        boolean answer = true;
        for (int i = 0; i < board.length; i++) {
            if(board[i][column] != 1){
                answer = false;
                break;
            }
          }
        return answer;
    }
    private static  boolean checkLine(int[][] board, int line) {
        boolean answer = true;
        for (int i = 0; i < board[line].length; i++) {
            if(board[line][i] != 1){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
/*
* Класс Win осуществляет проверку выигрышной комбинации на игровом поле. Делать будет это метод check:
* Лучше всего будет добавить еще 2 дополнительных метода, которые будут проверять строку
* и столбец на нашем игровом поле, которые мы будем вызывать в методе check() при определенных условиях*/