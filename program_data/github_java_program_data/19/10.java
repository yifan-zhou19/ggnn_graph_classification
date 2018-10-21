/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.s.opdr.pkg3.substring.search.en.regular.expressions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aschwin Bruyning
 */
public class KnuthMorrisPratt {

    private String pat;
    private int[][] dfa;
    private int teller = 0;
    int aantalVergelijking = 0;
    int aantal = 0;

    /**
     *
     * @param pat
     */
    public KnuthMorrisPratt(String pat) { // Build DFA from pattern.
        this.pat = pat;
        int M = pat.length();
        int R = 256;
        dfa = new int[R][M];
        dfa[pat.charAt(0)][0] = 1;
        for (int X = 0, j = 1; j < M; j++) { // Compute dfa[][j].
            for (int c = 0; c < R; c++) {
                dfa[c][j] = dfa[c][X]; // Copy mismatch cases.
            }
            dfa[pat.charAt(j)][j] = j + 1; // Set match case.
            X = dfa[pat.charAt(j)][X]; // Update restart state.
        }
    }

    /**
     *
     * @param txt
     * @return
     */
    public int search(String txt) { // Simulate operation of DFA on txt.
        int i;
        int j;
        int N = txt.length();
        int M = pat.length();
        int loopcounter = 0;
        int lastIndex = 0;
        int count = 0;

        for (i = 0, j = 0; i < N && j < M; i++) {
            j = dfa[txt.charAt(i)][j];

        }
        //Counting
        while (j != -1) {

            j = txt.indexOf(pat, j);
            teller++;

            if (j != -1) {
                count++;
                j += pat.length();
            }
        }
        return count;
    }
    
    public int getTeller() {
        return teller;
    }

}
