package implementation;


import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void canAddLast() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(10);
        Assert.assertEquals(linkedList.last(), Integer.valueOf(10));

        linkedList.addLast(11);
        Assert.assertEquals(linkedList.last(), Integer.valueOf(11));

        linkedList.addLast(100);
        Assert.assertEquals(linkedList.last(), Integer.valueOf(100));

        linkedList.addLast(-10);
        Assert.assertEquals(linkedList.last(), Integer.valueOf(-10));
    }

    @Test
    public void canAddFirst() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(1);
        Assert.assertEquals(linkedList.first(), Integer.valueOf(1));

        linkedList.addFirst(5);
        Assert.assertEquals(linkedList.first(), Integer.valueOf(5));

        linkedList.addFirst(-1);
        Assert.assertEquals(linkedList.first(), Integer.valueOf(-1));

        linkedList.addFirst(100);
        Assert.assertEquals(linkedList.first(), Integer.valueOf(100));
    }

    @Test
    public void canRemoveFirst() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);

        Assert.assertEquals(linkedList.first(), Integer.valueOf(1));
        linkedList.removeFirst();
        Assert.assertEquals(linkedList.first(), Integer.valueOf(2));
    }

    @Test
    public void canRemoveLast() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);

        Assert.assertEquals(linkedList.last(), Integer.valueOf(4));
        linkedList.removeLast();
        Assert.assertEquals(linkedList.last(), Integer.valueOf(3));
    }

    @Test
    public void hasIterator() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        Integer check = 1;

        for (Integer i : linkedList) {
            Assert.assertEquals(i, check);
            check++;
        }
    }
}
