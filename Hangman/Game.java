package Hangman;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class Game {

    public void chooseLevel() {
        int noofguesses;
        String level;
        int levelchoose = 0;

        Scanner scanner = new Scanner(System.in);
        levelchoose = scanner.nextInt();

        switch (levelchoose) {
        case 1:
            System.out.print("1.Easy  ");
            level = "Easy";
            noofguesses = 10;
            break;
        case 2:
            System.out.print("2.Medium ");
            level = "Medium";
            noofguesses = 15;
            break;
        case 3:
            System.out.print("3.Hard ");
            level = "Hard";
            noofguesses = 20;
            break;
        default:
            noofguesses = 10; // by default it will select easy level.
            break;
        // static Scanner.close();

        }
    }

    public boolean iswordGuessed(String seceretWord, char[] lettersGuessed) {
        int count = 0;
        for (int i = 0; i < lettersGuessed.length; i++) {
            for (int j = 0; j < seceretWord.length(); j++) {
                if (lettersGuessed[i] == seceretWord.charAt(j)) {
                    count++;
                }

            }

        }
        for (int i = 0; i < seceretWord.length(); i++) {
            if (seceretWord.charAt(i) == ' ') {
                count++;
            }
        }
        if (count == seceretWord.length()) {
            return true;
        }
        return false;
    }

    public String getAvailableLetters(char[] lettersGuessed) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < lettersGuessed.length; i++) {
            alpha = alpha.replace(lettersGuessed[i], ' ');
        }
        return alpha;
    }

    public char[] getWordGuessed(String seceretWord, char[] lettersGuessed) {
        String word = "";
        for (int i = 0; i < seceretWord.length(); i++) {
            if (seceretWord.charAt(i) == ' ') {
                word = word + " ";
            } else {
                word = word + "_";
            }
        }
        System.out.println(word);

        char[] w = word.toCharArray();
        for (int i = 0; i < lettersGuessed.length; i++) {
            for (int j = 0; j < seceretWord.length(); j++) {
                if (seceretWord.charAt(j) == lettersGuessed[i]) {
                    w[j * 2] = seceretWord.charAt(j);
                    word = String.valueOf(w);
                }

            }

        }
        return w;

    }

    // public void randomMovie() {
    // Path path = Paths.get("D:\\OOPS_2019501077\\Hangman");
    // Scanner scanner = new Scanner(path);
    // System.out.println("Read text file using Scanner");
    // // read line by line
    // while (scanner.hasNextLine()) {
    // // process each line
    // String line = scanner.nextLine();

    // }
    // scanner.close();

    // }

}