package com.michaelaerni.fhnw.dist.bloomfilter;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Bloomfilter {
    private final HashFunction[] hashes;
    private final BitSet bitArray;

    private final int m;
    private final int k;

    /**
     * Creates a bloomfilter that expects n words in the set and should have a false positive rate of p.
     * The words must be added with separate functions.
     *
     * The false-positive rate is only achievable if there are less than n words in the set.
     *
     * @param n
     * @param p
     */
    public Bloomfilter(int n, double p) {
        Random rand = new Random();
        final double ln2 = Math.log(2);

        // calculates m and k according to the formula on wikipedia
        // https://en.wikipedia.org/wiki/Bloom_filter#Optimal_number_of_hash_functions
        m = (int) Math.ceil(- ((n * Math.log(p))/(ln2 * ln2)));
        k = (int) Math.ceil((m/(double)n) * ln2);

        // get k different hash-function
        hashes = new HashFunction[k];
        for (int i = 0; i < k; i++)
        {
            hashes[i] = getHashFunction(rand.nextInt());
        }

        // get an empty bit-array
        bitArray = new BitSet(m);


        System.out.println("n: " + n);
        System.out.println("m: " + m);
        System.out.println("k: " + k);
        System.out.println("p: " + p);
    }

    /**
     * Adds a single word to the current set.
     *
     * @param word
     */
    public void addWord(String word)
    {
        // for each Hash-Function: Calculate an index and set it's bit to one
        for (int i = 0; i < k; i++)
        {
            bitArray.set(getIndex(word, i), true);
        }
    }

    /**
     * Tests if a given word can be in the set.
     *
     * A word can be in the set only if all bits at position calculated form the
     *
     * @param word
     *  The word to test
     * @return
     */
    public boolean isProbablyInSet(String word)
    {
        boolean result = true;
        for (int i = 0; i < k; i++)
        {
            result &= bitArray.get(getIndex(word, i));
        }

        return result;
    }

    /**
     * Calculates the index for a given word for the Hash-function i
     *
     * The index is calculated by calculating (Hash MOD m)
     *
     * @param word
     * @param i
     * @return
     */
    private int getIndex(String word, int i) {
        int index = (hashes[i].hashString(word, Charset.defaultCharset()).asInt() % m);
        return (index >= 0)
                ? index
                : -index;
    }

    private static HashFunction getHashFunction(int seed) {
        return Hashing.murmur3_128(seed);
    }

    /**
     * Adds all words to the current set.
     *
     * @param words
     */
    public void fillInitialValues(Stream<String> words) {
        bitArray.clear();
        words.forEach(s -> addWord(s));
    }
}
