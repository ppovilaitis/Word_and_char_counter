package com.example.lab2;

import android.widget.Toast;

public class word_counter {
    public static int getWordsCount(String text) {
        int temp=0;
        String[] words =text.trim().split("\\s+");
        return (words.length);
    }
}