package vpe.project.huffman;

import vpe.project.huffman.tree.HuffmanLeaf;
import vpe.project.huffman.tree.HuffmanNode;
import vpe.project.huffman.tree.HuffmanTree;

import java.util.*;

/**
 * Class HuffmanCoding performs all the operations needed in the Huffman coding algorithm.
 *
 * @author Oana Maria Teodorescu
 */
public class HuffmanCoding {
    /**
     * The ASCII character limit.
     */
    private final static int CHAR_LIMIT = 128;

    /**
     * An array with the frequencies of characters whose index are the ASCII codes of the characters
     * from 0 to {@value vpe.project.huffman.HuffmanCoding#CHAR_LIMIT}.
     */
    private int[] frequency;

    /**
     * A priority queue with the available trees at each step of the Huffman coding algorithm.
     */
    private PriorityQueue<HuffmanTree> trees;

    /**
     * The set of characters in the encoded text.
     */
    private HashSet<Character> characterSet;

    /**
     * Creates a new instance of the algorithm.
     */
    public HuffmanCoding() {
        frequency = new int[CHAR_LIMIT];
        trees = new PriorityQueue<HuffmanTree>();
        characterSet = new HashSet<Character>();
    }

    /**
     * Gets the set of characters present in the analyzed text.
     * <p>
     * Internally called by {@link vpe.project.globals.Helper#generateInitialTable}.
     *
     * @return the character set of the analyzed text
     */
    public HashSet<Character> getCharacterSet() {
        return characterSet;
    }

    /**
     * Gets the frequency of a character in the text.
     * <p>
     * Internally called by {@link vpe.project.globals.Helper#generateInitialTable}.
     *
     * @param c the character whose frequency is requested
     * @return an integer representing the number of occurrences of the character in the text
     */
    public int getFrequencyOf(char c) {
        return frequency[c];
    }


    /**
     * Computes the frequency for each symbol that appears in the text.
     * <p>
     * Internally called by {@link vpe.project.globals.Helper#generateInitialTable}.
     *
     * @param text  the text for which the computation occurs
     */
    public void computeFrequencies(String text) {
        for(char ch : text.toCharArray()) {
            frequency[ch]++;
            characterSet.add(ch);
        }

        for(Character c : characterSet) {
            trees.offer(new HuffmanLeaf(frequency[c], c));
        }
    }

    /**
     * Performs a merge step between the least frequent root nodes of the trees
     * and returns the merged tree.
     * <p>
     * Internally called by {@link #buildTree} and {@link vpe.project.globals.Helper#nextUpdate}.
     *
     * @return  a {@link HuffmanTree} object having the frequency as the sum of the frequencies of the two trees merged
     * @throws java.lang.IllegalArgumentException if tree doesn't exist or has no more steps
     */
    public HuffmanTree nextTree() {
        if (trees.size() == 0)
            throw new IllegalArgumentException("Tree does not exist or no tree left!");

        if (trees.size() == 1)
            throw new IllegalArgumentException("No step remaining! Final tree built.");

        if (trees.size() > 1) {
            HuffmanTree tree1 = trees.poll();
            HuffmanTree tree2 = trees.poll();

            HuffmanTree mergeTrees = new HuffmanNode(tree1, tree2);

            trees.offer(mergeTrees);

            return mergeTrees;
        } else {
            return trees.poll();
        }
    }

    /**
     * Checks if the Huffman encoding algorithm has any more steps (did not end).
     * <p>
     * Internally called by {@link vpe.project.globals.Helper#isFinal}.
     *
     * @return  {@code true} if more steps, {@code false} if algorithm ended
     */
    public boolean hasSteps() {
        return trees.size() > 1;
    }

    /**
     * Builds the entire Huffman tree with no intermediary steps.
     *
     * @return  a {@link HuffmanTree} object containing needed information to build the Huffman tree
     *          ({@link HuffmanLeaf} and {@code HuffmanNode} nodes)
     *
     * @see vpe.project.huffman.tree.HuffmanTree
     * @see vpe.project.huffman.tree.HuffmanNode
     * @see vpe.project.huffman.tree.HuffmanLeaf
     */
    public HuffmanTree buildTree() {
        HuffmanTree tree = null;
        while(trees.size() > 0)
            tree = nextTree();
        return tree;
    }

    /**
     * Get a list of the trees to be drawn at a specific step.
     * <p>
     * Internally called by {@link vpe.project.globals.Helper#generateInitialTable}
     * and {@link vpe.project.globals.Helper#nextUpdate}.
     *
     * @return a list of {@link vpe.project.huffman.tree.HuffmanTree} to be drawn
     */
    public List<HuffmanTree> getTreesToDraw() {
        return new ArrayList<HuffmanTree>(trees);
    }

    /**
     * Clears trees involved in Huffman tree generation.
     * <p>
     * Internally called by {@link #reset}.
     */
    protected void clearHuffmanTree() {
        trees.clear();
    }

    /**
     * Resets the frequencies of the symbols.
     * <p>
     * Internally called by {@link #reset}.
     */
    protected void resetFrequencies() {
        Arrays.fill(frequency, 0);
    }

    /**
     * Clears/Resets the data needed for the algorithm.
     * <p>
     * Internally called by {@link vpe.project.globals.Helper#reset}.
     */
    public void reset() {
        clearHuffmanTree();
        resetFrequencies();
        characterSet.clear();
    }
}
