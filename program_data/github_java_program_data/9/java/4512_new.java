package me.zerois.datastruct.sort;

/**
 * @author 李文军 wenjun.li1@renren-inc.com.
 * @since 14-3-31 16:05
 */
public class QuickSort {

    private Partition partition;

    public QuickSort(int size) {
        partition = new Partition(size);
    }

    public void insert(int value) {
        partition.insert(value);
    }

    public void sort(int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition.value(right);
        int partition = this.partition.rePartition(left, right, pivot);
        System.out.println("pivot:" + partition);
        sort(left, partition - 1);
        sort(partition + 1, right);
    }

    public void display() {
        partition.display();
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(8);
        quickSort.insert(49);
        quickSort.insert(34);
        quickSort.insert(56);
        quickSort.insert(10);
        quickSort.insert(5);
        quickSort.insert(38);

        quickSort.sort(0, quickSort.partition.size() - 1);

        quickSort.display();
    }
}
