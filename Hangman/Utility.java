package Hangman;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Utility {
    // Java Program to illustrate reading from Text File
    // using Scanner Class

    public static void main(String[] args) throws IOException {
        // pass the path to the file as a parameter
        File file = new File("D:\\OOPS_2019501077\\Hangman\\movies.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        sc.close();
    }
}
