package com.dictionary;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DictionaryController {

    public static void main(String[] args) {
        String randomStringValues;
        String polishWord;
        String exitWord = "gameover";

        int round = 0;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        Library library = new Library();     //odnosnik do klasy Library,
                                // za pomoca nowego obiektu, tak, bysmy mogli odnosic sie z jego pomoca do tego co sie znajduje w klasioe obok


        List<String> listOfValues = new ArrayList<String>(library.getDictionary().values());

        System.out.println("To jest Super gra słownikowa. Aby zakonczyć grę wpisz słowo gameover.");

        do {

            randomStringValues = listOfValues.get(random.nextInt(listOfValues.size()));

            System.out.println("\nSłówko po Angielsku:");

            System.out.println(randomStringValues);

            System.out.println("Podaj tłumaczenie po Polsku: ");

            polishWord = scanner.nextLine();


            if (library.getDictionary().containsKey(polishWord)) {

                round++;

                System.out.println("dobrze, + 1pkt. masz : " + round + " pkt");

            } else if (polishWord.equals(exitWord)) {

                System.out.println("Dzięki za grę. Uzyskałeś " + round + " pkt");

            } else {

                round--;

                System.out.println("źle, minus 1pkt, masz : " + round + " pkt");
            }
        }
        while (!polishWord.equals(exitWord));

    }
}







