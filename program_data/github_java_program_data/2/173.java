package org.movie.commons.utils;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author amos
 * @version V0.1
 * @date Aug 27, 2016
 */
public class SkipList<E> extends AbstractList<E> implements List<E> {
    private static final int MAX_LEVEL = 32;
    private static final double OPTIMAL_P = 0.25;

    private Node<E> head;

    private double p = OPTIMAL_P;

    private int size;
    private int level;

    final Comparator<? super E> comparator;

    public SkipList() {
        comparator = null;
        head = new Node<>(null, MAX_LEVEL);

        level = 1;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        int lvl = getLevel();

        Object[] updates = getPreviousNodes(Math.max(this.level, lvl), e);

        if (this.level < lvl) {
            for (int i = this.level; i < lvl; i++) {
                updates[i] = head;
            }

            this.level = lvl;
        }

        Node<E> newNode = new Node<>(e, lvl);
        for (int i = 0; i < lvl; i++) {
            Node<E> update = (Node<E>) updates[i];

            newNode.levels[i] = update.levels[i];
            update.levels[i] = new Forward(newNode, 0);
        }

        size++;
        modCount++;

        return true;
    }

    private int cmp(E e1, E e2) {
        return comparator != null ? comparator.compare(e1, e2) : ((Comparable<E>) e1).compareTo(e2);
    }

    private Node<E> getNode(Forward f) {
        return f == null ? null : f.node();
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            modCount++;
            return true;
        }

        @SuppressWarnings("unchecked")
        E e = (E) o;

        Object[] updates = getPreviousNodes(this.level, e);

        for (int i = 0; i < this.level; i++) {
            @SuppressWarnings("unchecked")
            Node<E> update = (Node<E>) updates[i];
            Forward next = update.levels[i];

            if (next == null || cmp(getNode(next).value, e) > 0) {
                continue;
            }

            Node<E> nextNode = getNode(next);

            if (update == head && nextNode.levels[i] == null) {
                update.levels[i] = null;
                this.level--;
            } else {
                update.levels[i] = nextNode.levels[i];

                nextNode.levels[i] = null;
            }
        }

        size--;
        modCount++;

        return false;
    }

    private Object[] getPreviousNodes(int arrLen, E e) {
        Object[] nodes = new Object[arrLen];
        Node<E> cur = head;
        for (int i = this.level - 1; i >= 0; i--) {
            Forward next = cur.levels[i];

            while (next != null && cmp(getNode(next).value, e) < 0) {
                cur = getNode(next);
                next = cur.levels[i];
            }
            nodes[i] = cur;
        }

        return nodes;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.level; i++) {
            head.levels[i] = null;
        }
        modCount++;
        this.level = 1;
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);

        Node<E> cur = head.levels[0].node();

        int curIdx = 0;
        while (curIdx < index) {
            cur = cur.levels[0].node();

            curIdx++;
        }


        return cur.value;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    private int getLevel() {
        int lvl = 1;
        while (lvl < MAX_LEVEL && Math.random() < p) {
            lvl++;
        }
        return lvl;
    }

    public void print() {
        for (int i = this.level - 1; i >= 0; i--) {
            Node<E> cur = this.head;
            while (cur != null) {
                System.out.print(String.valueOf(cur.value) + "->");
                cur = getNode(cur.levels[i]);
            }
            System.out.println("END");
        }

    }

    private static class Node<E> {
        E value;
        Forward[] levels;

        public Node(E value, int level) {
            this.value = value;

            levels = new Forward[level];
        }
    }

    private static class Forward {
        Object nod;
        int span;

        public Forward(Object node, int span) {
            this.nod = node;
            this.span = span;
        }

        public <E> Node<E> node() {
            return (Node<E>) nod;
        }
    }
}
