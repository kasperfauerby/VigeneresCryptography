package demo.domain;

public class Chart {

    char array[][] = {{'b', 'c', 'd', 'e', 'f','g'}};


    public void createChart(int x, int y, String letter){
     char chart[][] = new char[x][y];
     int index=0;
        for (int i = 0; i < x; i++) {
            chart[0][i]=letter.charAt(i);
            index++;
        }
    }

    public void printChart(char[][] chart){
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {

            }
        }
    }




}