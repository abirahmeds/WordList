package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Arraylist animalArr = new ArrayList(Arrays.asList("cat", "mouse", "frog", "dog" ,"dog"));

        WordList animals = new WordList(animalArr);

        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordsOfLength(4);
        System.out.println(animals);
    }
}