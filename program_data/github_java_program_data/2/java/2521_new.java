package me.zerois.datastruct.sort;

/**
 * 冒泡排序
 * 算法： 1.从最左边开始，依次比较相邻元素大小，若右边大，则交换，一直到最后一个元素，这样最大元素在最右边，右边保持有序
 * 2.下一轮继续在剩下的元素中，采用1过程
 * <p>
 * 时间复杂度，两个for循环：n * n ,因此时间复杂度o(n^2)
 * 稳定性：不稳定
 * 不变性：大于outer的元素都是有序的
 *
 * @author 李文军 wenjun.li1@renren-inc.com.
 * @since 14-3-26 10:41
 */
public class BubbleSort extends AbstractSort {

    protected BubbleSort(int size) {
        super(size);
    }

    /**
     * 冒泡排序
     */
    public void sort() {
        //大于out的都是有序的
        for (int out = nElems - 1; out > 0; out--) {
            for (int inner = 0; inner < out; inner++) {
                if (data[inner] > data[inner + 1]) {
                    swap(data, inner, inner + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(10);
        bubbleSort.insert(10);
        bubbleSort.insert(8);
        bubbleSort.insert(9);
        bubbleSort.insert(3);
        bubbleSort.insert(2);
        bubbleSort.insert(5);
        bubbleSort.insert(1);
        bubbleSort.insert(7);
        bubbleSort.display();

        bubbleSort.sort();
        System.out.println("after sort:");
        bubbleSort.display();
    }
}
