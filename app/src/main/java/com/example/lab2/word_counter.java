package com.example.lab2;

import android.widget.Toast;

public class word_counter {
    public static int getWordsCount(String text) {
        int wordCount = 1;
        System.out.println(text.length());
        for (int i = 0; i<text.length(); i++) {
            if (String.valueOf(text.charAt(i)).equals(" ") || String.valueOf(text.charAt(i)).equals(".") || String.valueOf(text.charAt(i)).equals(",")) {
                wordCount++;
            }
        }
        return wordCount;
    }
}