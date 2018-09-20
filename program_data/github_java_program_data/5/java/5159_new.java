package edu.msergey.jalg.dynamic;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TopDownUniqueKnapsackTest {
    @Test
    public void shouldReturn4WhenCapacity3() throws Exception {
        TopDownUniqueKnapsack knapsack = new TopDownUniqueKnapsack(constructItems(), 3);

        long actual = knapsack.evalHighestValue();

        // A should be used
        assertThat(actual).isEqualTo(4);
    }

    @Test
    public void shouldReturn0WhenCapacity2() throws Exception {
        TopDownUniqueKnapsack knapsack = new TopDownUniqueKnapsack(constructItems(), 2);

        long actual = knapsack.evalHighestValue();

        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void shouldUseUniqueItems() throws Exception {
        TopDownUniqueKnapsack knapsack = new TopDownUniqueKnapsack(constructItems(), 18);

        long actual = knapsack.evalHighestValue();

        // [A,C,E], not the [E,E]
        assertThat(actual).isEqualTo(25);
    }

    @Test
    public void shouldComputeOnlyNeededValues() throws Exception {
        TopDownUniqueKnapsack knapsack = new TopDownUniqueKnapsack(constructItems(), 18);
        knapsack.evalHighestValue();

        assertThat(knapsack.knownHighestValues).hasSize(5);
        assertThat(knapsack.knownHighestValues.get(0).size()).isLessThan(18);
    }

    @Test
    public void shouldUseEqualItems() throws Exception {
        KnapsackItem[] items = new KnapsackItem[] {
                new KnapsackItem(1, 1),
                new KnapsackItem(1, 1)
        };
        TopDownUniqueKnapsack knapsack = new TopDownUniqueKnapsack(items, 2);
        long actual = knapsack.evalHighestValue();

        assertThat(actual).isEqualTo(2);
    }

    private static KnapsackItem[] constructItems() {
        KnapsackItem[] items = new KnapsackItem[] {
            new KnapsackItem(3, 4),
            new KnapsackItem(4, 5),
            new KnapsackItem(7, 10),
            new KnapsackItem(8, 11),
            new KnapsackItem(9, 13)
        };
        return items;
    }

    public static void main(String[] args) {
        TopDownUniqueKnapsack knapsack = DataHelper.loadData("knapsack2.txt");
        long value = knapsack.evalHighestValue();
        System.out.println(value);
        // knapsack1 2493893
        // knapsack2 2595819
    }
}
