package Sudoku;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        Scanner scanner = new Scanner(System.in);

        while (!sudoku.isComplete()) {
            sudoku.printBoard();
            System.out.println("Digite a linha (0-8), coluna (0-8) e valor (1-9), separados por espaço:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            int num = scanner.nextInt();

            if (sudoku.placeNumber(row, col, num)) {
                System.out.println("Número inserido com sucesso!");
            } else {
                System.out.println("Movimento inválido. Tente novamente.");
            }
        }

        System.out.println("Parabéns! Você completou o Sudoku!");
        scanner.close();
    }
}
