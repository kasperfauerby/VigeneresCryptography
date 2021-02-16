package demo.domain;

public class Chart {


    public static char[][] createChart() {

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[][] matrix = new char[alphabet.length][alphabet.length];

        int index;


        //Loopet laver Vigeneres matrix 1 række ad gangen.
        //For hver række forskydes alphabetets start bogstav med 1.
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {

                //index er positionen i alphabet[]
                index = i + j;

                //Når en række er nået til sidste bogstav i alphabet[] 'z' går den tilbage til 'a'.
                if (index >= alphabet.length) {
                    index = index - alphabet.length;
                }
                //Positionens bogstav indskrives
                matrix[i][j] = alphabet[index];
            }
        }
        return matrix;
    }
}


