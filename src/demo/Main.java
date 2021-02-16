package demo;

import demo.domain.Chart;

public class Main {

    public static void main(String[] args) {

        Chart chart = new Chart();
        char[][] array = chart.createChart();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
