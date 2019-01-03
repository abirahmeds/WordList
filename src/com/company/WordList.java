package com.company;


public class WordList {
    public int numWordsOfLength(int len) {
        int count = 0;
        for (String words : myList) {
            if (words.length() == len) {
                count++;
            }
        }
    }

    public void removeWordsOfLength(int len){
        for(int i = myList.size()-1; i >= 0; i--){
            if(myList.get(i).length() == len){
                myList.remove(i);
            }
        }
    }
}